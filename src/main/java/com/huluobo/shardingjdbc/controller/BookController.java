package com.huluobo.shardingjdbc.controller;

import com.huluobo.shardingjdbc.entity.Book;
import com.huluobo.shardingjdbc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping(value="/book")
    public List<Book> getItems() {
        return bookService.getBookList();
    }

    @RequestMapping(value="/save")
    public Boolean saveItem(Book book) {
        return bookService.save(book);
    }

}
