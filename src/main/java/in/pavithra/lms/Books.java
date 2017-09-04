
package in.pavithra.lms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Books {
    private static Set<Book> books = new HashSet<Book>();

    static {
        books.add(new Book().setAuthor("JK Rowling").setTitle("Harry Potter Series").setYearOfPublication(1995));
        books.add(new Book().setTitle("Black Horse").setAuthor("Pavithra").setYearOfPublication(2050));
    }

    public static List<Book> all() {
        return new ArrayList<Book>(books);
    }

    public static boolean add(Book b) {
        if (books.contains(b)) return false;
        books.add(b);
        return true;
    }

    public static boolean remove(Book b) {
        if (books.contains(b)) {
            books.remove(b);
            return true;
        } else {
            return false;
        }
    }
    public static Book edit(Book b)
    {
        for (Book book : books)
        {
            if (book.getAuthor().equalsIgnoreCase(b.getAuthor()) && book.getTitle().equalsIgnoreCase(b.getTitle())) {
                book.setYearOfPublication(b.getYearOfPublication());
                return b;
            }
        }
        throw new RuntimeException("Input book didn't match with any of the known books");
    }

    /**
     * Returns the list of all books that match the author (case insensitive)
     *
     * @param books
     * @param author
     * @return
     */
    public static List<Book> filterByAuthor(List<Book> books, String author) {
        ArrayList<Book> filteredBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                filteredBooks.add(book);
            }
        }
        return filteredBooks;

    }

    /**
     * Returns the list of all books that has a substring of this title (case insensitive)
     *
     * @param books
     * @param title
     * @return
     */
    public static List<Book> filterByTitle(List<Book> books, String title) {
        ArrayList<Book> filteredBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                filteredBooks.add(book);
            }
        }

        return filteredBooks;
    }

    public static List<Book> filterByPublication(List<Book> books, int yearOfPublication) {
        ArrayList<Book> filteredPublication = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getYearOfPublication() == yearOfPublication) {
                filteredPublication.add(book);
            }
        }
        return filteredPublication;
    }


    public static Book borrow(Book input) {
        if(books.contains(input)){
            books.remove(input);

        }
        return input;
    }
}


