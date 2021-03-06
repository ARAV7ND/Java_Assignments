package Assignment_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class KYC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String signupDate[] = new String[size];
        String currentDate[] = new String[size];
        for (int i=0;i<size;i++){
            signupDate[i] = scanner.next();
            currentDate[i] = scanner.next();
        }

        for(int i=0;i<size;i++){
            LocalDate date1 = LocalDate.parse(signupDate[i], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate date2 = LocalDate.parse(currentDate[i], DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//            System.out.println(date1);
            if(date1.isAfter(date2)){
                System.out.println("No range");
            }else{
                date1 = date1.withYear(date2.getYear());
                if(date1.plusDays(30).isAfter(date2)){
                    System.out.println(date1.minusDays(30).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+" "+date2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                }else{
                    System.out.println(date1.minusDays(30).format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))+" "+date2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
                }

            }

        }
    }
}
