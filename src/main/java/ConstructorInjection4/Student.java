package ConstructorInjection4;

public class Student {
    private String studentName;

    private String className;

    private Course courseName;

    public Student(String studentName, String className, Course courseName) {
        this.studentName = studentName;
        this.className = className;
        this.courseName = courseName;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", className='" + className + '\'' +
                ", course=" + courseName +
                '}';
    }
}
