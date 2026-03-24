package StaticMethod;
class Constants{
    static final double pi = 3.14;
    public static void area( int radious){
        System.out.println((pi * radious *radious));
    }
    
    
}
public class prob4{
    public static void main(String arg[]){
        Constants.area(8);

    }
}
