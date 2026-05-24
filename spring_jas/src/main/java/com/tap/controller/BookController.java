package com.tap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tap.entity.Book;
import com.tap.service.BookService;


@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
@GetMapping("/Book")
	public List<Book>  getAllBooks() {
		
		return bookService.getAllBooks();	
	}
	
@GetMapping("Book/{id}")
	public Book getBook(@PathVariable("id")int bid) {
	
return	bookService.getbook(bid);
	
}

@PostMapping("Book")
public Book addBook(@RequestBody Book book) {
	
return bookService.addBook(book);
	
}
@PutMapping("Book/{id}")
public Book updateBook(@PathVariable("id")int bid,@RequestBody Book book) {
	
	return bookService.updateBook(bid,book);
	
}
@DeleteMapping("Book/{id}")
public String deleteBook(@PathVariable("id")int bid) {

return	bookService.deletebook(bid);

}



}


