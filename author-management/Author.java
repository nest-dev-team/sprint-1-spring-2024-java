import java.util.ArrayList;
import java.util.List;

public class Author {
    // instance variables
    private String name;
    private String dateOfBirth;
    private List<LibraryItem> itemsWritten;

    // constructors
    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.itemsWritten = new ArrayList<>();
    }

    // getters and setters
    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List<LibraryItem> getItemsWritten() {
        return itemsWritten;
    }

    public void addItem(LibraryItem item) {
        this.itemsWritten.add(item);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // methods
    @Override
    public String toString() {
        return "\nAuthor" +
                "Name: " + name + '\n' +
                "Date Of Birth: " + dateOfBirth + '\n' +
                "Items Written: " + itemsWritten;
    }
}
