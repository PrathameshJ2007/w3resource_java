package Constructor;
class Classroom{
    String className;
    String[] Students;
    Classroom(String className , String[] Students){
        this.className = className;
        this.Students = Students;
    }
}
public class prob9{
    public static void main(String Args[]){
       String[] S1 = {"TOMMY" , "KRISHNA"};
       Classroom c1 = new Classroom("ITA", S1);
       System.out.println(c1.className);
       System.out.println(c1.Students[0]);
       System.out.println(c1.Students[1]);
 
    }
}