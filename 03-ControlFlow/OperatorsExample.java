
public class OperatorsExample {

    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic operators
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Relational operators
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a greater than b? " + (a > b));

        // Logical operators
        boolean condition = (a > 0 && b > 0);
        System.out.println("Are both a and b positive? " + condition);
    }
}
/*
Output:
    Sum: 15
    Difference: 5
    Product: 50
    Quotient: 2
    Remainder: 0
    Is a equal to b? false
    Is a greater than b? true
    Are both a and b positive? true

Explanation:
    1. Arithmetic operators: These operators are used to perform arithmetic operations on variables. The operators include addition (+), subtraction (-), multiplication (*), division (/), and modulus (%).

    2. Relational operators: These operators are used to compare two values. The operators include equal to (==), greater than (>), less than (<), etc.
    
    3. Logical operators: These operators are used to combine multiple conditions. The operators include AND (&&), OR (||), and NOT (!).

    In the example, we have two variables a and b with values 10 and 5, respectively. We perform arithmetic operations, relational comparisons, and logical operations using these variables.
    In the above example, we have used arithmetic, relational, and logical operators to perform various operations on two integer variables. 
    The output of the program will be the result of these operations.
*/
