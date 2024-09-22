
package QUESTION_2;

import static QUESTION_2.Question_2.*; // I import the whole Question_2 class  In the Package named QUESTION_2 // this is like specifying the path from the SRC

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t [1] ACCESSING THE THE STATIC VARIABLE WITHOUT A METHOD\n\t\t\t@ THESE ARE STATIC VARIABLES INITIALIZED IN THE STATIC BLOC");
        System.out.println("\t\t\t\t The Employee's Name Is : " + Name + "\n\t\t\t\t The Employee's Id Is   : " + Id);

        System.out.println("\n\t\t [2] ACCESSING THE INSTANCE VARIABLE BY THE CONSTRUCTOR (USING AN OBJECT & THE INSTANCE OF THAT OBJECT) \n\t\t\t @ THESE ARE VARIABLES INITIALIZED IN THE CONSTRUCTOR");
        Question_2 employeeDetails = new Question_2(35, 10000);
        System.out.println("\t\t\t\t The Employee's Age is    : " + employeeDetails.Age + "\n\t\t\t\t The Employee's Salary is : " + employeeDetails.Salary);

        System.out.println("\n\t\t [3] ACCESSING ALL THE CLASS'S VARIABLE THOUGH METHODS (GETTER & SETTER ==> SETGET) \n\t\t\t @ THESE ARE ALL VARIABLES OF THE CLASS");
        String setPrint_Name = employeeDetails.setGetName("Trici");
        String setPrint_Id = employeeDetails.setGetId("35-387-BSCS-S");
        int setPrint_Age = employeeDetails.setGetAge(40);
        int setPrint_Salary = employeeDetails.setGetSalary(15000);
        System.out.println("\t\t\t\t The Employee's name is   : " + setPrint_Name + "\n\t\t\t\t The Employee's Id Is \t  : " + setPrint_Id + "\n\t\t\t\t The Employee's Age is    : " + setPrint_Age + "\n\t\t\t\t The Employee's Salary is : " + setPrint_Salary);

    }
}

// UY uy
//System.out.println("######################################################################################################################################################## \n##### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t####\n##### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t####");
