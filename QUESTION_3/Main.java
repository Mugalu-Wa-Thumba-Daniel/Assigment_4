package QUESTION_3;

public class Main {                             // The Main class helps us to execute
    public static void main(String[] args) {
        System.out.println("\n");
        Student student = new Student("Danne");
        student.addStudentID(new StudentID("24-276-BSCS-S"));
        //student.addStudentID(new StudentID("35-387-BSCS-S"));
        student.printDetails();
    }
}
