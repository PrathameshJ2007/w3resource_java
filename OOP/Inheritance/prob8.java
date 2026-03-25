package Inheritance;
class Shape {
    public double getPerimeter() {
        return 0;
    }

    public double getArea() {
        return 0;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
public class prob8 {
    public static void main(String[] args) {
        Circle c = new Circle(7);

        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());
    }
}
