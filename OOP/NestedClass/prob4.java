package NestedClass;
interface Greetings  {
    void sayHello();
}
class Anonymous implements Greetings{
    public void sayHello(){
        System.out.println("Hello World");
    }
}
public class prob4 {
    public static void main(String arg[]){
        Anonymous a1 = new Anonymous();
        a1.sayHello();
    }
} 