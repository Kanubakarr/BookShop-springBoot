package com.bookshop.booksopmanagement.bookshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/api/books")
public class BookshopController {

    @Autowired
    private BookshopService bookshopService;

    public BookshopController(BookshopService bookshopService) {
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookshopService.getAllBooks();
    }
}
