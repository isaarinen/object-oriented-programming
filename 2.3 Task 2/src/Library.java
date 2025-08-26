import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (Book book : books) {
            System.out.printf("Title: %s, Author: %s, Year: %d\n", book.getTitle(), book.getAuthor(), book.getYear());
        }
    }
    public void findBooksByAuthor(String author) {
        System.out.printf("Books by author \"%s\":\n", author);
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.printf("Title: %s, Year: %d\n", book.getTitle(), book.getYear());
            }
        }
    }
    public void borrowBook(Book book) {
        books.remove(book);
    }
    public void returnBook(Book book) {
        books.add(book);
    }
}
