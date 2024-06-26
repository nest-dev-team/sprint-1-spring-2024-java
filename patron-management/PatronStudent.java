public class PatronStudent extends Patron {
    // instance variables
    String studentId;

    // constructor
    public PatronStudent(String name, String address, String phoneNumber, String studentId) {
        super(name, address, phoneNumber);
        this.studentId = studentId;
    }

    // getters and setters
    public String getStudentId(String studentId) {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
