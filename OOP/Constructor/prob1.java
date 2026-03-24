package Constructor;
class Cat{   
    String name;
    int age;
    Cat() {
        name = "unknown";
        age = 0;
    }

}
public class prob1{
    public static void main(String Args[]){
        Cat c1 = new Cat();
        System.out.println(c1.name);
        System.out.println(c1.age);
    }
}