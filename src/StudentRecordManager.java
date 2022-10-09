import java.util.ArrayList;
import java.util.Iterator;

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

    public Student searchByID(int id) {     // use iterator instance method
        return students.get(id); // temp
    }

    public void printTranscript(Student student) {  // use student getters and inner class
        System.out.println();
    }

    public void printAllTranscripts() { // use inner class

    }

    public Iterator<Student> iterator() {
        return students.iterator();
    }

    private class TranscriptPrinter {

    }

}
