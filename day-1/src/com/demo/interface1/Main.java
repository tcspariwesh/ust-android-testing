package com.demo.interface1;

public class Main {
	public static void main(String[] args) {
		ILibrary library = new Library();
		library.issueBook();
		library.issueBook(4);
	}
}
