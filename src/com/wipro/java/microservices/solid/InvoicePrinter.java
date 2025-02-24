package com.wipro.java.microservices.solid;

public class InvoicePrinter {
    public void print(Invoice invoice) {
        System.out.println(invoice.quantity + "x " + invoice.book.name + "\t\t" + invoice.book.price);
        System.out.println("Author: " + invoice.book.authorName);
        System.out.println("Year: " + invoice.book.year);
        System.out.println("ISBN: " + invoice.book.isbn);
        System.out.println("Discount Rate: " + invoice.discountRate);
        System.out.println("Tax Rate: " + invoice.taxRate);
        System.out.println("Total: " + invoice.total);
    }
}
