
package studentcourseregistrationsystem;
import java.util.*;

public class Course {
    private String courseCode;     
    private String courseName;       
    private double credits;          
    private int capacity;   
    private Semester semester;
    private GradeLevel academicYear;
    private int enrolledStudentsCount;  
    private CourseType courseType;
    
    public Course(String courseCode, String courseName, double credits, int capacity, Semester semester, GradeLevel academicYear) {
    this(courseCode, courseName, credits, capacity, semester, academicYear, CourseType.MANDATORY);
}
    
    public Course(String courseCode,String courseName,double credits,int capacity,Semester semester,GradeLevel academicYear, CourseType courseType){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.credits=credits;
        this.capacity=capacity;
        this.semester=semester;
        this.academicYear = academicYear; 
        this.courseType = courseType;
        this.enrolledStudentsCount=0;
    }
    
     
    public String getCourseCode(){
        return this.courseCode;
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    
    public double getCredits(){
        return this.credits;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public Semester getSemester(){
        return this.semester;
    }
    
    public GradeLevel getAcademicYear() {
        return academicYear;
    }
    
    public CourseType getCourseType() {
        return courseType;
    }
    
    public int getEnrolledStudentsCount(){
        return this.enrolledStudentsCount;
    }
    
    //setters
    public void setCourseCode(String courseCode){
        this.courseCode=courseCode;
    }
    
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    
    public void setCredits(double credits){
        this.credits=credits;
    }
    
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    
    public void setSemester(Semester semester){
        this.semester=semester;
    }
    
    public void setAcademicYear(GradeLevel academicYear) {
        this.academicYear = academicYear;
    }
    
    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }
    
     
    public boolean isFull() {
        return enrolledStudentsCount >= capacity;
    }
    
     
    public boolean registerStudent() {
        if (!isFull()) {
            enrolledStudentsCount++;
            return true;  
        }
        return false;  
    }
    
     
    public void dropStudent() {
        if (enrolledStudentsCount > 0) {
            enrolledStudentsCount--;
        }
    }
    
    @Override
    public String toString() {
        return String.format("| %-10s | %-35s | %-8.1f | %-10s | %-12s |", 
                courseCode, courseName, credits, (enrolledStudentsCount + "/" + capacity), semester);
    }
}
