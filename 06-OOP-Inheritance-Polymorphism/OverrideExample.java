
class Vehicle {

    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {

    @Override  // Annotation to indicate method overriding
    void start() {
        System.out.println("Car is starting with an engine...");
    }
}

public class OverrideExample {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
    }
}

/*
Output:
    Car is starting with an engine...

Explanation:
    - In this example, we have a parent class Vehicle and a child class Car that extends Vehicle.
    - The Vehicle class has a method start that prints a generic message about starting.
    - The Car class overrides the start method to print a specific message about starting with an engine.
    - In the main method, we create an instance of the Car class.
    - When we call the start method on the Car instance, it prints "Car is starting with an engine..." instead of the generic message.
    - This demonstrates method overriding, where a child class provides a specific implementation for a method defined in the parent class.
    - The @Override annotation is used to indicate that the start method in the Car class is overriding the start method in the Vehicle class.
*/
