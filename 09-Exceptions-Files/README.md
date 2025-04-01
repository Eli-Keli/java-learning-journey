# Exception Handling & File Handling - Day 9
## Topics Covered:
- Try-Catch Blocks
- Throwing & Custom Exceptions
- Writing & Reading Files

## Challenges:
- (None)
## Takeaways:
**What are Exceptions?** An exception is an unexpected event that disrupts the normal flow of a program.

Examples of common exceptions:
- `ArithmeticException` – Division by zero

- `NullPointerException` – Trying to access a null object

- `ArrayIndexOutOfBoundsException` – Accessing an invalid index in an array

- `IOException` – File read/write error



**Handling Exceptions with Try-Catch** 

*Key Points:*
- The `try` block contains code that might cause an exception.

- The `catch` block handles the exception.

- The `finally` block always executes (used for cleanup).


**Throwing & Creating Custom Exceptions** 

You can throw exceptions manually using throw and create custom exceptions.

*Key Points:*
- Use `throw` to manually trigger an exception.

- Use `IllegalArgumentException` for invalid inputs.


**Writing to a File** 

*Key Points:*
- `FileWriter` writes text to a file.

- Always close the file after writing (`writer.close()`).


**Reading from a File** 

*Key Points:*
- Use `Scanner` to read files line by line.

- Handle `FileNotFoundException` properly.

