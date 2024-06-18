public class BookAudio extends Book {
    // instance variables
    public Boolean DRM;
    public double length;
    public String narrator;

    // constructor
    public BookAudio(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String category,
            Boolean DRM,
            double length, String narrator) {
        super(itemId, title, author, ISBN, publisher, numCopies, category);
        this.DRM = DRM;
        this.length = length;
        this.narrator = narrator;
    }
}
