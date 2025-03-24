
// Defining a class
class Car {

    // Attributes (Fields)
    String brand;
    int speed;

    // Method (Behavior)
    void accelerate() {
        System.out.println(brand + " is accelerating!");
    }
}

// Main class to create objects
public class CarExample {

    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.speed = 120;

        // Accessing object properties
        System.out.println("Brand: " + myCar.brand);
        System.out.println("Speed: " + myCar.speed + " km/h");

        // Calling object method
        myCar.accelerate();
    }
}

/*
Output:
    Brand: Toyota
    Speed: 120 km/h
    Toyota is accelerating!

Explanation:
    - In this example, we define a class called Car with two attributes: brand and speed.
    - The Car class also has a method called accelerate that prints a message indicating that the car is accelerating.
    - In the main class CarExample, we create an object of the Car class using the new keyword.
    - We set the brand and speed properties of the object using dot notation.
    - We access the object properties and call the accelerate method using dot notation.
    - Objects are instances of classes that encapsulate data (attributes) and behavior (methods).
    - Objects allow us to model real-world entities and interact with them in our programs.
*/
