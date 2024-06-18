public class LibraryEB {
    // instance variables
    private LibraryItem[] items;
    private Author[] authors;
    private Patron[] patrons;

    // methods
    public LibraryItem searchByTitle(String title) {
        LibraryItem result = null;

        // linear search
        for (int i = 0; i < items.length; i++) {
            if (items[i].getTitle() == title) {
                result = items[i];
                break;
            }
        }

        return result;
    }

    public LibraryItem searchByAuthor(Author author) {
        // account for muliple results?
        LibraryItem result = null;

        // linear search
        for (int i = 0; i < items.length; i++) {
            if (items[i].getAuthor() == author) {
                result = items[i];
                break;
            }
        }

        return result;
    }

    public LibraryItem searchByISBN(String ISBN) {
        LibraryItem result = null;

        // linear search
        for (int i = 0; i < items.length; i++) {
            if (items[i].getISBN() == ISBN) {
                result = items[i];
                break;
            }
        }

        return result;
    }

    public void addItem() {

    }

    public void editItem() {
    }

    public void deleteItem() {
    }
}
