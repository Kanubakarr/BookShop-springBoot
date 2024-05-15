package com.bookshop.booksopmanagement.bookshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookshopService {


    @Autowired
    private BookRepository bookRepository;

//    public List<Book> getAllBooks() {
//        return bookRepository.findAll();
//    }

    public List<Book> getAllBooks() {
        return List.of(new Book(1, "C++", "TI", 200.0, 20));
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
}
