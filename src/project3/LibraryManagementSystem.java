package project3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 Create a library management system which is capable of issuing books to the students.
 Book should have info like:
 1. Book name
 2. Book Author
 3. Issued to
 4. Issued on
 User should be able to add books, return issued books, issue books
 Assume that all the users are registered with their names in the central database
  */
class Book{
    public String name;
    public String author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}

class Library{
    public ArrayList<Book> books;

    public Library(ArrayList<Book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("The book has been added in the library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to){
        System.out.println("The book has been issued to" + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book has been returned to the library");
        this.books.add(b);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        ArrayList<Book> bookLists = new ArrayList<>();

        bookLists.add(new Book("Kite runner", "Khalid Hussain"));
        bookLists.add(new Book("Think and Grow Rich", "Napoleon Hill"));
        bookLists.add(new Book("21 lesson for 21st century", "Yuval Noah Harari"));
        bookLists.add(new Book("Sea Prayer", "Khalid Hussain"));
        bookLists.add(new Book("Revolutionary 2020", "Chetan Bhagat"));

        Library library = new Library(bookLists);
        library.addBook(new Book("Sirish ko phul", "Parijat"));
        System.out.println(library.books);

        library.issueBook(new Book("Think and Grow Rich", "Napoleon Hill"), "Subina");

        System.out.println(library.books);




    }
}
