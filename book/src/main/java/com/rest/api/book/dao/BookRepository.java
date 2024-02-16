package com.rest.api.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.book.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	public Book findById(int id);
}
