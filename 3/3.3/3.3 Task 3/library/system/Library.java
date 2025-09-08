package system;

import model.Book;
import model.LibraryMember;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> members;
    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void addMember(LibraryMember member) {
        members.add(member);
    }
    public boolean borrowBook(LibraryMember member, Book book) {
        if (books.contains(book) && !member.getBorrowedBooks().contains(book) && !book.isReserved()) {
            member.borrowBook(book);
            books.remove(book);
            return true;
        }
        return false;
    }
    public boolean returnBook(LibraryMember member, Book book) {
        if (member.getBorrowedBooks().contains(book)) {
            member.returnBook(book);
            books.add(book);
            return true;
        }
        return false;
    }
    public void reserveBook(LibraryMember member, Book book) {
        if (!book.isReserved() && books.contains(book)) {
            book.setReserved(true);
            member.addReservedBook(book);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }
    public void cancelReservation(LibraryMember member, Book book) {
        if (book.isReserved() && member.hasReservedBook(book)) {
            book.setReserved(false);
            member.removeReservedBook(book);
            System.out.println("Reservation canceled successfully.");
        } else {
            System.out.println("Book was not reserved by this member.");
        }
    }
    public void displayReservedBooks(LibraryMember member) {
        System.out.println("Reserved books for " + member.getName() + ":");
        for (Book book : member.getReservedBooks()) {
            System.out.println(book);
        }
    }
    public List<Book> getBooks() { return books; }
    public List<LibraryMember> getMembers() { return members; }
}