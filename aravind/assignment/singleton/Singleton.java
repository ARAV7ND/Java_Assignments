package aravind.assignment.singleton;

public class Singleton {
    String member;
    public static Singleton setMember(String member){

//        this.member = member;// it is not possible to access non static members inside a static block or method

        return new Singleton();

    }
    public void display(){
        System.out.println(member); // it prints null since member object not conatining any characters inside it
    }


}
