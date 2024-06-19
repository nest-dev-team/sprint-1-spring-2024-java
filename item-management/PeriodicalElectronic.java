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

    // getters and setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}