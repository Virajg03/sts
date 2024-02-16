package com.rest.api.book.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

import com.rest.api.book.dao.BookRepository;
import com.rest.api.book.entities.Book;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
//	private static List<Book> list = new ArrayList<>();
//
//	static {
//		list.add(new Book(12, "c++", "ABC"));
//		list.add(new Book(13, "java", "XYZ"));
//		list.add(new Book(14, "pythjon", "PQL"));
//	}

	public List<Book> getAllBooks() {
		List<Book> list = bookRepository.findAll();
		return list;
	}

	public Book getBookById(int id) {
		Book book = null;
		try {
//			book = list.stream().filter(e -> e.getId() == id).findFirst().get();
			book = bookRepository.findById(id);
			return book;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return book;
	}

	// creating the book
	public Book addBook(Book b) {
		Book result = bookRepository.save(b);
		return result;
	}

	// delete book
	public void deleteBook(int id) {

//		list = list.stream().filter(e -> e.getId() != id).collect(Collectors.toList());
		
		bookRepository.deleteById(id);
	}

	// update book
	public void updateBook(Book book, int id) {
//          list.stream().map(b -> {
//			if (b.getId() == id) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(b.getAuthor());
//			}
//			return b;
//		}).collect(Collectors.toList());
		
		book.setId(id);
		
		bookRepository.save(book);
	}
}
