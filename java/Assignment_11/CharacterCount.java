package Assignment_11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
    public static  void getCharacterFrequency(String fileName){
        try {
            File inputFile = new File(fileName);
            File outputFile = new File("/home/arvinc/IdeaProjects/Assignments/src/Assignment_11/output.txt");
            BufferedReader inputStream = new BufferedReader(new FileReader(inputFile));
            BufferedWriter outputStream = new BufferedWriter(new FileWriter(outputFile));
            Map<Character,Integer> characterFrequency = new HashMap<>();
            String line = "";
            while((line=inputStream.readLine())!=null){
                for(int i=0;i<line.length();i++){
                    char ch = line.charAt(i);
                    characterFrequency.put(ch,characterFrequency.getOrDefault(ch,0)+1);
                }
            }
            for(Map.Entry<Character,Integer> entry : characterFrequency.entrySet()){
                outputStream.write(entry.getKey()+" : "+entry.getValue());
                outputStream.newLine();
            }
            outputStream.flush();

        }catch (Exception e){
                e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        String fileName = args[0];
        getCharacterFrequency(fileName);
    }
}
