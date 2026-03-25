package Inheritance;
class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public double calculateFuelEfficiency() {
        return 0;
    }

    public double calculateDistance(double fuelUsed) {
        return fuelUsed * calculateFuelEfficiency();
    }

    public double getMaxSpeed() {
        return 0;
    }
}
class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 8;
    }

    @Override
    public double getMaxSpeed() {
        return 120;
    }
}
class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 15;
    }

    @Override
    public double getMaxSpeed() {
        return 180;
    }
}
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 35;
    }

    @Override
    public double getMaxSpeed() {
        return 140;
    }
}
public class prob9 {
    public static void main(String[] args) {
        Truck truck = new Truck("Volvo", "FH16", 2022, "Diesel");
        Car car = new Car("Toyota", "Camry", 2023, "Petrol");
        Motorcycle bike = new Motorcycle("Yamaha", "R15", 2021, "Petrol");

        System.out.println("Truck Efficiency: " + truck.calculateFuelEfficiency());
        System.out.println("Truck Distance (10L): " + truck.calculateDistance(10));
        System.out.println("Truck Max Speed: " + truck.getMaxSpeed());

        System.out.println();

        System.out.println("Car Efficiency: " + car.calculateFuelEfficiency());
        System.out.println("Car Distance (10L): " + car.calculateDistance(10));
        System.out.println("Car Max Speed: " + car.getMaxSpeed());

        System.out.println();

        System.out.println("Motorcycle Efficiency: " + bike.calculateFuelEfficiency());
        System.out.println("Motorcycle Distance (10L): " + bike.calculateDistance(10));
        System.out.println("Motorcycle Max Speed: " + bike.getMaxSpeed());
    }
}
