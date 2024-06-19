public abstract class Periodical extends LibraryItem {
    // instance variables
    public String issueNumber;
    public String publicationDate;
    private String frequency;

    // constructors
    public Periodical(String itemId, String title, Author author, String ISBN, String publisher, int numCopies,
            String issueNumber, String publicationDate,
            String frequency) {
        super(itemId, title, author, ISBN, publisher, numCopies);
        this.issueNumber = issueNumber;
        this.publicationDate = publicationDate;
        this.frequency = frequency;
    }

    // getters and setters
    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
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
