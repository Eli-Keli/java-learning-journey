
public class ExceptionExample {

    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}

/*
Output:
    Error: Cannot divide by zero!
    Execution completed.

Explanation:
    1. The code attempts to divide 10 by 0, which throws an `ArithmeticException`.
    2. The `catch` block catches the exception and prints an error message.
    3. The `finally` block executes regardless of whether an exception occurred, indicating that the execution is complete.
    4. This demonstrates how to handle exceptions gracefully in Java.
    5. The `try` block contains code that may throw an exception, the `catch` block handles the exception, and the `finally` block executes cleanup code.
 */
