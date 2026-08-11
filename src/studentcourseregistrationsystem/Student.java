
package studentcourseregistrationsystem;
import java.util.*;

public class Student {
    
    private String name;
    private String surname;
    private int studentId;
    private GradeLevel academicYear;
    private String mail;
    private double GPA;
    private List<Course> registeredCourses;  
    private double enrolledCredits;   
    
    
    public Student(String name, String surname, int studentId, GradeLevel academicYear, String mail) {
        this(name, surname, studentId, academicYear, mail, 0.0, 0.0);
    }
    
    public Student(String name, String surname, int studentId, GradeLevel academicYear, String mail, double GPA, double enrolledCredits) {
        this.name = name;
        this.surname = surname;
        this.studentId = studentId;
        this.academicYear = academicYear;
        this.mail = mail;
        this.GPA = GPA;
        this.enrolledCredits = enrolledCredits;
        this.registeredCourses = new ArrayList<>(); 
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public int getStudentId(){
        return this.studentId;
    }
    
    public GradeLevel getAcademicYear(){
        return this.academicYear;
    }
    
    public String getMail(){
        return this.mail;
    }
    
    public double getGPA(){
        return this.GPA;
    }
    
    public double getEnrolledCredits(){
        return this.enrolledCredits;
    }
    
    public List<Course> getRegisteredCourses(){
        return this.registeredCourses;
    }
     
    public void setAcademicYear(GradeLevel academicYear){
        this.academicYear=academicYear;
    }
    
    public void setGPA(double GPA){
        this.GPA=GPA;
    }
    
    public void setEnrolledCredits(double enrolledCredits) {
        this.enrolledCredits = enrolledCredits;
    }
    
    
    @Override
    public String toString() {
        return "========================================\n" +
               "         STUDENT PROFILE CARD           \n" +
               "========================================\n" +
               " Student ID     : " + studentId + "\n" +
               " Name           : " + name + " " + surname + "\n" +
               " Grade Level    : " + academicYear + "\n" +
               " Email          : " + mail + "\n" +
               " GPA            : " + String.format("%.2f", GPA) + "\n" +
               " Enrolled Credit: " + enrolledCredits + "\n" +
               "========================================";
    }
    
    
}
