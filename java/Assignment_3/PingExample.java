package Assignment_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PingExample {
    public static void executeCommand(String command){
        try{
            Process process = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String s = " ";
            String time = " ";
            while((s=inputStream.readLine())!=null){
                if(s.contains("time ")){
                    time = s.substring(s.indexOf("time "));
                }
            }
            System.out.println("time taken :"+time.substring(4));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Host address to ping : ");
        String hostAddress = scanner.next();
        String command = "ping -c 10 "+hostAddress;
        executeCommand(command);
    }
}