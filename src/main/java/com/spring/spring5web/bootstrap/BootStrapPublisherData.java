package com.spring.spring5web.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.spring5web.domain.Publisher;
import com.spring.spring5web.repo.PublisherRepository;

@Component
public class BootStrapPublisherData implements CommandLineRunner {

	private final PublisherRepository publisherRepository;
	
	
	public BootStrapPublisherData(PublisherRepository publisherRepository) {
		super();
		this.publisherRepository = publisherRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Publisher publisher = new Publisher("hh", "2","b" , "K", new Long(232343));
		
		publisherRepository.save(publisher);
		
		System.out.println("Publisher saved...");
		System.out.println("no of pub:" + publisherRepository.count());

	}

}
