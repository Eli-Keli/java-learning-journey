
import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        scanner.close();
    }
}

/*
Output:
    Enter your age: 19
    You are an adult.

Explanation:
    1. The if-else statement is used to execute a block of code based on a condition.
    2. In the example, we take the user's age as input and check if the age is greater than or equal to 18.
    3. If the condition is true, the message "You are an adult." is printed.
    4. If the condition is false, the message "You are a minor." is p-rinted.
    5. The scanner is used to read the user's input from the console.
    6. The scanner is closed after reading the input to release system resources.
 */
