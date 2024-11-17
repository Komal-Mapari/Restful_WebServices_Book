package com.cjc.app.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.model.Book;
import com.cjc.app.service.BookService;

@RestController
public class bookController {

	private BookService service;

	public bookController(BookService service) {
		super();
		this.service = service;
	}

	@PostMapping(value = "/saveBook")
	public Book saveBook(@RequestBody Book book) {
		Book book1 = service.saveBook(book);
		return book1;
	}

	@GetMapping(value = "/getBook/{id}")
	public Book getBook(@PathVariable int id) {
		Book book = service.getBook(id);
		return book;
	}

	@GetMapping(value = "/getBooks")
	public List<Book> getAllBook() {
		List<Book> booklist = service.getAllBooks();
		return booklist;
	}

	@DeleteMapping(value = "/deleteBook/{id}")
	public List<Book> deleteBook(@PathVariable int id) {
		List<Book> booklist = service.deleteBook(id);
		return booklist;
	}

	@PutMapping(value = "/updateBook")
	public Book updateBook(@RequestBody Book book) {
		System.out.println("book is good");
		System.out.println(book);
		Book b = service.saveBook(book);
		return b;
	}
}
