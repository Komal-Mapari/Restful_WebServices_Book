package com.cjc.app.service;

import java.util.List;

import com.cjc.app.model.Book;

public interface BookService {

	Book saveBook(Book book);

	Book getBook(int id);

	List<Book> getAllBooks();

	List<Book> deleteBook(int id);

}
