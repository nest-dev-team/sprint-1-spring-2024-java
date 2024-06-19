import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String dateOfBirth;
    private List<String> itemsWritten;

    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.itemsWritten = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List<String> getItemsWritten() {
        return itemsWritten;
    }

    public void addItem(String item) {
        this.itemsWritten.add(item);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "\nAuthor" +
                "Name: " + name + '\n' +
                "Date Of Birth: " + dateOfBirth + '\n' +
                "Items Written: " + itemsWritten 
                ;
    }
}