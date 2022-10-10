public class Tester {

    public static void main(String[] args) {

        StudentRecordManager testSRM = new StudentRecordManager();
        testSRM.addStudent("Matt", "Damon", 5239);
        testSRM.getStudent(0).addCourse("CIS 34B", Course.Grade.A);
        testSRM.getStudent(0).addCourse("PHYS 68", Course.Grade.B);
        testSRM.addStudent("Johnny", "Bravo", 8237);
        testSRM.getStudent(1).addCourse("SOC 5", Course.Grade.D);
        testSRM.getStudent(1).addCourse("COMM 5", Course.Grade.D);
        testSRM.addStudent("Peter", "Pan", 6289);
        testSRM.getStudent(2).addCourse("BIO 1", Course.Grade.B);
        testSRM.addStudent("Geoff", "Baysos", 1031);
        testSRM.getStudent(3).addCourse("BUS 99", Course.Grade.C);
        testSRM.getStudent(3).addCourse("BUS 31", Course.Grade.A);
        testSRM.getStudent(3).addCourse("BUS 100", Course.Grade.B);
        testSRM.addStudent("Marc", "Soucherburgh", 2865);
        testSRM.getStudent(4).addCourse("CIS 6", Course.Grade.F);
        testSRM.getStudent(4).addCourse("PSYCH 101", Course.Grade.F);

        System.out.println("Printing student 8237 transcript:");
        testSRM.printTranscript(testSRM.searchByID(8237));
        System.out.println("Printing all transcripts:");
        testSRM.printAllTranscripts();

        System.out.println("Printing searchByID 1031:");
        System.out.println(testSRM.searchByID(1031));
        System.out.println("\nRemoving student at index 4");
        testSRM.removeStudent(4);
        System.out.println("\nPrinting all transcripts:");
        testSRM.printAllTranscripts();

    }

}
