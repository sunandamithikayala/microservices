package com.d;

import java.io.IOException;

public class StringProcessor {
    private final Readable reader;
    private final Writable writer;

    public StringProcessor(Readable reader, Writable writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void processString() {
        try {
            String data = reader.read(); // ✅ Correctly reads data
            writer.write(data); // ✅ Correctly writes data
        } catch (IOException e) {
            System.out.println("Error processing string: " + e.getMessage());
        }
    }
}
