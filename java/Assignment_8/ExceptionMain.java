package Assignment_8;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}
class InvalidGenderException extends Exception{
    public InvalidGenderException(String message) {
        super(message);
    }
}
class InvalidAccountException extends Exception{
    public InvalidAccountException(String message) {
        super(message);
    }
}

public class ExceptionMain {
    public static void validateAge(int age) throws InvalidAgeException{
        if(age<10){
            throw new InvalidAgeException("Invalid age to open the Account");
        }else{
            System.out.println("Your Eligible..!");
        }
    }
    public static void validateGender(String gender) throws InvalidGenderException{
        if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("others")){
            System.out.println("your eligible");
        }else{
            throw new InvalidGenderException("Invalid gender to open the Account");
        }
    }
    public static void validateAccount(String accountType) throws InvalidAccountException{
        if(accountType.equalsIgnoreCase("savings") || accountType.equalsIgnoreCase("salary")){
            System.out.println("your about to open the account");
        }else{
            throw new InvalidAccountException("Invalid Account Type");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter age :");
            validateAge(scanner.nextInt());
            System.out.println("Enter gender :");
            validateGender(scanner.next());
            System.out.println("Enter Account type : ");
            validateAccount(scanner.next());
        }catch (Exception e){
            System.out.println("Exception occured : "+e);
        }
        finally {
            System.out.println("Thank you");
        }
    }
}
