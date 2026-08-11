# 🎓 Student Course Registration System

A Java application that simulates a university course registration process using fundamental Object-Oriented Programming (OOP) concepts.

---

## 📌 Project Overview
This project models an academic registration flow where students can view available courses, automatically register for mandatory modules, and select elective courses based on their semester and academic standing.

### Key Features
* **Academic Rules Engine:** Enforces a maximum credit limit (30 ECTS/credits per semester).
* **Course Capacity Management:** Real-time enrollment and capacity checking.
* **Curriculum Hierarchy:** Categorizes courses by grade levels (`FRESHMAN` to `SENIOR`), semesters (`FALL`, `SPRING`), and course types (`MANDATORY`, `ELECTIVE`).
* **Elective Selection:** Dedicated elective pool management specifically for senior-level students.
* **CLI Interface:** Interactive command-line menu for easy navigation.

---

## 🛠️ Architecture & OOP Concepts

* **Encapsulation:** Class fields in `Student` and `Course` are protected via private access modifiers and accessed using getters/setters.
* **Enumerations:** Strongly typed logic using custom Enums (`GradeLevel`, `Semester`, `CourseType`).
* **Constructor Chaining:** Flexible class instantiations using method overloading (`this(...)`).
* **Separation of Concerns:** Distinct division between data models, business rules (`RegistrationManager`), and repository management (`CourseManager`).

---

## 📁 Repository Structure

```text
src/
└── studentcourseregistrationsystem/
    ├── StudentCourseRegistrationSystem.java # Application entry point (Main)
    ├── Student.java                          # Student model
    ├── Course.java                           # Course model
    ├── CourseManager.java                    # Course repository & seeding
    ├── RegistrationManager.java              # Business logic & registration rules
    ├── GradeLevel.java                       # Academic year enum
    ├── Semester.java                         # Semester enum
    └── CourseType.java                       # Mandatory/Elective enum
```
## 💻 How to Run

1. Clone the repository:
`git clone https://github.com/silacicek0/StudentCourseRegistrationSystem.git`

2. Open the project in your Java IDE (NetBeans, IntelliJ, Eclipse).

3. Run `StudentCourseRegistrationSystem.java`.
