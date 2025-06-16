
class Book {
	// properties
	private int pages; // Fixed
	private String[] authors; // fixed // array of strings
	private String title;  // single string
	private float price; //mutable
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getPages() {
		return pages;
	}

	public String[] getAuthors() {
		return authors;
	}

	public String getTitle() {
		return title;
	}

	//custom constructor
	public Book(String title, int pages, String[] authors) {
		this.title = title;
		this.pages=pages;
		this.authors = authors;
	}

	void read() {
		System.out.println("parent ");
	}
}