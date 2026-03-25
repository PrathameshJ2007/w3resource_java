package NestedClass;
class School {
    
    static class Student {
        String name;
        String grade;
        Student(String name, String grade) {
            this.name = name;
            this.grade = grade;
        }
        void displayStudentInfo() {
            System.out.println("Student Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}
public class prob10 {
    public static void main(String[] args) {
        School.Student student = new School.Student("Julius Helga", "A");
        student.displayStudentInfo();
    }
}
