
import java.util.Scanner; // Import Scanner class

public class UserInputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a string input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer input

        System.out.println("Hello " + name + "! You are " + age + " years old.");

        scanner.close(); // Close the scanner
    }
}
// Output:
//  Enter your name: Eli
//  Enter your age: 22
//  Hello Eli! You are 22 years old.

//  Explanation: In this program, we use the Scanner class to read user input from the console. We create a Scanner object by passing System.in as an argument to the Scanner constructor. We then use the nextLine() method to read a string input and the nextInt() method to read an integer input. Finally, we print the user's name and age using the input values. It's important to close the scanner object after reading the input to release system resources.
