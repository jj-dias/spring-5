package com.spring.spring5web.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.spring5web.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
