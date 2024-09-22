package QUESTION_4;

import java.util.ArrayList;

public class Students {
    private String Name_Std;
    private String Id_Sdt;
    private int Age_Std;
    private ArrayList<String> Student_Name_List = new ArrayList<>();
    private ArrayList<String> Student_Id_List = new ArrayList<>();
    private ArrayList<Integer> Student_Age_List = new ArrayList<>();

    public Students(String name_Std, String id_Std, int age_Std) { // THE CONSTRUCTOR
        this.Name_Std = name_Std;
        this.Id_Sdt = id_Std;
        this.Age_Std = age_Std;
        this.Student_Name_List.add(Name_Std);
        this.Student_Id_List.add(Id_Sdt);
        this.Student_Age_List.add(Age_Std);
    }
    // Getter and Setter for the "Name_Std". ||| And adding to the "Student_Name_List"
    private String getName_Std() {
        return Name_Std;
    }
    public void setName_Std(String Enter_Std_Name) {
        Name_Std = Enter_Std_Name;
        this.Student_Name_List.add(Name_Std);
    }

    // Getter and Setter for the "Id_Std" ||| And the "Student_Age_List"
    private String getId_Sdt() {
        return Id_Sdt;
    }
    private void setId_Sdt(String Enter_Std_Id) {
        Id_Sdt = Enter_Std_Id;
        this.Student_Id_List.add(Id_Sdt);
    }

    // Getter and Setter of the "Age_Std" ||| And the "Student_Age_List
    private int getAge_Std() {
        return Age_Std;
    }
    private void setAge_Std(int Enter_Std_Age) {
        Age_Std = Enter_Std_Age;
        this.Student_Age_List.add(Age_Std);
    }

    // Let return all the Lists
    public ArrayList<String> getStudent_Name_List() {
        return Student_Name_List;
    }
    private ArrayList<String> getStudent_Id_List() {
        return Student_Id_List;
    }
    private ArrayList<Integer> getStudent_Age_List() {
        return Student_Age_List;
    }

    // Let Reset All the List
    private void setStudent_Name_List(ArrayList<String> Student_Name_List) {
        this.Student_Name_List = Student_Name_List;
    }
    private void setStudent_Id_List(ArrayList<String> Student_Id_List) {
        this.Student_Id_List = Student_Id_List;
    }
    private void setStudent_Age_List(ArrayList<Integer> Student_Age_List) {
        this.Student_Age_List = Student_Age_List;
    }

    public static void main(String[] args){

        System.out.println("\n\t\t\t WELCON TO THE STUDENT PROGRAM \n");

        Students StudentObject = new Students("Danne", "24-276-BSCS-S", 20);
        StudentObject.setName_Std("Thod");
        StudentObject.setName_Std("Tricie");
        System.out.println("\t [1] STUDENT NAMES ARE : \n\n\t\t\t" + StudentObject.getStudent_Name_List());

        StudentObject.setId_Sdt("35-387-BSCS-S");
        StudentObject.setId_Sdt("45-498-BSCS-S");
        System.out.println("\n\t [2] STUDENT IDs ARE : \n\n\t\t\t" + StudentObject.getStudent_Id_List());

        StudentObject.setAge_Std(25);
        StudentObject.setAge_Std(30);
        System.out.println("\n\t [3] STUDENT AGES ARE : \n\n\t\t\t" + StudentObject.getStudent_Age_List());
    }
}
