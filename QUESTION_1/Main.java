// UY uy
// \n\t\t #####

package QUESTION_1;

public class Main {
    public static void main(String[] args) {

        System.out.println("######################################################################################################################################################## \n##### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t####\n##### \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t####");

        // Call of the CONSTRUCTOR & Set of it parameters & Creation of the Student_Info Object
        Question_1 Student_Info = new Question_1(45, 5);

        System.out.println("\n\t\t (GETTER) THESE ARE THE RETURNED VALUES WE INITIALIZED IN THE CONSTRUCTOR ");
        int print_Returned_Std_Age = Student_Info.getAge();
        int print_Returned_Std_Grade = Student_Info.getGrade();
        System.out.println("\t\t\t The Student age is : " + print_Returned_Std_Age + "\n\t\t\t The Student Grade is : " + print_Returned_Std_Grade);

        System.out.println("\n\t\t (GETTER)THE RETURNED VALUES FROM THE IIB ARE ");
        String print_Returned_Std_Name = Student_Info.getName();
        String print_Returned_Std_Id = Student_Info.getId();
        System.out.println("\t\t\t The Student Name is : " + print_Returned_Std_Name + "\n\t\t\t The Student ID is : " + print_Returned_Std_Id);

        System.out.println("\n\t\t (SETTER) THE OVERWRITTEN VALUES FROM THE SETTER METHOD ARE : ");
        Student_Info.setName("Thod");
        Student_Info.setId(); // No matter the parameter you can assign to this SetId() method it won't overwrite the Id value for it's a FINAL variable
        Student_Info.setAge(25);
        Student_Info.setGrade(6);
    }
}
