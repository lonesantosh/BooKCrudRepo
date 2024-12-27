package com.runner;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.model.Book;
import com.service.IBookMgmtService;

@Component
public class BookRunner implements CommandLineRunner{

	@Autowired
	private IBookMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
		/*Book bk=new Book();
		bk.setBName("Java");
		bk.setBQty(3);
		bk.setBPrice(144.6);
		System.out.println(service.registerBook(bk));
		
	
		List<Book> blist=List.of(new Book(1,"SQL",5,63.45),
									new Book(2,"Java",1,11.22),
									new Book(3,"Spring",8,66.66),
									new Book(4,"Python",2,21.23),
									new Book(5,"C prog",4,44.44),
									new Book(6,"C++",6,35.35));
		System.out.println(service.registerGroupsOfBook(blist));
				*/	
		/*
		Iterable<Book> it=service.fetchAllrecords();
		
		System.out.println("Different way of displaying data");
		Iterable<Book> it=service.fetchAllrecords();
		it.forEach(System.out::println);
		
		System.out.println("-----2nd way----------");
		for(Book book:it) {
			System.out.println(book);
		}
		System.out.println("-----3rd way----------");
		it.forEach(book->System.out.println(book));
	
		System.out.println("-----4th way----------");
		List<Book> list=(List<Book>)it;
		list.stream().forEach(System.out::println);
		
		System.out.println("count no of records in table "+list.stream().count());
		System.out.println("comparing stream api");
		list.stream().sorted((a1,a2)->a1.getBName().compareTo(a2.getBName())).forEach(System.out::println);;
		
			*/
		
		//System.out.println("All records from table "+service.fetchAllrecords());
		//System.out.println("Total no of records in table is "+service.recordsCount());
		//System.out.println("Given id is present or Not "+service.isExist(4));
		
		//System.out.println(" find By given ids");
		//System.out.println(service.fetchBookByIds(List.of(3,4,1)));
		
		/*
		Optional<Book> op1=service.getBookById(3);
		if(op1.isPresent())
			System.out.println("Given Book id data is present "+op1.get());
		else
			System.out.println("Given Book id data is Not present");
		
		System.out.println(service.showBookById(4));
		System.out.println(service.updateBookQty(1, 333)); 
		*/
		//System.out.println("All records from table "+service.fetchAllrecords());
		//Book b=new Book(1,"Oracle",2,33.33);
		//System.out.println(service.fullUpdateBook(b));
		//System.out.println("All records from table "+service.fetchAllrecords());
		//System.out.println(service.removeBookById(4));
		//System.out.println(service.removeAll());
	
	}
}
