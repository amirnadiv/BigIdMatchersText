package com.example.bigid.readers;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public interface Reader {

    void readAll() throws IOException, URISyntaxException;
}
