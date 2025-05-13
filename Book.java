package VarshaK;
import java.util.*;
public class Book {
	
	    int id;
	    String title, author;

	    public Book(int id, String title, String author) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	    }
	

	public class LibraryManagement {
	    static List<Book> books = new ArrayList<>();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("\n1. Add Book\n2. View Books\n3. Exit");
	            int choice = scanner.nextInt();
	            scanner.nextLine();
	            if (choice == 1) {
	                System.out.print("Enter title: ");
	                String title = scanner.nextLine();
	                System.out.print("Enter author: ");
	                String author = scanner.nextLine();
	                books.add(new Book(books.size() + 1, title, author));
	            } else if (choice == 2) {
	                books.forEach(book -> System.out.println("ID: " + book.id + ", Title: " + book.title + ", Author: " + book.author));
	            } else break;
	        }
	        scanner.close();
	    }
	}


}
