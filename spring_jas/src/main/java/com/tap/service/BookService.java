package com.tap.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.entity.Book;
import com.tap.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getAllBooks() {
           List<Book> listOfBooks =(List<Book>) bookRepository.findAll();	
		
           
           return listOfBooks;
           
           
	}

	public Book getbook(int bid) {
		
		Book book = bookRepository.findById(bid);		
		
		
		return book;
	}

	public Book addBook(Book book) {
		
Book savedBook = bookRepository.save(book);

return savedBook;


	}

	public Book updateBook(int bid,Book book) {
		
		if(bookRepository.findById(bid) != null) {
			return bookRepository.save(book);
			
			
		}
		return null;
	}

	public String deletebook(int bid) {

		bookRepository.deleteById(bid);
		
		return "BOOK Deleted";
	}

}
