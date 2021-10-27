package Assignment_2;

import java.util.*;
public class AlphabetCheck {
    public  static boolean isAlphabets(String words){
        boolean[] isCharPresent = new boolean[26];

        //pass to trace all the alphabets as per lowercase or uppercase
        for(char ch : words.toCharArray()){
            if(Character.isUpperCase(ch)){
                isCharPresent[ch-'A'] = true;
            }else if(Character.isLowerCase(ch)){
                isCharPresent[ch-'a'] = true;
            }
        }

        //pass to check whether all the alphabets is present in a String or not
        for(int i=0;i<26;i++){
            if(!(isCharPresent[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String words = sc.nextLine();
        if(isAlphabets(words)) {
            System.out.println("Given string contains All Alphabets");
        }else{
            System.out.println("Given string does not contains All Alphabets");
        }
    }
}


//space Complexity --> O(N) here i'm using auxiliary space for counting characters letters
//Time Complexity --> O(N) here i'm traversing entire string for one time and array(counted arrays) one time which costs O(N)+O(N) = O(N)