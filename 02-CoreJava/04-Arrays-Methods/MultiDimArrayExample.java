
public class MultiDimArrayExample {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Element at row 1, column 2: " + matrix[1][2]);

        // Loop through the 2D array
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:
    Element at row 1, column 2: 6
    Matrix:
    1 2 3 
    4 5 6 
    7 8 9

Explanation:
    - A multi-dimensional array is an array of arrays, where each element of the outer array is itself an array.
    - In a 2D array, the first index represents the row number, and the second index represents the column number.
    - The elements of a 2D array can be accessed using two indices: one for the row and one for the column.
    - The length of a 2D array is the number of rows, and the length of each row can be different.
    - We can loop through a 2D array using nested for loops, where the outer loop iterates over the rows and the inner loop iterates over the columns.
*/
