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

    @Value("${inputFilePath}")
    String inputFilePath;


    public void searchStringInFile(String searchString) throws IOException {
        int lineCounter=0;
        LineIterator it = FileUtils.lineIterator(new File(inputFilePath));
        try {
            while (it.hasNext()) {
                lineCounter++;
                String line = it.nextLine();
                int indexOfSearchString = line.indexOf(searchString);
                if (indexOfSearchString >=0)
                {System.out.println(searchString+lineCounter+ indexOfSearchString);}
            }
        } finally {
            LineIterator.closeQuietly(it);
        }

    }




    }

