
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, Java File Handling!"); // Write a string to the file
            writer.close(); // Close the file writer to release resources and flush data
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}

/*
Output:
    Successfully wrote to the file.

Explanation:
    1. The `FileWriter` class is used to write characters to a file.
    2. The `write` method writes the specified string to the file.
    3. The `close` method closes the file writer, ensuring that all data is flushed and resources are released.
    4. If an `IOException` occurs (e.g., if the file cannot be created or written to), it is caught in the `catch` block, and an error message is printed.
    5. This demonstrates how to handle file writing operations in Java, including exception handling for potential errors.
*/
