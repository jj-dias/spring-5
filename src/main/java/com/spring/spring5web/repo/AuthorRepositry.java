package com.spring.spring5web.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.spring5web.domain.Author;

public interface AuthorRepositry extends CrudRepository<Author, Long> {

}
