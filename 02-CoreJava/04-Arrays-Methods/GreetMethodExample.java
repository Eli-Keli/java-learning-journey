
public class GreetMethodExample {

    // Method to print a greeting
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Eli"); // Calling the method
    }
}

/*
Output:
    Hello, Eli!

Explanation:
    - In this example, we define a method called greet that takes a String parameter name.
    - The greet method prints a greeting message using the value of the name parameter.
    - The main method calls the greet method with the argument "Eli", resulting in the message "Hello, Eli!" being printed.
    - Methods allow us to encapsulate code into reusable blocks, making our code more modular and easier to maintain.
*/
