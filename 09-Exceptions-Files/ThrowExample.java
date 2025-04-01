
public class ThrowExample {

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Access granted!");
    }

    public static void main(String[] args) {
        checkAge(15); // Will throw an exception
    }
}

/*
Output:
    Exception in thread "main" java.lang.IllegalArgumentException: Age must be 18 or above.
        at ThrowExample.checkAge(ThrowExample.java:8)
        at ThrowExample.main(ThrowExample.java:14)

Explanation:
    1. The `checkAge` method checks if the provided age is less than 18.
    2. If it is, it throws an `IllegalArgumentException` with a custom message.
    3. The `main` method calls `checkAge(15)`, which triggers the exception.
    4. The program terminates with an error message indicating the exception type and message.
    5. This demonstrates how to use the `throw` statement to create custom exceptions in Java.
*/
