public class Book 
{
	private String title;
	private String author;
	private boolean isBorrowed;
	
	//Constructor to initialize
	public Book(String title, String author, boolean isBorrowed) {
		super();
		this.title = title;
		this.author = author;
		this.isBorrowed = isBorrowed;
	}
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	// Method for borrowing the book
	public void borrowBook()
	{
		if(!isBorrowed)
		{
			isBorrowed = true;
			System.out.println("Book is borrowed: " + title);
		}
		else
		{
			System.out.println("This is already Borrowed.");
		}
	}
	
	public void returnBook()
	{
		if(isBorrowed)
		{
			isBorrowed = false;
			System.out.println("Thank you for returing this book: " + title);
		}
		else
		{
			System.out.println("This book was not borrowed");
		}
	}
	
	public boolean isAvailable()
	{
		return !isBorrowed;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}
	
	public void displayDetailes()
	{
		System.out.println("Title: " + title + ", Author: " + author);
	}
}
