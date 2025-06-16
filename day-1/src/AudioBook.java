
public class AudioBook extends Book{
	
	String url;
	public AudioBook(String title, int pages, String[] authors) {
		super(title, pages, authors);
	}
	
	void read() {
		System.out.println("Child");
	}
}
