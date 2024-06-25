import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<LibraryItem> items;
    private List<Author> authors;
    private List<Patron> patrons;

    public Library() {
        this.items = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // library item methods
    public LibraryItem searchByTitle(String title) {
        LibraryItem result = null;

        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                result = item;
                break;
            }
        }

        return result;
    }

    public LibraryItem searchByAuthor(String authorName) {
        LibraryItem result = null;

        for (LibraryItem item : items) {
            if (item.getAuthor().getName().equals(authorName)) {
                result = item;
                break;
            }
        }
        return result;
    }

    public LibraryItem searchByISBN(String ISBN) {
        LibraryItem result = null;

        for (LibraryItem item : items) {
            if (item.getISBN().equals(ISBN)) {
                result = item;
                break;
            }
        }

        return result;
    }

    public void addItem(LibraryItem item) {
        this.items.add(item);
    }

    public void editItem() {
        // TODO
    }

    public void deleteItem(LibraryItem item) {
        this.items.remove(item);
    }

    // author methods
    public void addAuthor(String name, String dateOfBirth) {
        Author author = new Author(name, dateOfBirth);
        this.authors.add(author);
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

    public void listItems() {
        for (LibraryItem item : items) {
            System.out.println(item + "\n");
        }
    }

    // managers
    public void authorManager(Scanner scanner) {
        while (true) {
            Menu.clearScreen();
            System.out.println("Author Management\n");
            System.out.println("1. Add Author");
            System.out.println("2. Edit Author");
            System.out.println("3. Delete Author");
            System.out.println("4. List Authors");
            System.out.println("5. Back to Main Menu\n");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            Menu.clearScreen();

            switch (choice) {
                case 1:
                    System.out.print("Enter author's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter author's date of birth (YYYY-MM-DD): ");
                    String dob = scanner.nextLine();
                    this.addAuthor(name, dob);
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
                    this.editAuthor(oldName, newName, newDob);
                    scanner.nextLine();
                    break;

                case 3:
                    System.out.print("Enter the name of the author to delete: ");
                    String nameToDelete = scanner.nextLine();
                    this.deleteAuthor(nameToDelete);
                    scanner.nextLine();
                    break;

                case 4:
                    this.listAuthors();
                    System.out.print("\nPress any key to continue...");
                    scanner.nextLine();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void itemManager(Scanner scanner) {
        while (true) {
            Menu.clearScreen();
            System.out.println("Item Management\n");
            System.out.println("1. Add Item");
            System.out.println("2. Edit Item");
            System.out.println("3. Delete Item");
            System.out.println("4. List Items");
            System.out.println("5. Back to Main Menu\n");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            Menu.clearScreen();

            switch (choice) {
                case 1:
                    System.out.print("Enter item ID: ");
                    String itemID = scanner.nextLine();
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author name: ");
                    String authorName = scanner.nextLine();

                    Author itemAuthor = null;
                    for (Author author : authors) {
                        if (author.getName() == authorName) {
                            itemAuthor = author;
                            break;
                        }
                    }

                    if (itemAuthor == null) {
                        System.out.print("Enter author DOB: ");
                        String authorDOB = scanner.nextLine();
                        this.addAuthor(authorName, authorDOB);
                        itemAuthor = new Author(authorName, authorDOB);
                    }

                    System.out.print("Enter ISBN: ");
                    String ISBN = scanner.nextLine();
                    System.out.print("Enter publisher: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Number of copies: ");
                    int numCopies = scanner.nextInt();

                    System.out.print("Choose item type:\n");
                    System.out.println("\t1. Periodical");
                    System.out.println("\t2. Book");
                    int type = scanner.nextInt();
                    scanner.nextLine();

                    if (type == 1) {
                        System.out.print("Enter issue number: ");
                        String issueNumber = scanner.nextLine();
                        System.out.print("Enter publication date (YYYY-MM-DD): ");
                        String publicationDate = scanner.nextLine();
                        System.out.print("Enter frequency (daily, monthly, etc): ");
                        String frequency = scanner.nextLine();
                        System.out.print("Choose periodical type:\n");
                        System.out.println("\t1. Printed");
                        System.out.println("\t2. Electronic");

                        int subtype = scanner.nextInt();
                        scanner.nextLine();

                        if (subtype == 1) {
                            System.out.print("Enter number of pages: ");
                            int numPages = scanner.nextInt();

                            PeriodicalPrinted newPrintedPeriodicalItem = new PeriodicalPrinted(itemID, title,
                                    itemAuthor, ISBN, publisher, numCopies, issueNumber, publicationDate, frequency,
                                    numPages);
                            addItem(newPrintedPeriodicalItem);
                        } else if (subtype == 2) {
                            System.out.print("Enter url: ");
                            String url = scanner.nextLine();

                            PeriodicalElectronic newElecPeriodicalItem = new PeriodicalElectronic(itemID, title,
                                    itemAuthor, ISBN, publisher, numCopies, issueNumber, publicationDate, frequency,
                                    url);
                            addItem(newElecPeriodicalItem);
                        }

                    } else if (type == 2) {
                        System.out.print("Enter edition: ");
                        String edition = scanner.nextLine();
                        System.out.print("Enter category: ");
                        String category = scanner.nextLine();
                        System.out.print("Choose book type:\n");
                        System.out.println("\t1. Printed");
                        System.out.println("\t2. Electronic");
                        System.out.println("\t3. Audio");

                        int subtype = scanner.nextInt();
                        scanner.nextLine();

                        switch (subtype) {
                            case 1:
                                System.out.print("Enter number of pages: ");
                                int numPages = scanner.nextInt();
                                System.out.print("Hardcover (true or false): ");
                                boolean hardcover = scanner.nextBoolean();

                                BookPrinted newPrintedBookItem = new BookPrinted(itemID, title, itemAuthor, ISBN,
                                        publisher,
                                        numCopies,
                                        edition, category, numPages, hardcover);
                                addItem(newPrintedBookItem);
                                break;
                            case 2:
                                System.out.print("Enter url: ");
                                String url = scanner.nextLine();
                                System.out.print("DRM (true or false): ");
                                boolean DRMElec = scanner.nextBoolean();

                                BookElectronic newElectronicBookItem = new BookElectronic(itemID, title, itemAuthor,
                                        ISBN,
                                        publisher,
                                        numCopies,
                                        edition, category, DRMElec, url);
                                addItem(newElectronicBookItem);
                                break;
                            case 3:
                                System.out.print("Enter narrator name: ");
                                String narrator = scanner.nextLine();
                                System.out.print("DRM (true or false): ");
                                boolean DRMAudio = scanner.nextBoolean();
                                System.out.print("Enter length (as decimal number): ");
                                double length = scanner.nextDouble();
                                System.out.println("\n");

                                BookAudio newAudioBookItem = new BookAudio(itemID, title, itemAuthor, ISBN, publisher,
                                        numCopies,
                                        edition, category, DRMAudio, length, narrator);
                                addItem(newAudioBookItem);
                                break;
                            default:
                                break;
                        }
                    }

                    System.out.println("");
                    System.out.println("\nItem added successfully.");
                    System.out.println("Press any key to continue...");
                    scanner.nextLine();
                    break;

                case 2:
                    // Option for user to edit by title, author, or ISBN
                    System.out.println("Do you want to edit by 1) Title, 2) Author Name, or 3) ISBN?");
                    int editchoice = scanner.nextInt();
                    scanner.nextLine();
                    switch (editchoice) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    break;

                case 3:
                    // Option for user to delete by title, author, or ISBN
                    System.out.println("Do you want to delete by 1) Title, 2) Author Name, or 3) ISBN?");
                    int delchoice = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    switch (delchoice) {
                        case 1:
                            System.out.print("Enter Title of the item to delete: ");
                            String titleToDelete = scanner.nextLine();
                            LibraryItem itemToDeleteT = searchByTitle(titleToDelete);

                            if (itemToDeleteT != null) {
                                items.remove(itemToDeleteT);
                                System.out.println("Library item deleted.");
                            } else {
                                System.out.println("Library item not found.");
                            }
                            break;
                        case 2:
                            System.out.print("Enter Author Name of the item to delete: ");
                            String authorToDelete = scanner.nextLine();
                            LibraryItem itemToDeleteA = searchByAuthor(authorToDelete);

                            if (itemToDeleteA != null) {
                                items.remove(itemToDeleteA);
                                System.out.println("Library item deleted.");
                            } else {
                                System.out.println("Library item not found.");
                            }
                            break;
                        case 3:
                            System.out.print("Enter ISBN of the item to delete: ");
                            String isbnToDelete = scanner.nextLine();
                            LibraryItem itemToDeleteI = searchByISBN(isbnToDelete);

                            if (itemToDeleteI != null) {
                                items.remove(itemToDeleteI);
                                System.out.println("Library item deleted.");
                            } else {
                                System.out.println("Library item not found.");
                            }
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                    System.out.println("\nPress any key to continue...");
                    scanner.nextLine();
                    break;

                case 4:
                    this.listItems();
                    System.out.print("Press any key to continue...");
                    scanner.nextLine();
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    };

    public void patronManager(Scanner scanner) {
    };
}