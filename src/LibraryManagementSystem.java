import java.util.Scanner;

public class LibraryManagementSystem {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		Library library = new Library();
		
		library.addBook(new Book("Game of Thrones" , "George R. R. Martin"));
		library.addBook(new Book("Naruto Uzumaki" , "Masashi Kishimoto"));
		library.addBook(new Book("One piece", "Eiichiro Oda"));
		
		while(true)
		{
			System.out.println("Available books: ");
			library.displayAvailableBooks();
			
			System.out.println("\nDo you want to borrow or return a book?");
			System.out.println("Type 'borrow' to borrow a book, 'return' to return a book, or 'exit' to quit.");
			String action = scan.nextLine().toLowerCase();
			
			if(action.equalsIgnoreCase("Borrow"))
			{
				System.out.println("Enter the title of the book you want to borrow: ");
				String borrowtitle = scan.nextLine();
				System.out.println("Enter the author of the book you want to borrow: ");
				String borrowAuthor = scan.nextLine();
				
				library.borrowBook(borrowtitle, borrowAuthor);
			}
			else if(action.equalsIgnoreCase("Return"))
			{
				System.out.println("Enter the title of the book you want to return: ");
				String returnTitle = scan.nextLine();
				System.out.println("Enter the author of the book you want to return: ");
				String returnAuthor = scan.nextLine();
				
				library.returnBook(returnTitle, returnAuthor);
			}
			else if(action.equalsIgnoreCase("Exit"))
			{
				System.out.println("Exiting from the Library Management System. GoodBye!");
				break;
			}
			else
			{
				System.out.println("Invalid option. Please enter 'borrow', 'return', or 'exit'.");
			}
		}
		
		scan.close();
		
	}

}
