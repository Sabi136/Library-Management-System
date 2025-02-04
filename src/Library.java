import java.util.ArrayList;

public class Library 
{
	private ArrayList<Book> books;
	
	public Library()
	{
		this.books = new ArrayList<Book>();
	}
	
	// to add a book in Library's collection
	public void addBook(Book book)
	{
		books.add(book);
	}
	
	//method to display all the books present in the library
	public void displayAvailableBooks()
	{
		for(Book b : books)
		{
			if(b.isAvailable())
			{
				System.out.println(b.getTitle() + " by " + b.getAuthor());
			}
		}
	}
	
	// method to borrow a book
	public void borrowBook(String title, String author)
	{
		for(Book b : books)
		{
			// check if the book title , book author matches the input and if it is available or not
			if(b.getTitle().equalsIgnoreCase(title) && 
			   b.getAuthor().equalsIgnoreCase(author) && 
			   b.isAvailable())
			{
				if(b.isAvailable())
				{
					b.borrowBook();
					System.out.println("You have borrowed the book successfully of /nTitle " + title + " by " + author + ".");
				}
				else
				{
					System.out.println("Sorry, " + title+" by "+author+" is already borrowed.");
				}
				return;
			}
		}
		
		System.out.println("Sorry, the book is not available!");
	}
	
	
	public void returnBook(String title, String author)
	{
		for(Book b: books)
		{
			if(b.getTitle().equalsIgnoreCase(title) && 
			   b.getAuthor().equalsIgnoreCase(author) && 
			   b.isBorrowed())
			{
				if(!b.isAvailable())
				{
					b.returnBook();
					System.out.println("You have successfully returned " + title + " by " + author + ".");
				}
				return;
			}
		}
		
		System.out.println("This book wasn't borrowed from the Library!");
	}
	
}
