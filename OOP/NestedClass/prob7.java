package NestedClass;
class  House{
    int CalculateArea(int a , int b){
        class Room{
            int getArea(int a , int b){
                return a*b;
            }
        }
        Room r1 = new Room();
        return r1.getArea(a,b);
    }
}
public class prob7 {
    public static void main(String[] args) {
    House h1 = new House();
    System.out.println(h1.CalculateArea(45,55 ));   
    }
}
