package Assignment_6;

public class ArrayOfObjects {
    public ArrayOfObjects(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        ArrayOfObjects[] references = new ArrayOfObjects[5];
    }
}

// print statement is won't be invoked because here objects are not created only null references of type object were created