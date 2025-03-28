
// Abstract class
abstract class Animal {

    abstract void makeSound(); // Abstract method (No body)

    void eat() { // Concrete method
        System.out.println("This animal is eating.");
    }
}

// Concrete subclass
class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks!");
    }
}

public class AbstractExample {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Calls the overridden method
        myDog.eat(); // Calls the inherited concrete method
    }
}

/*
Output:
    Dog barks!
    This animal is eating.

Explanation:
    - The `Animal` class is an abstract class with an abstract method `makeSound()` and a concrete method `eat()`.
    - The `Dog` class extends the `Animal` class and provides an implementation for the `makeSound()` method.
    - The abstract keyword is used to define an abstract class.
    - Abstract methods must be implemented in subclasses.
    - A subclass must override all abstract methods or be declared abstract itself.
    - In the `main` method, we create an instance of `Dog`, call its `makeSound()` method, and then call the inherited `eat()` method.
    - This code demonstrates the concept of abstraction in Java.
 */
