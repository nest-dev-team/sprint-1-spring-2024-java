public class PeriodicalElectronic extends Periodical {
    // instance variables
    private String url;

    // constructors
    public PeriodicalElectronic(String itemId, String title, Author author, String ISBN, String publisher,
            int numCopies,
            String issueNumber, String publicationDate,
            String frequency, String url) {
        super(itemId, title, author, ISBN, publisher, numCopies, issueNumber, publicationDate, frequency);
        this.url = url;
    }

    public PeriodicalElectronic(PeriodicalElectronic obj) {
        super(obj.getItemId(), obj.getTitle(), obj.getAuthor(), obj.getISBN(), obj.getPublisher(), obj.getNumCopies(),
                obj.getIssueNumber(), obj.getPublicationDate(), obj.getFrequency());
        this.url = obj.url;
    }

    // getters and setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // methods
    @Override
    public String toString() {
        return super.toString() + String.format("\nURL: %s", url);
    }
}