package com.spring.spring5web.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.spring5web.domain.Author;
import com.spring.spring5web.domain.Book;
import com.spring.spring5web.domain.Publisher;
import com.spring.spring5web.repo.AuthorRepositry;
import com.spring.spring5web.repo.BookRepository;
import com.spring.spring5web.repo.PublisherRepository;

@Component
public final class BootStrapData implements CommandLineRunner {

	private final AuthorRepositry authorRepositry;
	
	private final BookRepository bookRepository;
	
	private final PublisherRepository publisherRepository;
	
	public BootStrapData(AuthorRepositry authorRepositry, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepositry = authorRepositry;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		Publisher publisher = new Publisher("hh", "2","b" , "K", new Long(232343));
		publisherRepository.save(publisher);
		
		System.out.println("Publisher saved...");
		System.out.println("no of pub:" + publisherRepository.count());
				
				
		Author eric = new Author("Eric", "Ethan");
		Book book = new Book("hello", "HGHJG765");
		eric.getBooks().add(book);
		book.getAuthors().add(eric);
		book.setPublisher(publisher);
		publisher.getBooks().add(book);
		
		authorRepositry.save(eric);
		bookRepository.save(book);
		publisherRepository.save(publisher);
		
		Author rod = new Author("Rod", "Johnson");
		Book spring = new Book("EJB", "1232GHJG765");
		eric.getBooks().add(spring);
		spring.getAuthors().add(rod);
		spring.setPublisher(publisher);
		publisher.getBooks().add(spring);
		
		authorRepositry.save(rod);
		bookRepository.save(spring);
		publisherRepository.save(publisher);
		
		System.out.println("saving books and authors...");
		System.out.println("books saved: " + bookRepository.count());
		System.out.println("Publisher's no of books:" + publisher.getBooks().size());
		
	}

}
