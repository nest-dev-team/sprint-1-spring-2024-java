import java.util.Scanner;

public class MainZH {
    
     public static void main(String[] args) {

        //makes refrencing Scanner(System.in) easier
        Scanner scanner = new Scanner(System.in);

        //gives user options for what they want to do
        System.out.println("1: Add new Patron");
        System.out.println("2: Edit existing Patron");
        System.out.println("3: Delete Patrons");
        int addEditDel = scanner.nextInt();

        
        if (addEditDel == 1) {
            //creates new patron
            Patron patron1 = new Patron();

            //asks for the patrons information
            System.out.println("_____");
            System.out.println("Name:");
            patron1.name = scanner.nextLine();
            
            System.out.println("");
            System.out.println("Address:");
            patron1.address = scanner.nextLine();

            System.out.println("");
            System.out.println("Phone Number:");
            patron1.phoneNumber = scanner.nextLine();

            System.out.println("");
            System.out.println("Is Patron an employee?:");
            patron1.employee = scanner.nextBoolean();

            System.out.println("");
            System.out.println("Amount of books checked out by " + patron1.name + ":");
            

            System.out.println("");
            System.out.println("Enter checked out books ONE BY ONE:");
            System.out.println("");
            
            //a loop that allows the user to input all of the books into the array
            int counter = 0;
            while (counter < patron1.libraryItems.length) {
                patron1.libraryItems[counter] = scanner.nextLine();
                System.out.println("Book entered");
                System.out.println("");

                counter += 1;
            }
            


        } else if (addEditDel == 2) {
            System.out.println("_____");
            System.out.println("2");
        } else if (addEditDel == 3) {
            System.out.println("_____");
            System.out.println("3");
        };

        scanner.close();
        System.out.println("");
    }
}
