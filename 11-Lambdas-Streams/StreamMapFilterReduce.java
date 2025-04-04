
// Stream API Example: Map, Filter, Reduce
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapFilterReduce {

    public static void main(String[] args) {
        // Basic Stream Pipeline:
        List<String> names = Arrays.asList("Eli", "Zoe", "Mike"); // List of names
        // The `names` list is created using the `Arrays.asList` method, which creates a fixed-size list backed by the specified array.

        names.stream() // Create a stream from the list of names
                .filter(name -> name.startsWith("E")) // Filter names that start with "E"
                .forEach(System.out::println); // Print each name that matches the filter condition
        // The `stream` method creates a sequential stream from the list of names.

        // Stream Operations:
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                .map(n -> n * n) // Map each number to its square
                .collect(Collectors.toList()); // Collect the results into a new list
        // The `map` method applies the given function to each element of the stream, transforming it into a new stream.

        List<String> result = names.stream()
                .filter(name -> name.length() > 3) // Filter names with length greater than 3
                .collect(Collectors.toList());
        // The `filter` method filters the elements of the stream based on the given predicate (condition).

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b); // Reduce the stream to a single sum value
        // The `reduce` method performs a reduction on the elements of the stream using an associative accumulation function.

        List<String> sorted = names.stream()
                .sorted() // Sort the names in natural order
                .collect(Collectors.toList());
        // The `sorted` method sorts the elements of the stream in natural order.
    }
}

/*
Explanation:
    - The `Stream` API is a powerful feature in Java that allows for functional-style operations on collections of data.
    - The `filter` method is used to filter elements based on a given condition (predicate).
    - The `map` method is used to transform each element of the stream into another form.
    - The `collect` method is used to gather the results of the stream operations into a collection (e.g., List).
    - The `reduce` method is used to combine elements of the stream into a single result using an associative accumulation function.
    - The `sorted` method is used to sort the elements of the stream in natural order.
*/
