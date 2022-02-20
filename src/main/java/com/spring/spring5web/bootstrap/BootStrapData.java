package com.spring.spring5web.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.spring5web.domain.Author;
import com.spring.spring5web.domain.Book;
import com.spring.spring5web.repo.AuthorRepositry;
import com.spring.spring5web.repo.BookRepository;
import com.spring.spring5web.repo.PublisherRepository;

@Component
public final class BootStrapData implements CommandLineRunner {

	private final AuthorRepositry authorRepositry;
	
	private final BookRepository bookRepository;
	
	public BootStrapData(AuthorRepositry authorRepositry, BookRepository bookRepository) {
		super();
		this.authorRepositry = authorRepositry;
		this.bookRepository = bookRepository;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		Author eric = new Author("Eric", "Ethan");
		Book book = new Book("hello", "HGHJG765", "oreilly");
		eric.getBooks().add(book);
		book.getAuthors().add(eric);
		
		authorRepositry.save(eric);
		bookRepository.save(book);
		
		Author rod = new Author("Rod", "Johnson");
		Book spring = new Book("EJB", "1232GHJG765", "oreilly");
		eric.getBooks().add(spring);
		book.getAuthors().add(rod);
		
		authorRepositry.save(rod);
		bookRepository.save(spring);
		
		System.out.println("saving books and authors...");
		System.out.println("books saved: " + bookRepository.count());
		
	}

}
