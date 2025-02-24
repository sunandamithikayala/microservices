package com.book.example;

public class BookImpl implements Book {
    private String title;
    private String author;
    private int pages;

    public BookImpl(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getPages() {
        return pages;
    }
}

