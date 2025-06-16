package com.demo.interface1;

import java.awt.print.Book;

public class Library implements ILibrary{
	Book book =  new Book();//aggregation
	@Override
	public void issueBook() {
		System.out.println("book issued");
	}
	@Override
	public void issueBook(int days) {
		System.out.println("book was issued for "+days+ " days");
	}

}
