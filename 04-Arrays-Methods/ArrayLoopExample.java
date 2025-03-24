
public class ArrayLoopExample {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Using a for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Using a for-each loop
        System.out.println("Using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

/*
Output:
    Using for loop:
    1
    2
    3
    4
    5
    Using for-each loop:
    1
    2
    3
    4
    5

Explanation:
    - We can iterate over the elements of an array using a for loop or a for-each loop.
    - The for loop uses an index to access the elements of the array.
    - The for-each loop simplifies the process of iterating over the elements of an array by providing a more concise syntax.
    - The for-each loop iterates over each element of the array without the need for an explicit index variable.
*/