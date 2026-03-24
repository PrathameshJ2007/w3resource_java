package Constructor;
class Singleton {
    // Static variable to hold the single instance
    private static Singleton instance;

    // Private constructor
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Public method to return the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

public class prob10 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // Check if both references are same
        System.out.println(s1 == s2);  
    }
}