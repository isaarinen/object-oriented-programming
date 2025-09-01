import java.util.ArrayList;
import java.util.List;

public class Book {
    private List<String> reviews;
    private String  title;
    private String author;
    private int year;
    private double rating;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.reviews = new ArrayList<>();
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYear() {
        return this.year;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }
    public void addReview(String review) {
        reviews.add(review);
    }


}
