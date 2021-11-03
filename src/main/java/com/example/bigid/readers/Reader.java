package com.example.bigid.readers;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public interface Reader {

    void searchStringInFile(String searchString) throws IOException, URISyntaxException;
}
