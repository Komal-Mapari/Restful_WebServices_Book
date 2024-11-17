package com.cjc.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cjc.app.model.Book;
import com.cjc.app.repository.BookRepository;
import com.cjc.app.service.BookService;

@Service
public class BookServiceIMPL implements BookService {

	private BookRepository repository;

	public BookServiceIMPL(BookRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Book saveBook(Book book) {
		Book book2 = repository.save(book);
		return book2;
	}

	@Override
	public Book getBook(int id) {
		Optional<Book> optional = repository.findById(id);
		if (optional.isPresent()) {
			Book book = optional.get();

			return book;
		}

		return null;

	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> list = repository.findAll();
		return list;
	}

	@Override
	public List<Book> deleteBook(int id) {
		repository.deleteById(id);
		return getAllBooks();
	}
}
