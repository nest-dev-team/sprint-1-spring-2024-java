public class Book extends LibraryItem {
    public Book(String itemId, String title, Author author, String ISBN, String publisher, int numCopies) {
        super(itemId, title, author, ISBN, publisher, numCopies);
    }
}