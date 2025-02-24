package com.book.example;

import java.util.ArrayList;
import java.util.List;

public class BookDatabaseImpl implements DatabasePersistence {
    private List<Book> bookList = new ArrayList<>();

    @Override
    public void save(Book book) {
        bookList.add(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookList;
    }
}
