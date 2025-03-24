
class Laptop {

    String model;
    int ram;

    // Constructor
    Laptop(String model, int ram) {
        this.model = model;
        this.ram = ram;
    }

    void displaySpecs() {
        System.out.println("Model: " + model + ", RAM: " + ram + "GB");
    }
}

public class LaptopExample {

    public static void main(String[] args) {
        // Creating an object using a constructor
        Laptop myLaptop = new Laptop("Dell XPS", 16);
        myLaptop.displaySpecs();
    }
}

/*
Output:
    Model: Dell XPS, RAM: 16GB

Explanation:
    - A class is a blueprint for creating objects (instances) that have common properties and behaviors.
    - An object is an instance of a class that represents a real-world entity.
    - A constructor is a special method used to initialize objects when they are created.
    - The `new` keyword is used to create an object of a class.
    - The `this` keyword refers to the current object instance.
    - The `displaySpecs` method is a behavior (method) of the Laptop class that displays the model and RAM of the laptop.
    - The `main` method is the entry point of a Java program.
    - In this example, we create a Laptop object using the constructor and call the displaySpecs method to display the laptop specifications.
*/
