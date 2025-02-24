package com.d;

import java.io.StringWriter;
import java.io.IOException;

public class StringWriterService implements Writable {
    private final StringWriter stringWriter;

    public StringWriterService() {
        this.stringWriter = new StringWriter();
    }

    @Override
    public void write(String data) throws IOException {
        stringWriter.write(data);
        System.out.println("Processed String: " + stringWriter.toString());
    }
}
