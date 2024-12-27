package com.service;

import java.util.List;
import java.util.Optional;

import com.model.Book;

public interface IBookMgmtService {
	
	public String registerBook(Book book);
	public String registerGroupsOfBook(List<Book> book);
	public Long recordsCount();
	public boolean isExist(int id);
	
	public Iterable<Book> fetchAllrecords();
	public Iterable<Book> fetchBookByIds(Iterable<Integer> ids);
	public Optional<Book> getBookById(int id);
	public Book showBookById(int id);
	
	public String updateBookQty(int id,int pQty); 
	public String fullUpdateBook(Book book);
	
	public String removeBookById(int id);
	public String removeAll();
}