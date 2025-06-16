

public class HelloWorld {
	public static void main(String[] args) {// entry point
//		createBooks();
//		Book.read();
		double d = 9.7;
		int i = (int) d; // 9, danger
//		System.out.println(i);

		int num = 10;
//		if (num > 0)// true
//		{
//			System.out.println("Positive");
//		} else
//			System.out.println("second");
//			System.out.println("Non-positive");

		fordemo();
//		method1();
	}

	private static void fordemo() {
//		for (int i = 10; i >= 5; i++) {
//		    System.out.println(i);
//		}
		
		for (int i = 1; i <= 10; i++) {
		    if (i == 5)
		        break; // exits loop
		    System.out.println(i);
		}

	}

	private static void createBooks() {
		Book book = new Book();
		book.title = "Learn Java";
		book.authors = new String[2]; // max elements is 2
		book.authors[0] = "Pariwesh";
		book.authors[1] = new String("John "); // String object
		Book androidBook = new Book();
		book.authors = new String[3]; // max elements is 3

		androidBook.title = "Learn Android"; // string literal

		System.out.println(book.title);
		System.out.println(androidBook.title);
		Book book1; // defined just reference
		new Book();// created an object/

	}

	static void method1() {
		System.out.println("in method 1");
		int i = 100;
		float decimal = 19.1f; // 4 bytes
		double doubleDecimal = 30.45666666F; // 8 bytes
		boolean decision = true;
		System.out.println("Hello Bangalore " + i + doubleDecimal); // sysout
	}
}
