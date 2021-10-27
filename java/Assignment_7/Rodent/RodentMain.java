package Assignment_7.Rodent;


abstract class Rodent {
    public abstract void eat();
    public abstract void run();
}

class Mouse extends Rodent{
    public Mouse(){
        System.out.println("i'm in Mouse class");
    }
    public void run(){
        System.out.println("Mouse is running..!");
    }
    public void eat(){
        System.out.println("Mouse is eating..!");
    }
}

class Gerbil extends Rodent{
    public Gerbil() {
        System.out.println("i'm in Gerbil class");
    }

    public void run(){
        System.out.println("Gerbil is running..!");
    }
    public void eat(){
        System.out.println("Gerbil is eating..!");
    }
}

class Hamster extends Rodent{
    public Hamster() {
        System.out.println("i'm in Hamster class");
    }

    public void run(){
        System.out.println("Hamster is running..!");
    }
    public void eat(){
        System.out.println("Hamster is eating..!");
    }
}
public class RodentMain {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

        rodents[0].eat();
        rodents[0].run();

        rodents[1].eat();
        rodents[1].run();

        rodents[2].eat();
        rodents[2].run();

    }
}
