
import java.util.function.Predicate; // Importing the Predicate interface
// The Predicate interface is a functional interface that represents a single argument function that returns a boolean value.

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0; // Lambda expression to check if a number is even
        // The Predicate interface is used here to create a lambda expression that checks if a number is even.
        System.out.println(isEven.test(4)); // true
    }
}

/*
Output:
    true

Explanation:
    - The `Predicate` interface is a functional interface that takes one argument and returns a boolean value.
    - The lambda expression `x -> x % 2 == 0` checks if the number `x` is even.
    - The `test` method of the `Predicate` interface is called with the argument `4`, which returns `true` because `4` is even.
    
This example demonstrates how to use lambda expressions with the Predicate interface in Java.
*/
