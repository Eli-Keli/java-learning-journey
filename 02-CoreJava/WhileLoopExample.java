
public class WhileLoopExample {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;
        }
    }
}

/*
Output:
    Iteration: 1
    Iteration: 2
    Iteration: 3
    Iteration: 4
    Iteration: 5

Explanation:
    1. The while loop is used to execute a block of code repeatedly as long as a condition is true.
    2. In the example, we initialize a loop variable i to 1 and use a while loop to print the message "Iteration: " followed by the value of i.
    3. The loop continues as long as i is less than or equal to 5.
    4. After each iteration, the loop variable i is incremented by 1.
    5. The loop executes 5 times, printing the message for each iteration.
*/
