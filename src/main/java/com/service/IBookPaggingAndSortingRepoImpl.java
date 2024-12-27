package com.service;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.model.Book;
import com.repo.IBookRepository;

@Service("BookPagging")
public class IBookPaggingAndSortingRepoImpl implements IBookPaggingAndSorting {
	
	@Autowired
	private IBookRepository repo;
	@Override
	public Iterable<Book> showBookByOrder(boolean asc, String... properties) {
		
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,properties);
		Iterable<Book> it=repo.findAll(sort);
		return it;
	}
@Override
public Page<Book> showPageBySize(int pageNo, int pazeSize) {
	
		// create Pageable object
		Pageable pageable=PageRequest.of(pageNo, pazeSize);
		// get given Page records
		Page<Book> pg=repo.findAll(pageable);
	return pg;
}
}
