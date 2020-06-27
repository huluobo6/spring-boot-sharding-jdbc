package com.huluobo.shardingjdbc.service;

import com.huluobo.shardingjdbc.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getBookList();

    boolean save(Book book);
}
