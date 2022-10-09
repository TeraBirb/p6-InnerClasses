import java.util.ArrayList;

public class Student {

    private ArrayList<Course> courses = new ArrayList<>();
    private String firstName;
    private String secondName;
    private int ID;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getID() {
        return ID;
    }

    public void addCourse(String name, Course.Grade Grade) {   // use
        courses.add(new Course(name, Grade));
    }


}
