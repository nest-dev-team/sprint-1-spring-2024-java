import java.util.Scanner;

public class Menu {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        TestData.loadItems(library);
        clearScreen();

        while (true) {
            System.out.println("Library Management System\n");
            System.out.println("1. Manage Items");
            System.out.println("2. Manage Authors");
            System.out.println("3. Manage Patrons");
            System.out.println("4. Exit\n");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            clearScreen();

            switch (choice) {
                case 1:
                    library.itemManager(scanner);
                    break;
                case 2:
                    library.authorManager(scanner);
                    break;
                case 3:
                    library.patronManager(scanner);
                    break;
                case 4:
                    System.out.println("End Session. Thank you.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
