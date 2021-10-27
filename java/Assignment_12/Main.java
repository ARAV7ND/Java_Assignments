package Assignment_12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        StudentList studentListObj = new StudentList();
        studentListObj.insertStudentsData();
        List<Student> studentList = new ArrayList<>(studentListObj.studentList);
 //        1. Print the name of all departments in the college?
        System.out.println("Name of the departments : ");
        studentList.stream()
                .map(Student::getEngineeringDepartment)
                .distinct()
                .forEach(System.out::println);


//      2. Get the names of all students who have enrolled after 2018?
        System.out.println("\nStudents who enrolled after 2018 :");
        List<String> studentNames = studentList.stream()
                .filter(a->a.getYearOfEnrollment() > 2018)
                .map(Student::getStudentName)
                .collect(Collectors.toList());
        studentNames.forEach(System.out::println);


//      3. Get the details of all male student in the computer sci department
        System.out.println("\nDetails of all Male students in computer science");
        Stream<Student> studentDetails = studentList.stream()
                .filter(a->a.getStudentGender().equalsIgnoreCase("male"));
        studentDetails
                .forEach(System.out::println);



//        4.How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
        System.out.println("\nTotal number of males and females are : ");
        Map<String,List<Student>> gender = studentList.stream().collect(Collectors.groupingBy(Student::getStudentGender));
        System.out.println("Male : "+gender.get("Male").size()+", Female : "+gender.get("Female").size());


//     5.What is the average age of male and female students
        System.out.println("\nThe Average of ages based on genders");
        OptionalDouble maleAverage = gender.get("Male")
                .stream()
                .mapToDouble(a->a.studentAge)
                .average();
        OptionalDouble femaleAverage = gender.get("Female")
                .stream()
                .mapToDouble(a->a.studentAge)
                .average();
        System.out.println("Avg age of Male : "+maleAverage.getAsDouble()+", Avg age of Female : "+femaleAverage.getAsDouble());



//      6. Get the details of  highest percentage
        OptionalDouble studentWithHighPercentage = studentList.stream()
                .mapToDouble(Student::getPercentageTillDate)
                .max();
        System.out.println("\nHighest percentage is : "+studentWithHighPercentage.getAsDouble());


//        7.Count the number of students in each department?
        System.out.println("\ncount of students in each dept : ");
        Map<String,List<Student>> noOfStudentsDept = studentList.stream().collect(Collectors.groupingBy(Student::getEngineeringDepartment));
        for(String dept : noOfStudentsDept.keySet()){
            System.out.println(dept+" : "+noOfStudentsDept.get(dept).size());

        }

//      8. What is the average percentage achieved in each department?
        System.out.println("\nAverage percentage of each department : ");
        for (String dept : noOfStudentsDept.keySet()){
            System.out.println(dept+" : "+noOfStudentsDept.get(dept).stream().mapToDouble(Student::getPercentageTillDate).average().getAsDouble());
        }

//      9.Get the details of youngest male student in the Electronic department?
        System.out.println("\nThe youngest male student in Electronic department is : ");
        Optional<Student> youngestStudent = studentList.stream()
                .filter(a->a.getStudentGender().equalsIgnoreCase("Male"))
                .filter(a->a.getEngineeringDepartment().equalsIgnoreCase("Electronic"))
                .min((a,b)->a.getStudentAge()>b.getStudentAge()?1:-1);
        youngestStudent.stream().forEach(System.out::println);



//      10.How many male and female students are there in the computer science department?
        System.out.print("\nTotal no. of ");
        Map<String,List<Student>> maleFemaleCse = studentList
                .stream()
                .filter(a -> a.getEngineeringDepartment().equals("Computer Science"))
                .collect(Collectors.groupingBy(Student::getStudentGender));
        System.out.println("Males : "+maleFemaleCse.get("Male").stream().count()+", Females : "+maleFemaleCse.get("Female").stream().count());

    }
}
