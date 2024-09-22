package QUESTION_4;
import java.util.*;

public class Courses {
    protected String Course_Name;
    protected ArrayList<String> Course_Name_List = new ArrayList<>();

    protected Courses(String course_Name) {        // The Constructor
        this.Course_Name = course_Name;
        this.Course_Name_List.add(Course_Name);
    }

    // Add courses to the course list
    protected String getCourse_Name() {
        return Course_Name;
    }
    protected void setCourse_Name(String course_Name) {
        Course_Name = course_Name;
        this.Course_Name_List.add(Course_Name);
    }

    // Getter and Setter for the List
    protected ArrayList<String> getCourse_Name_List() {
        return Course_Name_List;
    }
    protected void setCourse_Name_List(ArrayList<String> course_Name_List) {
        Course_Name_List = course_Name_List;
    }

    public static void main(String[] args){

        System.out.println("\n\t\t\t WELCOME TO THE COURSES PROGRAM \n\n\t [1] HERE ARE SOME COURSES OF THE SECOND YEAR IN COMPUTER SCIENCE \n\t");

        Courses CoursesObject = new Courses("Object Oriented Programming ||");
        CoursesObject.setCourse_Name("Computer NetWork ||");
        CoursesObject.setCourse_Name("Data Structures and Algorithms ||");
        CoursesObject.setCourse_Name("Responsive Web Design ||");
        CoursesObject.getCourse_Name_List().add("Numerical Method ||");
        System.out.println(CoursesObject.getCourse_Name_List());
    }
}
