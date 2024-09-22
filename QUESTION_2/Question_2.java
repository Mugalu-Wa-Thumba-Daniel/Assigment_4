// UY uy
// //There is no need to create instances of the class to access a static variable

package QUESTION_2;

public class Question_2 {
    static String Name;             // 1. Static Variables      (Name and Id are Static Variables)
    static String Id;
    int Age;                        // 3.A. Instance Variables    (Age and Salary are Instance Variables
    int Salary;

    static {                        //2. Static Block           (This is a Static Bloc)
        Name = "Danne";
        Id = "24-276-BSCS-S";
    }

    public Question_2 (int age, int salary){    //4. The Constructor 3.B. Initialize Instance Variable in the Constructor
        this.Age = age;
        this.Salary = salary;
    }
                                    //5. Include Methods (if necessary) that allow access to both the static variables and the instance variables.
    public String setGetName(String name) {
        this.Name = name;
        return Name;
    }

    public String setGetId(String id) {
        this.Id = id;
        return Id;
    }

    public int setGetAge(int age) {
        this.Age = age;
        return Age;
    }
    public int setGetSalary(int salary) {
        this.Salary = salary;
        return Salary;
    }
}