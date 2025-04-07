
import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String user = "root";
        String password = "password";

        try {
            // 1. Load the JDBC driver (optional for newer Java)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);

            // 3. Create a statement
            Statement stmt = conn.createStatement();

            // 4. Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // 5. Process the results
            while (rs.next()) {
                System.out.println("Username: " + rs.getString("username"));
            }

            // 6. Close everything
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Explanation:
    1. Load the JDBC driver: This step is optional in newer versions of Java, as the driver is automatically loaded when you use the DriverManager class.
    2. Connect to the database: Use the DriverManager class to establish a connection to the database using the specified URL, username, and password.
    3. Create a statement: Create a Statement object to send SQL statements to the database.
    4. Execute a query: Use the Statement object to execute a SQL query and retrieve the results in a ResultSet object.
    5. Process the results: Iterate through the ResultSet to access the data returned by the query.
    6. Close everything: Close the ResultSet, Statement, and Connection objects to free up resources.

    - Make sure to replace the database URL, username, and password with your actual database credentials.
    - Ensure you have the MySQL JDBC driver in your classpath. You can download it from the MySQL website or use a build tool like Maven or Gradle to manage dependencies.
    - This example assumes you have a MySQL database running locally with a database named "mydatabase" and a table named "users" with a column "username". Adjust the SQL query as needed for your database schema.
    - This is a basic example. In a real-world application, you should handle exceptions more gracefully and consider using prepared statements to prevent SQL injection attacks.
*/
