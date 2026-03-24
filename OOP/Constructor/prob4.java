package Constructor;
class Student{
    int studentId;
    String studentName;
    int grade;
    Student(){
        this(0 , "unknown" , 0 );
    }
    Student(int studentId,String studentName,int grade){
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
    }

public class prob4{
    public static void main(String Args[]){
        Student s1 = new Student();
        System.out.print(s1.studentId+" "+s1.studentName+" "+s1.grade);
    }
}