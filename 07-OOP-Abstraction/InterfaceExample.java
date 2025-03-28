
// Interface
interface Animal {

    void makeSound(); // Abstract method (No body)
}

// Implementing the interface
class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat meows!");
    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound();
    }
}

/*
Output:
    Cat meows!

Explanation:
    - The `Animal` interface defines an abstract method `makeSound()`.
    - The `Cat` class implements the `Animal` interface and provides an implementation for the `makeSound()` method.
    - The `implements` keyword is used to implement an interface.
    - A class that implements an interface must provide implementations for all of its abstract methods.
    - In the `main` method, we create an instance of `Cat` and call its `makeSound()` method.
    - This code demonstrates the concept of interfaces in Java.
 */
