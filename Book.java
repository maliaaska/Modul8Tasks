package com.milewskiarkadiuszmodul8.asmilewskiModul8;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String name;
    private String[] authors;
    private double price;
    private int quantity;

    public Book(String name, String[] authors, double price, int quantity) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }

    public void getTotalPrice() {
        double price1 = this.price;
        int quantity1 = this.quantity;
        double TotalPrice = price1 * quantity1;
        System.out.println("Total price of all books is " + TotalPrice);
    }

    public boolean isAvailable(String n) {
        if ( n.equals(name)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Double.compare(price, book.price) == 0 && quantity == book.quantity && Objects.equals(name, book.name) && Arrays.equals(authors, book.authors);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}


