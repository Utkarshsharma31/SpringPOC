package springpoc1;

public class Student {

    private String StudentID;
    private String StudentName;

    private String StudentAddress;

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }


    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    public Student(String studentID, String studentName, String studentAddress) {
        StudentID = studentID;
        StudentName = studentName;
        StudentAddress = studentAddress;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID='" + StudentID + '\'' +
                ", StudentName='" + StudentName + '\'' +
                ", StudentAddress='" + StudentAddress + '\'' +
                '}';
    }
}
