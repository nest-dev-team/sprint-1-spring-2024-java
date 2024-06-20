
public class PatronEmployee extends Patron {
    //add more stuff here
    String employeeId;

    //constructor
    public PatronEmployee(String name, String address, String phoneNumber, String type, String employeeId) {
        super(name, address, phoneNumber, type);


        this.employeeId = employeeId;

    }

    //getters and setters

    public String getEmployeeId(String employeeId) {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}