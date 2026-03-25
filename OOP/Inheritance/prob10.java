package Inheritance;
class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.05;
    }

    public void generatePerformanceReport() {
        System.out.println(name + " (" + jobTitle + ") performance is satisfactory.");
    }

    public void manageProject() {
        System.out.println(name + " is managing general tasks.");
    }
}
class Manager extends Employee {
    public Manager(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20;
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println(name + " is a Manager with excellent leadership performance.");
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is managing multiple projects.");
    }
}
class Developer extends Employee {
    public Developer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10;
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println(name + " is a Developer with strong coding performance.");
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is developing project modules.");
    }
}
class Programmer extends Employee {
    public Programmer(String name, String address, double salary, String jobTitle) {
        super(name, address, salary, jobTitle);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.08;
    }

    @Override
    public void generatePerformanceReport() {
        System.out.println(name + " is a Programmer with consistent performance.");
    }

    @Override
    public void manageProject() {
        System.out.println(name + " is writing and maintaining code.");
    }
}
public class prob10 {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", "New York", 80000, "Manager");
        Developer d = new Developer("Bob", "California", 60000, "Developer");
        Programmer p = new Programmer("Charlie", "Texas", 50000, "Programmer");

        System.out.println("Manager Bonus: " + m.calculateBonus());
        m.generatePerformanceReport();
        m.manageProject();

        System.out.println();

        System.out.println("Developer Bonus: " + d.calculateBonus());
        d.generatePerformanceReport();
        d.manageProject();

        System.out.println();

        System.out.println("Programmer Bonus: " + p.calculateBonus());
        p.generatePerformanceReport();
        p.manageProject();
    }
}
