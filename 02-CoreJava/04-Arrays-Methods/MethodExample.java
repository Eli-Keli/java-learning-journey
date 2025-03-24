
public class MethodExample {

    // Method to add two numbers
    public static int add(int a, int b) {
        return a + b; // Returning the sum
    }

    public static void main(String[] args) {
        int sum = add(5, 10); // Calling the method
        System.out.println("Sum: " + sum);
    }
}

/*
Output:
    Sum: 15

Explanation:
    - A method is a block of code that performs a specific task.
    - Methods are used to organize code into reusable blocks, making it easier to read and maintain.
    - Methods can have parameters, which are values passed to the method when it is called.
    - Methods can have a return type, which specifies the type of value that the method will return.
    - The return statement is used to return a value from a method.
    - When a method is called, the code inside the method is executed, and the result is returned to the caller.
    - In this example, the add method takes two integers as parameters and returns their sum.
    - The main method calls the add method with arguments 5 and 10, and prints the result.
*/