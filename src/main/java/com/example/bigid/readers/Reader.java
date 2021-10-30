package com.example.bigid.readers;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Reader {

    List<String> readAll(File file) throws IOException;
}
