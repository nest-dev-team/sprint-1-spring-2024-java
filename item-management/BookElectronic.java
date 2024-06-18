public class BookElectronic extends LibraryItem {
    // instance variables
    private String category;
    private Boolean DRM;

    // constructors
    public BookElectronic(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String category,
            Boolean DRM) {
        super(itemId, title, author, ISBN, publisher, numCopies);
        this.category = category;
        this.DRM = DRM;
    }

}
