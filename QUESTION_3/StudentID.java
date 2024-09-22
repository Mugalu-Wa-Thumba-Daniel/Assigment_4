// The aggregation helps you to use a method of another class (you don't import the entire class)

package QUESTION_3;

public class StudentID {                // This StudentID class is the Contained
    private String The_ID;

    public StudentID(String Id) {     // The Constructor
        this.The_ID = Id;
    }

    public String getThe_ID() {
        return The_ID;
    }
}