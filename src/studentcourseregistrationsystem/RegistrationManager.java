 
package studentcourseregistrationsystem;
import java.util.*;

public class RegistrationManager {
    private CourseManager courseManager;
    private static final double MAX_CREDIT_LIMIT = 30.0; 

    public RegistrationManager(CourseManager courseManager) {
        this.courseManager = courseManager;
    }
    
    public boolean registerStudentToCourse(Student student, Course course) {
        
        if (student.getRegisteredCourses().contains(course)) {
            System.out.println("❌ Error: Student is already registered for " + course.getCourseCode());
            return false;
        }
    
        
        if (student.getEnrolledCredits() + course.getCredits() > MAX_CREDIT_LIMIT) {
            System.out.println("❌ Error: Credit limit exceeded! (" + 
                    (student.getEnrolledCredits() + course.getCredits()) + " / " + MAX_CREDIT_LIMIT + ")");
            return false;
        }
    
        
        if (course.isFull()) {
            System.out.println("❌ Error: Course capacity is full for " + course.getCourseCode());
            return false;
        }
    
        
        if (course.registerStudent()) { 
            student.getRegisteredCourses().add(course); 
            student.setEnrolledCredits(student.getEnrolledCredits() + course.getCredits()); 
            System.out.println("✅ Successfully registered " + student.getName() + " for " + course.getCourseCode());
            return true;
        }
    
        return false;
    }
    
    public boolean dropCourseFromStudent(Student student, Course course) {
        if (!student.getRegisteredCourses().contains(course)) {
            System.out.println("❌ Error: Student is not registered for " + course.getCourseCode());
            return false;
        }
    
        student.getRegisteredCourses().remove(course);
        student.setEnrolledCredits(student.getEnrolledCredits() - course.getCredits());
        course.dropStudent();  
        
        System.out.println("✅ Successfully dropped " + course.getCourseCode() + " for " + student.getName());
        return true;
    }
    
    public void registerMandatoryCourses(Student student, Semester currentSemester) {
        List<Course> available = courseManager.getAvailableCoursesForStudent(student.getAcademicYear(), currentSemester);
        
        System.out.println("\n--- Registering Mandatory Courses for " + student.getName() + " ---");
        for (Course course : available) {
            if (course.getCourseType() == CourseType.MANDATORY) {
                registerStudentToCourse(student, course);
            }
        }
    }
    
    
}
