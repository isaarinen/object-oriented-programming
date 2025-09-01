import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    int age;
    private List<Book> borrowedBooks;
    public User(String Name, int age) {
        this.name = Name;
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }
    public void addBook(Book book) {
        this.borrowedBooks.add(book);
    }
    public void removeBook(Book book) {
        this.borrowedBooks.remove(book);
    }
}
