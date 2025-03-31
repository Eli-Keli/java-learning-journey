
import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>(); // Constructs an empty list with an initial capacity of ten.

        // Adding elements
        fruits.add("Apple"); // Appends the specified element to the end of this list.
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicates are allowed

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); // Returns the element at the specified position in this list.

        // Looping through the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Removing an element
        fruits.remove("Banana"); // Removes the first occurrence of the specified element from this list, if it is present.
        System.out.println("After removing Banana: " + fruits);

        // Checking if an element exists
        System.out.println("Contains Orange? " + fruits.contains("Orange")); // Returns true if this list contains the specified element.

        // Getting size
        System.out.println("Total Fruits: " + fruits.size()); // Returns the number of elements in this list.
    }
}

/*
Output:
    First fruit: Apple
    Apple
    Orange
    Apple
    After removing Banana: [Apple, Orange, Apple]
    Contains Orange? true
    Total Fruits: 3

Explanation:
    - Elements are added using the `add` method.
    - The first element is accessed using `get(0)`.
    - A for-each loop is used to iterate through the list and print each fruit.
    - An element is removed using the `remove` method.
    - The `contains` method checks if "Orange" is in the list.
    - The size of the list is obtained using the `size` method.
    - Duplicates are allowed in the ArrayList.
    - The ArrayList can dynamically grow as elements are added or removed.
    - The ArrayList is part of the Java Collections Framework and provides various methods for manipulation.
 */
