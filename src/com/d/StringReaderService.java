package com.d;

import java.io.StringReader;
import java.io.IOException;

public class StringReaderService implements Readable {
    private final StringReader stringReader;

    public StringReaderService(String data) {
        this.stringReader = new StringReader(data);
    }

    @Override
    public String read() throws IOException {
        int data;
        StringBuilder result = new StringBuilder();
        while ((data = stringReader.read()) != -1) {
            result.append((char) data);
        }
        return result.toString();
    }
}

