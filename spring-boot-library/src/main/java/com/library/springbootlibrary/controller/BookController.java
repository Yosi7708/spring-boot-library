package com.library.springbootlibrary.controller;

import com.library.springbootlibrary.entity.Book;
import com.library.springbootlibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService theBookService) {
        bookService = theBookService;
    }

    @PutMapping("/secure/checkout")
    public Book checkoutBook(@RequestParam Long bookId) throws Exception {
        String userEmail = "testuser@email.com";
        return bookService.checkoutBook(userEmail, bookId);
    }

}



