
class MathOperations {

    // Same method name, different parameters
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {

    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Addition of integers: " + math.add(5, 10));
        System.out.println("Addition of doubles: " + math.add(5.5, 2.5));
    }
}

/*
Output:
    Addition of integers: 15
    Addition of doubles: 8.0

Explanation:
    - Method overloading allows us to define multiple methods with the same name but different parameters.
    - The compiler determines which method to call based on the number and types of arguments passed to the method.
    - In this example, the MathOperations class defines two add methods with different parameter types (int and double).
    - When the add method is called with integer arguments, the compiler selects the add method that takes two integers.
    - When the add method is called with double arguments, the compiler selects the add method that takes two doubles.
    - This allows us to reuse the same method name for different types of operations, making the code more readable and maintainable.
*/