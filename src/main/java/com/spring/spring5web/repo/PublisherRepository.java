package com.spring.spring5web.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.spring5web.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long>{

	
}
