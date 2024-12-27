package com.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.model.Book;

public interface IBookRepository extends PagingAndSortingRepository<Book, Integer> {

}
