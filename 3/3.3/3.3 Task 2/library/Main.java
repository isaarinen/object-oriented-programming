import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Book1", "Author1", "123");
        Book book2 = new Book("Book2", "Author2", "223");
        library.addBook(book1);
        library.addBook(book2);

        LibraryMember member1 = new LibraryMember("Member1", 1);
        LibraryMember member2 = new LibraryMember("Member2", 2);
        library.addMember(member1);
        library.addMember(member2);

        library.borrowBook(member1, book1);
        System.out.println(member1.getName() + " borrowed: " + member1.getBorrowedBooks());
        library.returnBook(member1, book1);
        System.out.println(member1.getName() + " returned the book. Borrowed books: " + member1.getBorrowedBooks());
    }
}