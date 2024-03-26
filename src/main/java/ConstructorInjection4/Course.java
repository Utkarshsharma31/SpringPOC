package ConstructorInjection4;

public class Course {

    private String Name;

    public Course(String Name) {
        this.Name = Name;
    }

    public Course() {
        super();
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + Name + '\'' +
                '}';
    }
}
