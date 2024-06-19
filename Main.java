import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        TestDataLoader testDataLoader = new TestDataLoader(library);
        testDataLoader.loadTestData();

        while (true) {
            System.out.println();
            System.out.println("1. Add Author");
            System.out.println("2. Edit Author");
            System.out.println("3. Delete Author");
            System.out.println("4. List Authors");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter author's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter author's date of birth (YYYY-MM-DD): ");
                    String dob = scanner.nextLine();
                    Author author = new Author(name, dob);
                    library.addAuthor(author);
                    System.out.print("\nAuthor added. Press any key to continue...");
                    scanner.nextLine();
                    break;

                case 2:
                    System.out.print("Enter the name of the author to edit: ");
                    String oldName = scanner.nextLine();
                    System.out.print("Enter the new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter the new date of birth (YYYY-MM-DD): ");
                    String newDob = scanner.nextLine();
                    library.editAuthor(oldName, newName, newDob);
                    scanner.nextLine();
                    break;

                case 3:
                    System.out.print("Enter the name of the author to delete: ");
                    String nameToDelete = scanner.nextLine();
                    library.deleteAuthor(nameToDelete);
                    scanner.nextLine();
                    break;

                case 4:
                    library.listAuthors();
                    System.out.print("\nPress any key to continue...");
                    scanner.nextLine();
                    break;

                case 5:
                    System.out.println("End Session. Thank you.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
