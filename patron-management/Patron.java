import java.util.List;
//import list

public abstract class Patron {
    //instance variables
    private String name;
    private String address;
    private String phoneNumber;
    private String type;
    private List<LibraryItem> itemsBorrowed;
    
    //constructor
    public Patron(String name, String address, String phoneNumber, String type) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.type = type;

    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<LibraryItem> getItemsBorrowed() {
        return itemsBorrowed;
    }

    public void setItemsBorrowed(List<LibraryItem> itemsBorrowed) {
        this.itemsBorrowed = itemsBorrowed;
    }

    //methods
    public void addItemBorrowed(LibraryItem item) {
        this.itemsBorrowed.add(item);
    }

    public void removeItemBorrowed(LibraryItem item) {
        Boolean result = this.itemsBorrowed.remove(item);
        if (result) {
            System.out.println("Item removed from list");
        } else {
            System.out.println("Item not in list");
        }
    }


    @Override
    public String toString() {
        return String.format("Patron name: %s, Address: %s, Phone number: %s, Patron Type: %s", name, address, phoneNumber, type);
    }
}