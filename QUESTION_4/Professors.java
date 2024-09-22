package QUESTION_4;

import java.util.ArrayList;

public class Professors {
    public String Professor_Name;
    public ArrayList<String> Professor_Name_List = new ArrayList<>();

    public Professors(String professor_Name) {      // The Constructor
        this.Professor_Name = professor_Name;
        this.Professor_Name_List.add(Professor_Name);
    }

    // Getting and setting Professor_Name to the Professor List

    public String getProfessor_Name() {
        return Professor_Name;
    }
    public void setProfessor_Name(String professor_Name) {
        Professor_Name = professor_Name;
        this.Professor_Name_List.add(Professor_Name);
    }

    // Getter and Setter for the Professor_Name_list

    public ArrayList<String> getProfessor_Name_List() {
        return Professor_Name_List;
    }
    public void setProfessor_Name_List(ArrayList<String> professor_name_list) {
        Professor_Name_List = professor_name_list;
    }

    public static void main(String[] args) {

        System.out.println("\n\t\t\t WELCOME TO THE PROFESSOR PROGRAM \n\n\t\t [1] THE PROFESSOR LIS IS : \n");

        Professors ProfessorObject = new Professors("KATO KANNETH");
        ProfessorObject.setProfessor_Name("HAKIM");
        ProfessorObject.setProfessor_Name("BARNABUS ASIGYE");
        ProfessorObject.setProfessor_Name("KANNETH WATITI");
        ProfessorObject.setProfessor_Name("DR. MUGABE");
        System.out.println(ProfessorObject.getProfessor_Name_List());
    }
}
