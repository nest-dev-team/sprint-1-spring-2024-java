public class BookElectronic extends Book {
    // instance variables
    private Boolean DRM;

    // constructor
    public BookElectronic(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String category,
            Boolean DRM) {
        super(itemId, title, author, ISBN, publisher, numCopies, category);
        this.DRM = DRM;
    }

}
