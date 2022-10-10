public class Tester {

    public static void main(String[] args) {

        StudentRecordManager testSRM = new StudentRecordManager();
        testSRM.addStudent("Matt", "Damon", 5239);
        testSRM.getStudent(0).addCourse("CIS 34B", Course.Grade.A);
        testSRM.addStudent("Johnny", "Bravo", 8237);
        testSRM.getStudent(1).addCourse("SOC 5", Course.Grade.D);
        testSRM.addStudent("Peter", "Pan", 6289);
        testSRM.getStudent(2).addCourse("BIO 1", Course.Grade.B);
        testSRM.addStudent("Geoff", "Baysos", 1031);
        testSRM.getStudent(3).addCourse("BUS 99", Course.Grade.C);
        testSRM.addStudent("Marc", "Soucherburgh", 2865);
        testSRM.getStudent(4).addCourse("CIS 6", Course.Grade.F);

        testSRM.printTranscript(testSRM.searchByID(8237));
        testSRM.printAllTranscripts();

        System.out.println(testSRM.searchByID(2865));
//        testSRM.removeStudent(4);
//        testSRM.printAllTranscripts();

    }

}
