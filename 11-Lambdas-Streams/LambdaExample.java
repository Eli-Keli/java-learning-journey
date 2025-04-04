
interface Greeting {

    void sayHello(); // abstract method
    // This is a functional interface, which means it can be used as the assignment target for a lambda expression or method reference.
}

public class LambdaExample {

    public static void main(String[] args) {
        Greeting greet = () -> System.out.println("Hello, world!"); // lambda expression
        // The lambda expression implements the sayHello method of the Greeting interface.
        greet.sayHello(); // calling the method
        // This will print "Hello, world!" to the console.
    }
}

/*
Output:
    Hello, world!

Explanation:
    - The `Greeting` interface has a single abstract method `sayHello`, making it a functional interface.
    - The lambda expression `() -> System.out.println("Hello, world!")` provides the implementation for the `sayHello` method.
    - When `greet.sayHello()` is called, it executes the code inside the lambda expression, printing "Hello, world!" to the console.
    - This is a simple example of how to use lambda expressions in Java to implement functional interfaces.
 */
