package com.d;

public class Main {
    public static void main(String[] args) {
        Readable reader = new StringReaderService("Hello, SOLID Principles!");
        Writable writer = new StringWriterService();

        StringProcessor processor = new StringProcessor(reader, writer);
        processor.processString();
    }
}

