import java.util.ArrayList;

public class StudentRecordManager {

    private ArrayList<Student> students = new ArrayList<>();

    public Student getStudent(int index) {
        return students.get(index);
    }

    public void removeStudent(int index) {
        students.remove(index);
    }

    public void addStudent() {      // constructor-ish

    }

    public Student searchByID(int id) {

    }

    private class TranscriptPrinter {

    }

}
