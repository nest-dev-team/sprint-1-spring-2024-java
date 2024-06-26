public class PatronEmployee extends Patron {
    // instance variables
    String employeeId;

    // constructor
    public PatronEmployee(String name, String address, String phoneNumber, String employeeId) {
        super(name, address, phoneNumber);
        this.employeeId = employeeId;
    }

    // getters and setters
    public String getEmployeeId(String employeeId) {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}