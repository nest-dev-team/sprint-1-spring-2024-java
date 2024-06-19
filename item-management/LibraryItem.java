public abstract class LibraryItem {
    // instance variables
    private String itemId;
    private String title;
    private Author author;
    private String ISBN;
    private String publisher;
    private int numCopies;

    // constructors
    public LibraryItem(String itemId, String title, Author author, String ISBN, String publisher, int numCopies) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numCopies = numCopies;
    }

    // getters and setters
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    // methods
    public LibraryItem addCopies() {
        setNumCopies(numCopies++);
        return this;
    }

    @Override
    public String toString() {
        return String.format("Item ID: %s\nTitle: %s\nAuthor: %s\nISBN: %s\nPublisher: %s\nNumber of Copies: %d",
                itemId, title, author, ISBN, publisher, numCopies);
    }
}