package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.repositories.BookRepository;

@Service

public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	 // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
    	Optional <Book> book = bookRepository.findById(id);
       if(book.isPresent()) {
    	   return book.get();
       }
       else {
    	   return null;
       }
    }
    

	public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		Book bookUpdate = findBook(id);
		bookUpdate.setTitle(title);
		bookUpdate.setDescription(desc);
		bookUpdate.setLanguage(lang);
		bookUpdate.setNumberOfPages(numOfPages);
		
		return bookRepository.save(bookUpdate);
	}

	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
		
	}
    
   


}

