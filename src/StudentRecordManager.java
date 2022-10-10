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

    public void addStudent(String firstName, String secondName, int ID) {
        students.add(new Student(firstName, secondName, ID));
    }

    public Student searchByID(int id) {

        Iterator <Student> i = this.iterator();

        while (i.hasNext()) {
            Student s = i.next();
            if (s.getID() == id) {
                return s;
            }
        }

        return null;
    }

    public void printTranscript(Student student) {  // use student getters and inner class
        new TranscriptPrinter().print(student);
    }

    public void printAllTranscripts() { // use inner class
        new TranscriptPrinter().printAll();
    }

    public Iterator<Student> iterator() {
        return students.iterator();
    }

    private class TranscriptPrinter {

        // single print
        public void print(Student student) {
            System.out.println(student.getFirstName() + " " + student.getSecondName() + " " + student.getID());
            for (Course course : student.getCourses()) {
                System.out.println(course.getName() + " Grade: " + course.getGrade());
            }
            System.out.println();
        }

        // all print
        public void printAll() {
            for (Student student : students) {
                System.out.println(student.getFirstName() + " " + student.getSecondName() + " " + student.getID());
                for (Course course : student.getCourses()) {
                    System.out.println(course.getName() + " Grade: " + course.getGrade());
                }
                System.out.println("-----");
            }
        }

    }

}
