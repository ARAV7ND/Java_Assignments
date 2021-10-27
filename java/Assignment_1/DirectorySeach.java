package Assignment_1;
import java.io.File;
import java.util.Scanner;

public class DirectorySeach {

    public static void findFile(String path,String fileName){
        File fileDirectory = new File(path);
        File[] fileList = fileDirectory.listFiles();
        boolean flag = false ;
        if(fileList==null){
            System.out.println("Empty directory");
        }else{
            for(File file : fileList){
                if(file.getName().contains(fileName)){
                    System.out.println("File found at : "+file.getAbsolutePath());
                    flag = true;
                }
            }
        }
        if(!flag){
            System.out.println("File not found");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Directory path.");
        String path = scanner.next();
        System.out.println("Enter the filename or file-extention to search");
        String fileName = scanner.next();
        findFile(path,fileName);
    }
}
