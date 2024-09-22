// The aggregation helps you to use a method of another class (you don't import the entire class)
/*
* Question : Do we transforme the StudentID (the contained class) into an object such as "String" object or "int" Object
*            when we want to use the agregation ?
*/

package QUESTION_3;

import java.util.ArrayList;

public class Student {                  // This Car Class is the Aggregate (container) Class
    private String Name;
    private ArrayList<StudentID> student_ID = new ArrayList();

    public Student(String Name) {  // The Constructor
        this.Name = Name;
        //studentIDS = new ArrayList<>();
    }

    public void addStudentID(StudentID studentId){
        student_ID.add(studentId);
    }

    public void printDetails() {
        System.out.println(" The Student Name is : " + Name);
        for(StudentID studentID : student_ID){
            System.out.println("\n Student Id is : " + studentID.getThe_ID());
        }
    }
}
