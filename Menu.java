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
            clearScreen();
            System.out.println("Library Management System\n");
            System.out.println("1. Borrow Items");
            System.out.println("2. Return Items");
            System.out.println("3. Manage Items");
            System.out.println("4. Manage Authors");
            System.out.println("5. Exit\n");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            clearScreen();

            switch (choice) {
                case 1:
                    library.borrowItems(scanner);
                    break;
                case 2:
                    library.returnItems(scanner);
                    break;
                case 3:
                    library.itemManager(scanner);
                    break;
                case 4:
                    library.authorManager(scanner);
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
