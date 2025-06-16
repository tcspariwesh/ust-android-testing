
public class InheritanceDemo {
	public static void main(String[] args) {
		demo2();
	}

	private static void demo2() {
		String[] authors = new String[]{"Ram", "Shyam"}; 
		Book book = new Book("Learn Java", 300, authors);
		//book.title= "learn Karate";// disallwoed
		System.out.println(book.getTitle());
	}

	private static void demo1() {
		String[] authors = new String[]{"Ram", "Shyam"};
		Book book = new AudioBook("Learn Android", 400, authors);// polymorphism
		AudioBook audioBook = new AudioBook("Learn IOS", 300, authors);
		//AudioBook ref= (AudioBook) book;// never works
		book.read();
		audioBook.read();
//		ref.url		6
	}
}
