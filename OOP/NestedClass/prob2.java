package NestedClass;
class University{
    static class Department{
        String DeptName = "IT";
        int FacultyCount = 2500 ;
        void displayInfo(){
            System.out.println(DeptName);
            System.out.println(FacultyCount);
        }
    }
}
public class prob2{
    public static void main(String arg[]){
        University.Department d1 = new University.Department();
        d1.displayInfo();
    }
}