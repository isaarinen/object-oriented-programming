public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Book 1", "Author 1", 1999);
        Book book2 = new Book("Book 2", "Author 3", 1999);
        Book book3 = new Book("Book 3", "Author 3", 1999);
        Book book4 = new Book("Book 4", "Author 4", 1999);
        Book book5 = new Book("Book 5", "Author 5", 1999);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.displayBooks();
        library.borrowBook(book1);
        library.borrowBook(book3);
        library.displayBooks();
        library.returnBook(book3);
        library.displayBooks();
        System.out.println(library.isBookAvailable(book1));
        System.out.println(library.isBookAvailable(book3));
        library.findBooksByAuthor("Author 3");

    }
}
