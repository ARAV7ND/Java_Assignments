package Assignment_7.Interface;

class ConcreteClass{

}
public class ArithmeticOperations extends ConcreteClass implements NewInterface {

    public int addition(int a, int b) {
        return a+b;
    }

   public int subtraction(int a, int b) {
        return a-b;
   }

   public int increment(int number) {
        return ++number;
   }

   public int decrement(int number) {
        return --number;
   }

   public int mutiply(int a, int b) {
        return a * b;
   }

   public int division(int a, int b) {
        return a/b;
   }

   public String greetings() {
       return "Hello, Folks";
   }


    public void interfaceOne(InterfaceOne interfaceOne){
        System.out.println(interfaceOne.addition(10,20));
    }

    public void interfaceTwo(InterfaceTwo interfaceTwo){
        System.out.println(interfaceTwo.mutiply(10,20));
    }

    public void interfaceThree(InterfaceThree interfaceThree){
        System.out.println(interfaceThree.decrement(10));
    }

    public void interfaceFour(NewInterface newInterface){
        System.out.println(newInterface.greetings());
    }
}
