package Assignment_7.Cycle;
class Cycle {

}

class Bicycle extends Cycle{
    public void balance(){
        System.out.println("Balancing Bicycle..!");
    }
}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("Balancing Unicycle..!");
    }
}
class Tricycle extends Cycle{

}

public class Main {
    public static void main(String[] args) {

        Bicycle bicycleObj = new Bicycle();
        Unicycle unicycleObj = new Unicycle();
        Tricycle tricycleObj = new Tricycle();

        Cycle[] objects = new Cycle[3];
        objects[0] = (Cycle)bicycleObj; // upcasting
        objects[1] = (Cycle)unicycleObj;
        objects[2] = (Cycle)tricycleObj;

/*       for(Cycle obj : objects){
             obj.balance();  it results to compilation error because balance method is not present in base class
          }
 */


        ((Bicycle) objects[0]).balance(); // it works
        ((Unicycle) objects[1]).balance(); // it works

//        ((Tricycle) objects[2]).balance(); // compilation error because Tricycle didn't have balance method


    }
}
