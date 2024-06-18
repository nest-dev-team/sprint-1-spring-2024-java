public abstract class Periodical extends LibraryItem {
    // instance variables
    private String description;
    private String frequency;

    // constructor
    public Periodical(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String description,
            String frequency) {
        super(itemId, title, author, ISBN, publisher, numCopies);
        this.description = description;
        this.frequency = frequency;
    }

    // getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    // methods
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
