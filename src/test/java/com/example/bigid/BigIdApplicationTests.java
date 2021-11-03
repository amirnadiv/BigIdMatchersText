package com.example.bigid;

import com.example.bigid.model.MyCounter;
import com.example.bigid.readers.NiceFileReader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@ComponentScan
class BigIdApplicationTests {


    @Autowired
    NiceFileReader niceFileReader;

    @Test
    void testMain() throws Exception {



        int numberOfThreads = 2;
        ExecutorService service = Executors.newFixedThreadPool(10);
        CountDownLatch latch = new CountDownLatch(numberOfThreads);
        MyCounter counter = new MyCounter();
        for (int i = 0; i < numberOfThreads; i++) {
            service.submit(() -> {
                counter.increment();
                latch.countDown();
            });
        }
        latch.await();
        assertEquals(numberOfThreads, counter.getCount());


    }


    @Test
    void testMain2() throws Exception {

        niceFileReader.searchStringInFile("Timothy");


    }

}
