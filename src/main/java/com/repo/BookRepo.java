package com.repo;

import org.springframework.data.repository.CrudRepository;

import com.model.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {

}
