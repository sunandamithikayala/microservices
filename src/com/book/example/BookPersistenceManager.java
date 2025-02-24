package com.book.example;

import java.util.List;

public class BookPersistenceManager {
    private DatabasePersistence database;

    public BookPersistenceManager(DatabasePersistence database) {
        this.database = database;
    }

    public void saveBook(Book book) {
        database.save(book);
        System.out.println("Book saved: " + book.getTitle());
    }

    public void displayAllBooks() {
        List<Book> books = database.getAllBooks();
        System.out.println("\nBooks in database:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (" + book.getPages() + " pages)");
        }
    }
}

