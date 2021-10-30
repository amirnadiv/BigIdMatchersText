package com.example.bigid.readers;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Component;


@Component
public class NiceFileReader implements Reader {


    public List<String> readAll(File file) throws IOException {



        return new CsvToBeanBuilder(new FileReader(file))
                .withType(String.class)
                .build()
                .parse();

    }
}
