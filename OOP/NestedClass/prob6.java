package NestedClass;
class MathUtil{
    static class Calculator{
        static int add(int a , int b){
            return a+b;
        }
    }
}
public class prob6 {
    public static void main(String[] args) {
        System.out.println(MathUtil.Calculator.add(6,2));
    }
}
