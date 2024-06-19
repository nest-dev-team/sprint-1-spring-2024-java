public class BookElectronic extends Book {
    // instance variables
    private boolean DRM;
    private String url;

    // constructors
    public BookElectronic(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String edition,
            String category,
            boolean DRM, String url) {
        super(itemId, title, author, ISBN, publisher, numCopies, edition, category);
        this.DRM = DRM;
        this.url = url;
    }

    // getters and setters
    public Boolean hasDRM() {
        return DRM;
    }

    public void setDRM(Boolean DRM) {
        this.DRM = DRM;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // methods
    @Override
    public String toString() {
        return super.toString() + String.format("\nURL: %s\nDRM: %b", url, DRM);
    }

}
