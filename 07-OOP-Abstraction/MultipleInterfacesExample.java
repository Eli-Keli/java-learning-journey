
interface Flyable {

    void fly();
}

interface Swimmable {

    void swim();
}

// A class implementing multiple interfaces
class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck is flying!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming!");
    }
}

public class MultipleInterfacesExample {

    public static void main(String[] args) {
        Duck myDuck = new Duck();
        myDuck.fly();
        myDuck.swim();
    }
}

/*
Output:
    Duck is flying!
    Duck is swimming!

Explanation:
    - The `Flyable` and `Swimmable` interfaces define abstract methods `fly()` and `swim()` respectively.
    - The `Duck` class implements both interfaces and provides implementations for both methods.
    - In the `main` method, we create an instance of `Duck`, call its `fly()` method, and then call its `swim()` method.
    - This code demonstrates how a class can implement multiple interfaces in Java.
 */
// Note: In Java, a class can implement multiple interfaces, allowing for a form of multiple inheritance.
