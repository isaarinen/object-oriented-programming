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

        library.reserveBook(member1, book1);
        library.reserveBook(member2, book1);
        library.displayReservedBooks(member1);
        library.cancelReservation(member1, book1);
        library.displayReservedBooks(member1);
        library.reserveBook(member2, book1);
        library.displayReservedBooks(member2);
    }
}