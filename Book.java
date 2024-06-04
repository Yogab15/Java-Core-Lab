//Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
import java.util.ArrayList;
import java.util.List;

public class Book {
    // Declares private instance variables for title, author, and ISBN of the book
    private String title;
    private String author;
    private String ISBN;
    
    // Constructor to initialize title, author, and ISBN of the book
    public Book(String title, String author, String ISBN) {
        this.title = title;  // Assigns the value of 'title' parameter to the instance variable 'title'
        this.author = author;  // Assigns the value of 'author' parameter to the instance variable 'author'
        this.ISBN = ISBN;  // Assigns the value of 'ISBN' parameter to the instance variable 'ISBN'
    }
    
    // Get method for title
    public String getTitle() {
        return title;  // Returns the value of the 'title' instance variable
    }
    
    // Get method for author
    public String getAuthor() {
        return author;  // Returns the value of the 'author' instance variable
    }
    
    // Get method for ISBN
    public String getISBN() {
        return ISBN;  // Returns the value of the 'ISBN' instance variable
    }
    
    // Method to add a book to a collection
    public static void addBook(List<Book> collection, Book book) {
        collection.add(book);  // Adds the book to the collection
        System.out.println("Book added to collection: " + book.getTitle());  // Prints a message confirming the addition
    }
    
    // Method to remove a book from a collection based on its ISBN
    public static void removeBook(List<Book> collection, String ISBN) {
        for (int i = 0; i < collection.size(); i++) {  // Iterates over the collection
            if (collection.get(i).getISBN().equals(ISBN)) {  // Checks if the ISBN of the book matches the given ISBN
                System.out.println("Book removed from collection: " + collection.get(i).getTitle());  // Prints a message confirming the removal
                collection.remove(i);  // Removes the book from the collection
                return;  // Exits the loop
            }
        }
        System.out.println("Book with ISBN " + ISBN + " not found in the collection.");  // Prints a message if the book is not found
    }
    
    // Main method: the entry point of the program
    public static void main(String[] args) {
        // Creating a collection of books
        List<Book> collection = new ArrayList<>();
        
        // Adding books to the collection
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        addBook(collection, book1);
        addBook(collection, book2);
        
        // Removing a book from the collection
        removeBook(collection, "9780743273565");
        
        // Displaying the remaining books in the collection
        System.out.println("\nRemaining books in the collection:");
        for (Book book : collection) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}

Dry Run:
Class Declaration:

Define a class named Book.
Private Instance Variables:

Declare private instance variables title, author, and ISBN to store the details of the book.
Constructor:

Define a constructor that takes title, author, and ISBN parameters and initializes the corresponding instance variables.
Getter Methods:

Define getter methods getTitle(), getAuthor(), and getISBN() to retrieve the values of the instance variables.
Method to Add a Book:

Define a static method addBook() that takes a collection of Book objects and a Book object as parameters.
Add the provided Book object to the collection.
Print a message confirming the addition of the book.
Method to Remove a Book:

Define a static method removeBook() that takes a collection of Book objects and an ISBN as parameters.
Iterate over the collection to find the book with the given ISBN.
If found, remove the book from the collection and print a message confirming the removal.
If not found, print a message indicating that the book was not found.
Main Method:

Create an ArrayList named collection to store Book objects.
Create two Book objects (book1 and book2) with provided details.
Add book1 and book2 to the collection.
Print a message confirming the addition of each book.
Remove a book with ISBN 9780743273565 from the collection.
Print a message confirming the removal of the book.
Print the details of the remaining books in the collection.

Output:
Book added to collection: The Great Gatsby
Book added to collection: To Kill a Mockingbird
Book removed from collection: The Great Gatsby

Remaining books in the collection:
Title: To Kill a Mockingbird, Author: Harper Lee, ISBN: 9780061120084
The program successfully adds books to a collection, removes a book based on its ISBN, and displays the remaining books in the collection.

