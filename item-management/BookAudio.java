public class BookAudio extends Book {
    // instance variables
    private boolean DRM;
    private double length; // in hours
    private String narrator;

    // constructors
    public BookAudio(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String edition,
            String category,
            boolean DRM,
            double length, String narrator) {
        super(itemId, title, author, ISBN, publisher, numCopies, edition, category);
        this.DRM = DRM;
        this.length = length;
        this.narrator = narrator;
    }

    // getters and setters
    public boolean hasDRM() {
        return DRM;
    }

    public void setDRM(boolean DRM) {
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

    // methods
    public String getLengthString() {
        long hours = Math.round(Math.floor(length));
        long minutes = Math.round(Math.floor((length - hours) * 60));
        long seconds = Math.round(((((length - hours) * 60) - minutes) * 60));

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("\nLength: %s\nNarrator: %s\nDRM: %b", getLengthString(), narrator, DRM);
    }
}
