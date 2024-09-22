/* uy */

// Instance Variable Initialization
// Instance Initialization Block
// Constructor
// Methods
// Demonstration

package QUESTION_1;

public class Question_1 {
                                    //1. Instance variables
    String Name;
    final String Id;                // check the question for this variable part
    int Age;
    int Grade;
    {                               //2.A. The instance initialization Block (IIB)
        Name = "Danne";
        Id = "24-276-BSCS-S";       //2.B. The IIB should assure that the unique value is assigned to each instance
        System.out.println("\t\t THIS IS THE IIB INITIALIZATION \n\t\t\t The Student Name is : " + Name + "\n\t\t\t The Student Id is   : " + Id);
    }
    public Question_1(int age, int grade) {     // 3. The constructor initialization for the other variables
        this.Age=age;
        this.Grade=grade;
    }
                                                //4. Include getter methods for both instance variables ...
    public int getAge() {
        return Age;
    }
    public int getGrade() {
        return Grade;
    }
    public String getName(){
        return Name;
    }
    public String getId(){
        return Id;
    }
    public void setName(String name) {  //DRY!?// Setter for the age DRY !?!?!?
        this.Name = name;
        System.out.println("\t\t\t The name you've set is \t: " + Name + "\t\t\t\t [Note that the name has ben overwritten no matter the fact it's initialized in the IIB for it it's not a FINAL variable.]");
    }

    public void setId(){
        System.out.println("\t\t\t The id can't be Set again \t: " + Id + "\t\t [Note That the ID can't be overwritten because it's a FINAL variable]");
        //this.Id=id; // We Can't set another Value to the Id because it's a final Variable
    }

    public void setAge(int age){
        this.Age = age;
        System.out.println("\t\t\t The Age you've Set is \t\t: " + Age);
    }

    public void setGrade(int grade) {
        this.Grade = grade;
        System.out.println("\t\t\t The Grade you've Set is \t: " + Grade);
    }

}
            /* QUESTIONS TO FIND THE GOOD WAY TO WRITE JAVA CODE */
/*
* If the Class named Question_1 is made to initialize variables and methods (function)
* And the class named main is supposed to execute instruction of the class named Question
* SO IN WHICH CLASS ARE WE SUPPOSED TO USE SCANNER METHOD TO SET VALUES TO OUR APPLICATION and where do we initialize it (Project)
* */

/*
 * Why did we use the Getter and setter methods for the IIB if we don't need to set
 * a value to theme because we did it in the IIB when whe we initialized It ???
 * Why don't we just call the variable in an instance (using an object) to avoid the DRY statement ?
 * */