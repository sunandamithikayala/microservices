package com.book.example;

public class Main {
    public static void main(String[] args) {
        DatabasePersistence db = new BookDatabaseImpl();
        BookPersistenceManager manager = new BookPersistenceManager(db);

        // Creating books
        Book book1 = new BookImpl("Java Programming", "John Doe", 450);
        Book book2 = new BookImpl("Python Basics", "Jane Smith", 300);

        // Saving books
        manager.saveBook(book1);
        manager.saveBook(book2);

        // Displaying all books
        manager.displayAllBooks();
    }
}

