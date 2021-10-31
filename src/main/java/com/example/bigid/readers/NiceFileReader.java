package com.example.bigid.readers;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class NiceFileReader implements Reader {

    @Value("inputFilePath")
    String inputFilePath;


    public void readAll() throws IOException, URISyntaxException {

//
//        final AtomicInteger c = new AtomicInteger();
//        Files.lines(new File(new URI("http://norvig.com/big.txt")).toPath())
//                .collect(Collectors.groupingBy(e -> c.getAndIncrement()))
//                .forEach((integer, strings) -> System.out.println(strings.stream().findFirst()));



        LineIterator it = FileUtils.lineIterator(new File(new URI("http://norvig.com/big.txt")), "UTF-8");
        try {
            while (it.hasNext()) {
                String line = it.nextLine();
                //if (line.contains(stringToCheck))
                System.out.println(line);
            }
        } finally {
            LineIterator.closeQuietly(it);
        }

    }




    }

