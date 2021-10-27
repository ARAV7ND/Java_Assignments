package Assignment_12;

public class Student {
    int studentId;
    String studentName;
    int studentAge;
    String studentGender;
    String engineeringDepartment;
    int yearOfEnrollment;
    double percentageTillDate;

    public Student(int studentId, String studentName, int studentAge, String studentGender, String engDepartment, int yearOfEnrollment, double percentageTillDate) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentGender = studentGender;
        this.engineeringDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.percentageTillDate = percentageTillDate;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public String getEngineeringDepartment() {
        return engineeringDepartment;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public double getPercentageTillDate() {
        return percentageTillDate;
    }

    @Override
    public String toString() {
        return " Id : "+getStudentId()+", Name : "+getStudentName()+", Age : "+getStudentAge()+", Gender : "+getStudentGender()+
                ", Department : "+getEngineeringDepartment()+", Enrollment Year : "+getYearOfEnrollment()+", Percentage : "+getPercentageTillDate();

    }
}
