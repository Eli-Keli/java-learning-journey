
public class ArrayExample {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Initializing an array

        System.out.println("First element: " + numbers[0]); // Accessing elements

        numbers[2] = 100; // Modifying an array element
        System.out.println("Modified third element: " + numbers[2]);
    }
}

/*
Output:
    First element: 10
    Modified third element: 100

Explanation:
    - An array is a collection of elements of the same type stored in a contiguous memory location.
    - The elements of an array can be accessed using an index.
    - The index of the first element is 0.
    - The index of the last element is the length of the array minus 1.
    - The elements of an array can be modified by assigning a new value to the corresponding index.
 */
