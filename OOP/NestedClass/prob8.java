package NestedClass;
abstract class Animal{
    abstract void makeSound();
}
public class prob8 {
    public static void main(String[] args) {
     Animal cat = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Meow");
            }
        };
        cat.makeSound();   
    }
    
}
