package Assignment_7.Inner_classes;

class OuterClassOne {
    public class InnerClassOne {
        int id;
        public InnerClassOne(int id){
            this.id = id;
        }
    }
}
class OuterClassTwo {
    public class InnerClassTwo extends OuterClassOne.InnerClassOne {
        public InnerClassTwo(OuterClassOne outerClass, int id){
            outerClass.super(id);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        OuterClassOne outerClassOne = new OuterClassOne();
        OuterClassTwo outerClassTwo = new OuterClassTwo();
        OuterClassTwo.InnerClassTwo innerClassTwo = outerClassTwo.new InnerClassTwo(outerClassOne,7);
        System.out.println(innerClassTwo.id);
    }
}
