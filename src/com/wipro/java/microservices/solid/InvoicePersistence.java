package com.wipro.java.microservices.solid;

import java.io.FileWriter;
import java.io.IOException;

public class InvoicePersistence {
    public void saveToFile(Invoice invoice, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(invoice.quantity + "x " + invoice.book.name + "\t\t" + invoice.book.price + "\n");
            writer.write("Discount Rate: " + invoice.discountRate + "\n");
            writer.write("Tax Rate: " + invoice.taxRate + "\n");
            writer.write("Total: " + invoice.total + "\n");
            System.out.println("Invoice saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving invoice: " + e.getMessage());
        }  
    }  
}
