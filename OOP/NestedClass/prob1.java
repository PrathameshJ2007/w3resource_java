package NestedClass;
class Computer{
    class Processor{
        String brand = "Intel";
        int speed = 2500 ;
        void getDetails(){
            System.out.println(speed);
            System.out.println(brand);
        }
    }
}
public class prob1{
    public static void main(String arg[]){
        Computer c = new Computer();
        Computer.Processor p1 = c.new Processor();
        p1.getDetails();
    }
}