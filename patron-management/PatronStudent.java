
public class PatronStudent extends Patron {
    
    String studentId;

    //constructor
    public PatronStudent(String name, String address, String phoneNumber, String type, String studentId) {
        super(name, address, phoneNumber, type);


        this.studentId = studentId;

    }

    //getters and setters

    public String getStudentId(String studentId) {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
