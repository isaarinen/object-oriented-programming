public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Book 1", "Author 1", 1999);
        book1.setRating(5);
        Book book2 = new Book("Book 2", "Author 3", 1999);
        book2.setRating(2);
        Book book3 = new Book("Book 3", "Author 3", 1999);
        book3.setRating(1);
        Book book4 = new Book("Book 4", "Author 4", 1999);
        book4.setRating(3);
        Book book5 = new Book("Book 5", "Author 5", 1999);
        book5.setRating(2);
        for (int i = 0; i < 10; i++) {
            book5.addReview("Good.");
        }
        for (int i = 0; i < 7; i++) {
            book2.addReview("Good.");
        }

        User user1 = new User("User", 55);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.displayBooks();
        library.borrowBook(book1, user1);
        library.borrowBook(book3, user1);
        library.displayBooks();
        library.returnBook(book3, user1);
        library.displayBooks();
        System.out.println(library.isBookAvailable(book1));
        System.out.println(library.isBookAvailable(book3));
        library.findBooksByAuthor("Author 3");
        System.out.println("Average book rating: " + library.getAverageBookRating());
        System.out.printf("The most reviewed book is %s by %s", library.getMostReviewedBook().getTitle(), library.getMostReviewedBook().getAuthor());


    }
}
