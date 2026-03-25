package Inheritance;
class ANIMAL{
    void MakeSound(){
        System.out.println("Making sound of animal");        
    }
}
class CAT extends ANIMAL{
    @Override
    void MakeSound(){
        System.out.println("meow meow");
    }
}
public class prob1 {
    public static void main(String[] args) {
        ANIMAL A1 = new ANIMAL();
        A1.MakeSound();
        CAT C1 = new CAT();
        C1.MakeSound();
    }
}
