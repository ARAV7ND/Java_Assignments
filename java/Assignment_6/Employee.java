package Assignment_6;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    static int empCount = 1;
    int empId;
    String empName;
    public Employee(String name) {
        this.empName = name;
        empId = empCount++;
    }
    public Employee(int empId, String name) {
        this(name);
        this.empId = empId;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("JHON"));
        employeeList.add(new Employee(10,"Mike"));
        employeeList.add(new Employee("SMITH"));
        for(Employee employee : employeeList) {
            System.out.println("Id : " + employee.empId + ", Name : " + employee.empName);
        }
    }
}
