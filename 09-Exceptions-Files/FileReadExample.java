
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {

    public static void main(String[] args) {
        try {
            File file = new File("output.txt"); // Specify the file to read
            Scanner reader = new Scanner(file); // Create a Scanner object to read the file

            while (reader.hasNextLine()) { // Check if there are more lines to read
                System.out.println(reader.nextLine()); // Read and print each line
            }
            reader.close(); // Close the scanner to release resources and avoid memory leaks
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}

/*
Output:
    Hello, Java File Handling!

Explanation:
    1. The `File` class is used to create a file object representing the file "output.txt".
    2. The `Scanner` class is used to read the contents of the file line by line.
    3. The `hasNextLine` method checks if there are more lines to read, and `nextLine` reads the next line.
    4. If the file is not found, a `FileNotFoundException` is caught, and an error message is printed.
    5. This demonstrates how to read from a file in Java, including exception handling for potential errors.
 */
