
import java.util.HashSet;

public class SetExample {

    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> uniqueFruits = new HashSet<>(); // Constructs an empty set with an initial capacity of 16 and load factor of 0.75.

        // Adding elements
        uniqueFruits.add("Apple"); // Adds the specified element to this set if it is not already present.
        uniqueFruits.add("Banana");
        uniqueFruits.add("Orange");
        uniqueFruits.add("Apple"); // Duplicate! Will not be added

        // Printing elements
        for (String fruit : uniqueFruits) {
            System.out.println(fruit);
        }

        // Checking if an element exists
        System.out.println("Contains Banana? " + uniqueFruits.contains("Banana"));

        // Getting size
        System.out.println("Total Unique Fruits: " + uniqueFruits.size());
    }
}

/*
Output:
    Apple
    Orange
    Banana
    Contains Banana? true
    Total Unique Fruits: 3

Explanation:
    - Elements are added using the `add` method.
    - A for-each loop is used to iterate through the set and print each fruit.
    - The `contains` method checks if "Banana" is in the set.
    - The size of the set is obtained using the `size` method.
    - Duplicates are not allowed in the HashSet; adding "Apple" again does not change the set.
    - The HashSet does not maintain any order of elements.
    - The HashSet is part of the Java Collections Framework and provides various methods for manipulation.
 */
