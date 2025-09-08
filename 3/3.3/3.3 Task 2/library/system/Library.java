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
        if (books.contains(book) && !member.getBorrowedBooks().contains(book)) {
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

    public List<Book> getBooks() { return books; }
    public List<LibraryMember> getMembers() { return members; }
}