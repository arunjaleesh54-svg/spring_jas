package com.tap.repository;

import org.springframework.data.repository.CrudRepository;

import com.tap.entity.Book;

public interface BookRepository extends CrudRepository<Book,Integer> {

	
	Book findById(int id);
	
	
}
