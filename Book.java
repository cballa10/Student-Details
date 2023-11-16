import java.util.Scanner;

public class Book {

public String title;
public String author;
public String publisher;
public int yearPublished;
public long ISBN;

Scanner input = new Scanner(System.in);

public Book(){

System.out.println("Enter title of book:");
this.title = input.nextLine();

System.out.println("Enter the author of the book");
this.author = input.nextLine();

System.out.println("Enter the publisher of the book");
this.publisher = input.nextLine();

System.out.println("Enter the year the book was published");
this.yearPublished = input.nextInt();

System.out.println("Enter the ISBN of the book");
this.ISBN = input.nextLong();

}

public static void main(String [] args){
//calling the method

//creating a Book class that represents a book with a title, author, publisher, year published, and ISBN. The Book thingie* will prompt the user to enter the details of the book and stores them in the corresponding variables.

Book book = new Book();

}
}
