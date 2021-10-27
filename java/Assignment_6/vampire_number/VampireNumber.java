package Assignment_6.vampire_number;

import java.util.*;
public class VampireNumber {

    public static String swap(String number,int i,int j){
        char[] charArray = number.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }

    public static void getPermutations(String number, int currentIndex, ArrayList<String> permutations){
        int length = number.length();
        if(currentIndex==length){
            if((number.charAt(0)!='0') && (number.charAt((length/2)-1)!='0')) {
                permutations.add(number);
            }
            return ;
        }
        for(int i=currentIndex;i<number.length();i++){
            number = swap(number,i,currentIndex);
            getPermutations(number,currentIndex+1,permutations);
            number = swap(number,i,currentIndex);
        }

    }

    public  static boolean isFangs(String fangs,String number){
        int length = fangs.length();
        String leftFang = fangs.substring(0,(length/2));
        String rightFang = fangs.substring(length/2);

        if(Integer.parseInt(leftFang) * Integer.parseInt(rightFang) == Integer.parseInt(number)){
//            System.out.println(leftFang+" "+rightFang);
            return true;
        }
        return false;
    }

    public static boolean isVampireNumber(String number){

        if(number.length() % 2 != 0){
            return false;
        }
        ArrayList<String> permutations = new ArrayList<>();
        getPermutations(number,0,permutations);
        for (String fangs : permutations){
            if(isFangs(fangs,number)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int number=1260; ;number++) {
            if(result.size()==100){
                break;
            }
            String str = String.valueOf(number);
            if (isVampireNumber(str)) {
                result.add(number);
            }
        }
        System.out.println(result);
    }
}
