package Inheritance;
class Shape{
    int GetAREA(){        
        return 0 ;
    }
}
class Rectangle extends Shape{
    int GetAREA(int a , int b){
        return (a*b);
    }
}
public class prob3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.GetAREA(12,34));
    }
}
