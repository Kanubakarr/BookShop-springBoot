package com.bookshop.booksopmanagement.bookshop;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    Integer quantity;
    private String title;
    private String author;
    private Double price;

    public Book() {
    }

    public Book(int id,String title, String author, Double price, Integer quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

//    public Book(String title, String author, double price, int quantity) {
//    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }


    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: NLE" + price + ", Quantity: " + quantity);
    }

    @Override
    public String toString() {
        return "Book{" +
                "quantity=" + quantity +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

