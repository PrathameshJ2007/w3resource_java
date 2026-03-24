package StaticMethod;
class Configuration{
    public static int configValue ;
    static {
        configValue = 1000;

    }
 
}
public class prob5{
    public static void main(String arg[]){
        System.out.println(Configuration.configValue);
    }
}
