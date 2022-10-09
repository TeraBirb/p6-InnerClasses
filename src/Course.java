public class Course {

    private String name;
    private Grade grade;

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public Course(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    static enum Grade {
        A,
        B,
        C,
        D,
        F
    }

}
