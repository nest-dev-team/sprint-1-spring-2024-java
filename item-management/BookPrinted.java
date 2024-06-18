public class BookPrinted extends LibraryItem {
    // instance variables
    private String category;
    public int numPages;
    public Boolean hardcover;

    // constructors
    public BookPrinted(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String category, int numPages,
            Boolean hardcover) {
        super(itemId, title, author, ISBN, publisher, numCopies);
        this.category = category;
        this.numPages = numPages;
        this.hardcover = hardcover;
    }
}
