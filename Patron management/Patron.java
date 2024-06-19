public class Patron {

    private String name;
    private String address;
    private String phoneNumber;
    private Boolean employee;
    
    public Patron(String name, String address, String phoneNumber, Boolean employee) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.employee = employee;
    }
}