public class BookAudio extends LibraryItem {
    // instance variables
    private String category;
    public Boolean DRM;
    public double length;
    public String narrator;

    // constructors
    public BookAudio(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String category,
            Boolean DRM,
            double length, String narrator) {
        super(itemId, title, author, ISBN, publisher, numCopies);
        this.category = category;
        this.DRM = DRM;
        this.length = length;
        this.narrator = narrator;
    }
}
