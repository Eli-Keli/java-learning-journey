
import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-3): ");
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("You chose ONE.");
                break;
            case 2:
                System.out.println("You chose TWO.");
                break;
            case 3:
                System.out.println("You chose THREE.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

/*
Output:
    Enter a number (1-3): 2
    You chose TWO.

Explanation:
    1. The switch statement is used to execute a block of code based on the value of a variable.
    2. In the example, we take a number as input and use a switch statement to check the value of the number.
    3. Depending on the value of the number, a corresponding message is printed.
    4. The break statement is used to exit the switch block after a case is matched.
    5. The default case is executed when none of the cases match the value of the variable.
    6. The scanner is used to read the user's input from the console.
    7. The scanner is closed after reading the input to release system resources.
*/
