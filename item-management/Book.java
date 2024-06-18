public abstract class Book extends LibraryItem {
    // instance variables
    private String category;

    // constructor
    public Book(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String category) {
        super(itemId, title, author, ISBN, publisher, numCopies);
        this.category = category;
    }
}
