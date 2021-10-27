package Assignment_9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static boolean checkExpression(String word){
        Pattern pattern = Pattern.compile("[A-Z][\\w\\s.]*");
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String word = scanner.next();
        System.out.println(checkExpression(word));
    }
}
