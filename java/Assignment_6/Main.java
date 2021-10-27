package Assignment_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayOfObjects references[] = new ArrayOfObjects[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<references.length;i++){
            System.out.println("Enter the name :");
            String name = scanner.next();
            references[i] = new ArrayOfObjects(name);
        }
    }
}
