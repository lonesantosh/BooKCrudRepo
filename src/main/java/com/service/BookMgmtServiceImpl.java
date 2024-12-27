package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Book;
import com.repo.BookRepo;

@Service("BookService")
public class BookMgmtServiceImpl implements IBookMgmtService {
	
	@Autowired
	private BookRepo repo;
	@Override
	public String registerBook(Book book) {
		Book sbook=repo.save(book);
		return " Register book details with "+sbook.getBookId() ;
	}
	
	@Override
	public String registerGroupsOfBook(List<Book> book) {
		Iterable<Book> bdata=repo.saveAll(book);
		return "books data saved"+bdata;
	}
	
	@Override
	public Long recordsCount() {
	
		return repo.count();
	}
	@Override
	public boolean isExist(int id) {
		
		return repo.existsById(id);
	}
	@Override
	public Iterable<Book> fetchAllrecords() {
		
		return repo.findAll();
	}

	@Override
	public Iterable<Book> fetchBookByIds(Iterable<Integer> ids) {
		
		return repo.findAllById(ids);
	}
	
	@Override
	public Optional<Book> getBookById(int id) {
		Optional<Book> op=repo.findById(id);
		return op;
	}
	/*@Override
	public Book showBookById(int id) {
		Optional<Book> op3=repo.findById(id);
		if(op3.isPresent())
			return op3.get();
		else
			 throw new IllegalArgumentException("Book id not found");
	}*/
	
	@Override
	public Book showBookById(int id) {
		
		return repo.findById(id).orElseThrow(()->new IllegalArgumentException("Book data not found"));
	}
	
	@Override
	public String updateBookQty(int id, int pQty) {
		Optional<Book> flag=repo.findById(id);
		if(flag.isPresent()) {
			Book bbb=flag.get();
			bbb.setBQty(pQty);
			repo.save(bbb);
			return id+" is updated with new Quantity"+pQty;
		}else {
			return id+" is not present in list";
		}
			
	}
	@Override
	public String fullUpdateBook(Book book) {
		boolean flag=repo.existsById(book.getBookId());
		if(flag) {
			repo.save(book);
			return book.getBookId()+" information is updated ";
		}else {
			return book.getBookId()+" Book id is not available for update";
		}
	}
	
	@Override
	public String removeBookById(int id) {
		Optional<Book> hh=repo.findById(id);
		if(hh.isPresent()) {
			repo.deleteById(id);
			return id+" is deleted";
		}else {
			return id+" is not presemt";
		}
	}
	@Override
	public String removeAll() {
		long count=repo.count();
		 repo.deleteAll();
		 return count+" no of records are deleted";
	}
	
	
	
	
	
	
}
