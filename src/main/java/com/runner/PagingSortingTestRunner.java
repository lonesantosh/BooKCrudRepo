package com.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.model.Book;
import com.service.IBookPaggingAndSorting;

@Component
public class PagingSortingTestRunner implements CommandLineRunner {

	
	@Autowired
	private IBookPaggingAndSorting pagg;
	
	@Override
	public void run(String... args) throws Exception {
		
		//System.out.println(pagg.showBookByOrder(true, "bName"));
		//pagg.showBookByOrder(true,"bName","bookId").forEach(System.out::println);// take both prop.. for sorting
		//pagg.showBookByOrder(true,"bookId").forEach(System.out::println);
		
		Page<Book> page=pagg.showPageBySize(0, 4);// Zero means 1st page and Four means 4 records in 1st page
		List<Book> list=page.getContent();
		//System.out.println(list);
		list.forEach(System.out::println);
		System.out.println("Current page info "+page.getNumber());
		System.out.println("Total pages "+page.getTotalPages());
		System.out.println("Total records "+page.getNumberOfElements());
		System.out.println("Is it first page "+page.isFirst());
		System.out.println("is it last page "+page.isLast());
		System.out.println("Total no of records in DB "+page.getTotalElements());
	}
}
