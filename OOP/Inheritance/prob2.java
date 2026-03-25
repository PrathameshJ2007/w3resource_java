package Inheritance;
class Vehicle{
    void Drive(){
        System.out.println("Driving");        
    }
}
class CAR extends Vehicle{
    @Override
    void Drive(){
        System.out.println("Repairing a car");
    }
}
public class prob2 {
    public static void main(String[] args) {
        Vehicle V1 =    new Vehicle();
        CAR C1 = new CAR();
        V1.Drive();
        C1.Drive();
    }
}
