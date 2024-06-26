public class BookPrinted extends Book {
    // instance variables
    private int numPages;
    private boolean hardcover;

    // constructors
    public BookPrinted(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String edition,
            String category, int numPages,
            boolean hardcover) {
        super(itemId, title, author, ISBN, publisher, numCopies, edition, category);
        this.numPages = numPages;
        this.hardcover = hardcover;
    }

    public BookPrinted(BookPrinted obj) {
        super(obj.getItemId(), obj.getTitle(), obj.getAuthor(), obj.getISBN(), obj.getPublisher(), obj.getNumCopies(),
                obj.getEdition(), obj.getCategory());
        this.numPages = obj.numPages;
        this.hardcover = obj.hardcover;
    }

    // getters and setters
    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public boolean isHardcover() {
        return hardcover;
    }

    public void setHardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }

    // methods
    @Override
    public String toString() {
        return super.toString() + String.format("\nNumber of Pages: %d\nHardcover: %b", numPages, hardcover);
    }
}
