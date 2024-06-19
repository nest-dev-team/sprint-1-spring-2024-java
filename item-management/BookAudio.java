public class BookAudio extends Book {
    // instance variables
    public Boolean DRM;
    public double length; // in hours
    public String narrator;

    // constructors
    public BookAudio(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String edition,
            String category,
            Boolean DRM,
            double length, String narrator) {
        super(itemId, title, author, ISBN, publisher, numCopies, edition, category);
        this.DRM = DRM;
        this.length = length;
        this.narrator = narrator;
    }

    // getters and setters
    public Boolean hasDRM() {
        return DRM;
    }

    public void setDRM(Boolean DRM) {
        this.DRM = DRM;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
}
