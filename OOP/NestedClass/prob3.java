package NestedClass;
class Car{
    void startEngine(){
        class Engine{
            void run(){
                System.out.println("car is running , brummmmm");
            }
        }
        Engine e = new Engine();
        e.run();
    }
}
public class prob3{
    public static void main(String arg[]){
        Car c1 = new Car();
        c1.startEngine();
    }
}