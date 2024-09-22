// uy
/*             ACCESS MODIFIERS
 *
 *  A. FOR METHODS
 *    1.  For you to access a static method, you don't need to creat an object.
 *          you just call it    myStaticMethod.
 *    2.  For you to access a public method, you need to creat an object.
 *        So you can call it.
 *
 *  B. FOR ATTRIBUTES/ VARIABLES
 *
 *      1. Default
 *          Accessible in the package In the Package
 *
 *      2. Private
 *          a) Accessible in the class they are declared
 *          b) Method to access : Encapsulation
 *
 *      3. Protected
 *          a) Accessible in the Package
 *          b) Method to access : Inheritance
 *
 *      4. Public
 *          a) Accessible everywhere
 *          b) Method to access : Create an object
 *
 *      5. Static Non-Access Modifier
 *          a) Accessible Without an object
 *          b) Method to access : Just call the Method or the Attribute
 *
*/
package QUESTION_4;

import java.util.ArrayList;

public class Test_Department extends Courses {
    public String Department_Name;
    public ArrayList<String> TheCourseList;

    public Test_Department(String department_Name) {
        super(department_Name);
        this.TheCourseList = new ArrayList<>();
    }

    public static void main(String[] args) {

        System.out.println("\n\t\t\t\t\t WELCOME TO THE COMPUTER SCIENCE DEPARTMENT");

        // Accessing to Protected Attribute, ArrayList and Methods of the Course Class by ENCAPSULATION
        System.out.println("\n\t\t [1] HERE IS THE LIST OF \"COURSES\" IN BSCS Y2-S1");

        Courses CoursesObject_Dep = new Courses("Object Oriented Programming ||");
        CoursesObject_Dep.setCourse_Name("Computer NetWork ||");
        CoursesObject_Dep.setCourse_Name("Computer NetWork ||");
        CoursesObject_Dep.setCourse_Name("Responsive Web Design ||");
        CoursesObject_Dep.getCourse_Name_List().add("Numerical Method ||");
        CoursesObject_Dep.getCourse_Name_List();
        System.out.println("\n\t\t\t\t" + CoursesObject_Dep.getCourse_Name_List());

        // Accessing to Private Attribute and ArrayList by ENCAPSULATION
        System.out.println("\n\t\t [2] HERE IS THE LIST OF \"STUDENT\" IN BSCS Y2-S1");

        Students StudentObject_Dep = new Students("Danne", "24-276-BSCS-S", 20);
        StudentObject_Dep.setName_Std("Thod");
        StudentObject_Dep.setName_Std("Tricie");
        System.out.println("\n\t\t\t\t STUDENT NAMES ARE :  " + StudentObject_Dep.getStudent_Name_List());

        // Accessing to Public Attribute, ArrayList and Method Using ENCAPSULATION
        System.out.println("\n\t\t [3] HERE IS THE LIST OF \"PROFESSORS\" IN BSCS Y2-S1 ");
        Professors ProfessorsObject_Dep = new Professors("KATO KANNETH ||");
        ProfessorsObject_Dep.setProfessor_Name("HAKIM ||");
        ProfessorsObject_Dep.setProfessor_Name("BARNABUS ASIGYE ||");
        ProfessorsObject_Dep.setProfessor_Name("KANNETH WATITI ||");
        ProfessorsObject_Dep.setProfessor_Name("DR. MUGABE ||");
        System.out.println("\n\t\t\t\t "+ ProfessorsObject_Dep.getProfessor_Name_List());
    }
}
