

package in.pavithra.lms;

public class Book {
    private String title;
    private String author;
    private int yearOfPublication;

    public String getTitle() {
        return title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Book setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
        return this;
    }

    public User getBorrowedBy() {
        return borrowedBy;
    }

    public Book setBorrowedBy(User borrowedBy) {
        this.borrowedBy = borrowedBy;
        return this;
    }

    public User borrowedBy;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (yearOfPublication != book.yearOfPublication) return false;
        if (!title.equals(book.title)) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + yearOfPublication;
        return result;
    }
}
