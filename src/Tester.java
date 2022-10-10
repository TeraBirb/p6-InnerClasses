public class Tester {

    public static void main(String[] args) {

        StudentRecordManager testSRM = new StudentRecordManager();
        testSRM.addStudent("Matt", "Damon", 5239);
        testSRM.getStudent(0).addCourse("CIS 34B", Course.Grade.A);

        testSRM.printTranscript(testSRM.getStudent(0));
        testSRM.printAllTranscripts();


    }

}
