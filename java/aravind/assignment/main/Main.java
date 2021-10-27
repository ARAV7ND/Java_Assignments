package aravind.assignment.main;

import aravind.assignment.data.DefaultInitialization;
import aravind.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        DefaultInitialization defaultInitialization = new DefaultInitialization();
    /*
        it will prints the default values but we have an error in that class so it won't  be invoked
        defaultInitialization.displayInstanceVariables();


        it will be compilation error since we're not intializing values to the variables
        defaultInitialization.displayLocalVariables();
     */
        Singleton obj1 = Singleton.setMember("HAI");
        obj1.display(); // prints HAI
        Singleton obj2 = Singleton.setMember("HELLO");
        obj1.display(); //prints HAI since its a singleton class only one instance will get created even if we try to create multiple instances

    }
}
