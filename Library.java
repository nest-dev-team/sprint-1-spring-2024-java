import java.util.ArrayList;
import java.util.List;
// import java.util.Scanner;

public class Library {
    private List<Author> authors;

    public Library() {
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void editAuthor(String name, String newName, String newDateOfBirth) {
        for (Author author : authors) {
            if (author.getName().equals(name)) {
                author.setName(newName);
                author.setDateOfBirth(newDateOfBirth);
                System.out.print("Done. Press any key to continue...");
                return;
            }
        }
        System.out.println("Author not found. Press any key to continue...");
    }

    public void deleteAuthor(String name) {
        boolean isRemoved = authors.removeIf(author -> author.getName().equals(name));
        if (isRemoved) {
            System.out.print("\nAuthor deleted. Press any key to continue...");
        } else {
            System.out.print("\nAuthor not found. Press any key to continue...");
        }
    }

    public void listAuthors() {
        for (Author author : authors) {
            System.out.println(author);
        }
    }
}