import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<Book, User> borrowedBooks = new HashMap<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void displayBooks() {
        System.out.println("Library Catalog:");
        for (Book book : books) {
            System.out.printf("Title: %s, Author: %s, Year: %d\n", book.getTitle(), book.getAuthor(), book.getYear());
        }
    }
    public boolean isBookAvailable(Book book) {
        return books.contains(book);
    }
    public void findBooksByAuthor(String author) {
        System.out.printf("Books by author \"%s\":\n", author);
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.printf("Title: %s, Year: %d\n", book.getTitle(), book.getYear());
            }
        }
    }
    public void borrowBook(Book book, User user) {
        books.remove(book);
        user.addBook(book);
        borrowedBooks.put(book, user);
    }
    public void returnBook(Book book, User user) {
        books.add(book);
        user.removeBook(book);
        borrowedBooks.remove(book);
    }
    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0;
        }
        double total = 0;
        int count = 0;
        for (Book book : books) {
            double rating = book.getRating();
            if (rating >= 0) {
                total += rating;
                count++;
            }
        }
        return total / count;
    }
    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }
        Book mostReviewed = books.get(0);
        for (Book book : books) {
            if (book.getReviews().size() > mostReviewed.getReviews().size()) {
                mostReviewed = book;
            }
        }
        return mostReviewed;
    }
}
