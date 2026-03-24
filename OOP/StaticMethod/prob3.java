package StaticMethod;
class Initializer{
    public static int initialValue ;
    static {
        initialValue = 1000;

    }
 
}
public class prob3{
    public static void main(String arg[]){
        System.out.println(Initializer.initialValue);
    }
}
