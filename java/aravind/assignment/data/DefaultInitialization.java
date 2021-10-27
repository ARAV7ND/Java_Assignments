package aravind.assignment.data;

public class DefaultInitialization {
    int marks;
    char grade;
    public void displayInstanceVariables(){
        System.out.println("Marks : "+marks+", Grade : "+grade);// default values will be printed
    }
    public void displayLocalVariables(){
        int totalMarks;
        double averageMarks;


        /* the rule of thumb for local variables is they should be intialize when ever we declare a local variable
            System.out.println("Total Marks : "+totalMarks+", Average Marks : "+averageMarks); // so it will be compilation error
        */

    }
}
