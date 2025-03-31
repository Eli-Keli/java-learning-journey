
import java.util.HashMap;

public class MapExample {

    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> studentAges = new HashMap<>(); // Constructs an empty HashMap with an initial capacity of 16 and load factor of 0.75.

        // Adding key-value pairs
        studentAges.put("Alice", 20); // Associates the specified value with the specified key in this map.
        studentAges.put("Bob", 22);
        studentAges.put("Charlie", 19);

        // Getting values
        System.out.println("Alice's Age: " + studentAges.get("Alice"));

        // Looping through keys
        for (String name : studentAges.keySet()) {
            System.out.println(name + " is " + studentAges.get(name) + " years old.");
        }

        // Checking if a key exists
        System.out.println("Contains Bob? " + studentAges.containsKey("Bob"));

        // Getting size
        System.out.println("Total Students: " + studentAges.size());
    }
}

/*
Output:
    Alice's Age: 20
    Alice is 20 years old.
    Bob is 22 years old.
    Charlie is 19 years old.
    Contains Bob? true
    Total Students: 3

Explanation:
    - Key-value pairs are added using the `put` method.
    - The value for a specific key is accessed using `get(key)`.
    - A for-each loop is used to iterate through the keys and print each student's name and age.
    - The `containsKey` method checks if "Bob" is in the map.
    - The size of the map is obtained using the `size` method.
    - The HashMap allows null values and one null key.
    - The HashMap does not maintain any order of elements.
    - The HashMap is part of the Java Collections Framework and provides various methods for manipulation.
 */
