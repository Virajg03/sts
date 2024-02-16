package com.api.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.entity.Book;
//import com.api.book.repository.BookRepository;

@RestController
@RequestMapping("/home")
public class BookRestController {
	
//	@Autowired
//	private BookRepository bookRepository;
	
	@PostMapping("/create")
	public List<Book> createBook(int id)
	{
		System.out.println("rest 1");
		return null;
		
	}
	
	
}
