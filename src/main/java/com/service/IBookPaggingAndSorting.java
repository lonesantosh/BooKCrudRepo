package com.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.model.Book;

public interface IBookPaggingAndSorting {
	
	public Iterable<Book> showBookByOrder(boolean asc,String ...properties);//properties you can take anything

	public Page<Book> showPageBySize(int pageNo,int pazeSize);
}
