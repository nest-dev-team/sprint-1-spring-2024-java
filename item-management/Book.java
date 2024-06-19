public class Book extends LibraryItem {
    // instance variables
    public String edition;
    public String category;

    // constructors
    public Book(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String edition, String category) {
        super(itemId, title, author, ISBN, publisher, numCopies);
        this.edition = edition;
        this.category = category;
    }

    // getters and setters
    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}