package Constructor;
class Dog{   
    String name;
    int age;
    Dog(String name , int age) {
        this.name = name ;
        this.age = age ;
    }

}
public class prob2{
    public static void main(String Args[]){
        Dog d1 = new Dog("unknown" , 0);
        System.out.println(d1.name);
        System.out.println(d1.age);
    }
}