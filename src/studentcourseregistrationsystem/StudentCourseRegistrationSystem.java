
package studentcourseregistrationsystem;
import java.util.*;

public class StudentCourseRegistrationSystem {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        CourseManager courseManager = new CourseManager();
        RegistrationManager registrationManager = new RegistrationManager(courseManager);

       
        Student student = new Student("Sila", "Cicek", 1031510167, GradeLevel.SOPHOMORE, "sila@erciyes.edu.tr");

        Semester currentSemester = Semester.FALL;

        System.out.println("==================================================");
        System.out.println("   WELCOME TO STUDENT COURSE REGISTRATION SYSTEM  ");
        System.out.println("==================================================");
        System.out.println(student);

        boolean running = true;

        while (running) {
            System.out.println("\n----------------- MENU -----------------");
            System.out.println("1. View Available Courses for My Level & Semester");
            System.out.println("2. Auto-Register Mandatory Courses");
            System.out.println("3. Register to a Specific Course (by Course Code)");
            System.out.println("4. Drop a Course");
            System.out.println("5. View My Registered Courses & Profile");
            System.out.println("6. Exit");
            System.out.print("Please select an option (1-6): ");

            if (!scanner.hasNextInt()) {
                System.out.println("❌ Invalid input! Please enter a number.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- AVAILABLE COURSES ---");
                    List<Course> availableCourses = courseManager.getAvailableCoursesForStudent(student.getAcademicYear(), currentSemester);
                    if (availableCourses.isEmpty()) {
                        System.out.println("No courses available for this semester/level.");
                    } else {
                        for (Course c : availableCourses) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 2:
                    registrationManager.registerMandatoryCourses(student, currentSemester);
                    break;

                case 3:
                    System.out.print("Enter Course Code to register (e.g., YS413 or YZ401): ");
                    String addCode = scanner.nextLine().trim();
                    Course courseToAdd = courseManager.findCourseByCode(addCode);

                    if (courseToAdd != null) {
                        registrationManager.registerStudentToCourse(student, courseToAdd);
                    } else {
                        System.out.println("❌ Course not found! Please check the course code.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Course Code to drop: ");
                    String dropCode = scanner.nextLine().trim();
                    Course courseToDrop = courseManager.findCourseByCode(dropCode);

                    if (courseToDrop != null) {
                        registrationManager.dropCourseFromStudent(student, courseToDrop);
                    } else {
                        System.out.println("❌ Course not found!");
                    }
                    break;

                case 5:
                    System.out.println(student);
                    System.out.println("\n--- ENROLLED COURSES ---");
                    if (student.getRegisteredCourses().isEmpty()) {
                        System.out.println("No registered courses yet.");
                    } else {
                        for (Course c : student.getRegisteredCourses()) {
                            System.out.println(c);
                        }
                    }
                    break;

                case 6:
                    running = false;
                    System.out.println("\nExiting system. Have a great academic semester!");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please enter a number between 1 and 6.");
            }
        }

        scanner.close();
    
        
    }
    
}
