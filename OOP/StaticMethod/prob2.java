package StaticMethod;
class MathUtility{
    public static int add(int a , int b){
        return a+b;
    }
}
public class prob2{
    public static void main(String arg[]){
        System.out.println(MathUtility.add(7,8));
    }
}
