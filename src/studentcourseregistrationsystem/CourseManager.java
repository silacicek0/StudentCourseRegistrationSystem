 
package studentcourseregistrationsystem;
import java.util.*;

public class CourseManager {
    private List<Course> availableCourses;

    public CourseManager() {
        this.availableCourses = new ArrayList<>(); 
       
        seedCourses(); 
    }

    
    private void seedCourses() {
        // FALL  
        availableCourses.add(new Course("TD113", "Turkish Language I", 2.0, 50, Semester.FALL, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("AI115", "Ataturk's Principles I", 2.0, 50, Semester.FALL, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("YD117", "Foreign Language I", 2.0, 50, Semester.FALL, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("MAT101", "Calculus I", 6.0, 60, Semester.FALL, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("PHYS103", "Physics I", 6.0, 50, Semester.FALL, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("YZ101 ", "Introduction to Computer Science", 5.0, 60, Semester.FALL, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("YZ103 ", "Introduction to Programming", 5.0, 60, Semester.FALL, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("YZ105 ", "Occupational Health and Safety I", 2.0, 50, Semester.FALL, GradeLevel.FRESHMAN));

        availableCourses.add(new Course("MAT201", "Calculus III", 6.0, 60, Semester.FALL, GradeLevel.SOPHOMORE));
        availableCourses.add(new Course("YZ203", "Visual Programming", 5.0, 70, Semester.FALL, GradeLevel.SOPHOMORE));
        availableCourses.add(new Course("YZ205", "Data Structures and Algorithms", 5.0, 60, Semester.FALL, GradeLevel.SOPHOMORE));
        availableCourses.add(new Course("YZ207", "Software Requirements Engineering", 5.0, 60, Semester.FALL, GradeLevel.SOPHOMORE));
        availableCourses.add(new Course("YZ209", "Numerical Analysis & Scientific Programming", 5.0, 60, Semester.FALL, GradeLevel.SOPHOMORE));
        availableCourses.add(new Course("YZ211", "Programming Laboratory I", 4.0, 60, Semester.FALL, GradeLevel.SOPHOMORE));
        
        availableCourses.add(new Course("YZ301", "Introduction to Artificial Intelligence", 5.0, 60, Semester.FALL, GradeLevel.JUNIOR));
        availableCourses.add(new Course("YZ303", "Operating Systems", 5.0, 70, Semester.FALL, GradeLevel.JUNIOR));
        availableCourses.add(new Course("YZ305 ", "Database Management Systems", 5.0, 60, Semester.FALL, GradeLevel.JUNIOR));
        availableCourses.add(new Course("YZ307", "Backend Development", 5.0, 60, Semester.FALL, GradeLevel.JUNIOR));
        availableCourses.add(new Course("YZ309", "Computer Architecture", 5.0, 60, Semester.FALL, GradeLevel.JUNIOR));
        availableCourses.add(new Course("YZ311", "Introduction to Data Science", 5.0, 60, Semester.FALL, GradeLevel.JUNIOR));

        availableCourses.add(new Course("YZ401", "SOFTWARE DEVELOPMENT APPLICATIONS", 12.0, 60, Semester.FALL, GradeLevel.SENIOR, CourseType.MANDATORY));
        availableCourses.add(new Course("YZ403", "SUMMER INTERNSHIP I", 3.0, 100, Semester.FALL, GradeLevel.SENIOR, CourseType.MANDATORY));
        //secmeli
        availableCourses.add(new Course("YS411", "COMMUNICATION AND PRESENTATION TECHNIQUES", 3.0, 30, Semester.FALL, GradeLevel.SENIOR, CourseType.ELECTIVE));
        availableCourses.add(new Course("YS413", "WEB PROGRAMMING", 3.0, 30, Semester.FALL, GradeLevel.SENIOR, CourseType.ELECTIVE));
        availableCourses.add(new Course("YS415", "MOBILE PROGRAMMING", 3.0, 30, Semester.FALL, GradeLevel.SENIOR, CourseType.ELECTIVE));
        availableCourses.add(new Course("YS417", "ENTREPRENEURSHIP I", 3.0, 30, Semester.FALL, GradeLevel.SENIOR, CourseType.ELECTIVE));
        availableCourses.add(new Course("YS419", "DATA SCIENCE", 3.0, 30, Semester.FALL, GradeLevel.SENIOR, CourseType.ELECTIVE));
        availableCourses.add(new Course("YS421", "MANAGEMENT INFORMATION SYSTEMS", 3.0, 30, Semester.FALL, GradeLevel.SENIOR, CourseType.ELECTIVE));
        
        // SPRING  
        availableCourses.add(new Course("TD114", "Turkish Language II", 2.0, 50, Semester.SPRING, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("AI116", "Ataturk's Principles II", 2.0, 40, Semester.SPRING, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("YD118", "Foreign Language II", 2.0, 50, Semester.SPRING, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("MAT102 ", "Calculus II", 6.0, 60, Semester.SPRING, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("PHYS104", "Physics II", 6.0, 60, Semester.SPRING, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("YZ102", "Object-Oriented Programming", 4.0, 70, Semester.SPRING, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("YZ104", "Discrete Structures", 3.0, 60, Semester.SPRING, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("YZ106", "Career Planning", 2.0, 50, Semester.SPRING, GradeLevel.FRESHMAN));
        availableCourses.add(new Course("YZ108", "Linear Algebra", 3.0, 55, Semester.SPRING, GradeLevel.FRESHMAN));
        
        availableCourses.add(new Course("YZ202", "Advanced Programming", 5.0, 60, Semester.SPRING, GradeLevel.SOPHOMORE));
        availableCourses.add(new Course("YZ204", "Analysis of Algorithms", 5.0, 60, Semester.SPRING, GradeLevel.SOPHOMORE));
        availableCourses.add(new Course("YZ206", "Software Design & Architecture", 5.0, 70, Semester.SPRING, GradeLevel.SOPHOMORE));
        availableCourses.add(new Course("YZ208", "Probability Theory and Statistics", 6.0, 60, Semester.SPRING, GradeLevel.SOPHOMORE));
        availableCourses.add(new Course("YZ210", "Digital Systems & Logic", 5.0, 50, Semester.SPRING, GradeLevel.SOPHOMORE));
        availableCourses.add(new Course("YZ212", "Programming Laboratory II", 4.0, 60, Semester.SPRING, GradeLevel.SOPHOMORE));
        
        availableCourses.add(new Course("YZ302", "Frontend Development", 5.0, 60, Semester.SPRING, GradeLevel.JUNIOR));
        availableCourses.add(new Course("YZ304", "Software Testing & Quality Assurance", 5.0, 60, Semester.SPRING, GradeLevel.JUNIOR));
        availableCourses.add(new Course("YZ306", "Introduction to Machine Learning", 5.0, 70, Semester.SPRING, GradeLevel.JUNIOR));
        availableCourses.add(new Course("YZ308", "Formal Languages and Automata Theory", 5.0, 60, Semester.SPRING, GradeLevel.JUNIOR));
        availableCourses.add(new Course("YZ310", "Occupational Health and Safety II", 2.0, 50, Semester.SPRING, GradeLevel.JUNIOR));
        availableCourses.add(new Course("YZ312", "Software Design Applications", 8.0, 60, Semester.SPRING, GradeLevel.JUNIOR));
    
        availableCourses.add(new Course("YZ402", "CAPSTONE PROJECT", 12.0, 60, Semester.SPRING, GradeLevel.SENIOR, CourseType.MANDATORY));
        availableCourses.add(new Course("YZ404", "SUMMER INTERNSHIP II", 3.0, 100, Semester.SPRING, GradeLevel.SENIOR, CourseType.MANDATORY));
        //secmeli
        availableCourses.add(new Course("YS412", "DEEP LEARNING", 3.0, 30, Semester.SPRING, GradeLevel.SENIOR, CourseType.ELECTIVE));
        availableCourses.add(new Course("YS414", "SOFTWARE SECURITY", 3.0, 30, Semester.SPRING, GradeLevel.SENIOR, CourseType.ELECTIVE));
        availableCourses.add(new Course("YS416", "ENTREPRENEURSHIP II", 3.0, 30, Semester.SPRING, GradeLevel.SENIOR, CourseType.ELECTIVE));
        availableCourses.add(new Course("YS418", "AGENT-BASED ARTIFICIAL INTELLIGENCE", 3.0, 30, Semester.SPRING, GradeLevel.SENIOR, CourseType.ELECTIVE));
        availableCourses.add(new Course("YS420", "QUANTUM COMPUTING", 3.0, 30, Semester.SPRING, GradeLevel.SENIOR, CourseType.ELECTIVE));
        availableCourses.add(new Course("YS422", "PROJECT MANAGEMENT", 3.0, 30, Semester.SPRING, GradeLevel.SENIOR, CourseType.ELECTIVE));
        availableCourses.add(new Course("YS424", "COMPUTER VISION", 3.0, 30, Semester.SPRING, GradeLevel.SENIOR, CourseType.ELECTIVE));
    
    
    }

    public List<Course> getAvailableCoursesForStudent(GradeLevel studentLevel, Semester currentSemester) {
        List<Course> filteredCourses = new ArrayList<>();
        for (Course course : availableCourses) {
            if (course.getAcademicYear() == studentLevel && course.getSemester() == currentSemester) {
                filteredCourses.add(course);
            }
        }
        return filteredCourses;
    } 
    
    public List<Course> getAllCourses() {
        return availableCourses;
    }
    
    public List<Course> getElectiveCourses(GradeLevel studentLevel, Semester currentSemester) {
        List<Course> electives = new ArrayList<>();
        for (Course course : availableCourses) {
            if (course.getAcademicYear() == studentLevel 
                    && course.getSemester() == currentSemester 
                    && course.getCourseType() == CourseType.ELECTIVE) {
                electives.add(course);
            }
        }
        return electives;
    }
    
    public Course findCourseByCode(String courseCode) {
        for (Course course : availableCourses) {
            if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                return course;
            }
        }
        return null;
    }
}
