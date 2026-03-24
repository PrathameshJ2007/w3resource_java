package StaticMethod;
class ComplexInitializer {
    // Declare static variables x, y, z
    public static int x;
    public static int y;
    public static int z;

    // Static block to initialize the static variables using complex logic
    static {
        x = 10;
        y = 20;
        z = calculateZ(x, y);
    }

    // Static method to calculate the value of z
    private static int calculateZ(int a, int b) {
        return a * b + (a - b);
    }
}
public class prob7{
    // Main method to print the values of the static variables
    public static void main(String[] args) {
        System.out.println("Value of x: " + ComplexInitializer.x);
        System.out.println("Value of y: " + ComplexInitializer.y);
        System.out.println("Value of z: " + ComplexInitializer.z);
    }

}