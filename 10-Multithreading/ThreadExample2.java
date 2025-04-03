// Implementing Runnable interface

class MyRunnable implements Runnable { // Represents an operation that does not return a result.

    public void run() { // The code that will be executed in the new thread
        for (int i = 0; i < 5; i++) { // Loop 5 times
            System.out.println("Thread (implementing Runnable): " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadExample2 {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable()); // Create a new thread with MyRunnable as the target
        thread.start(); // Start the thread
    }
}

/*
Output:
    Thread (implementing Runnable): 0
    Thread (implementing Runnable): 1
    Thread (implementing Runnable): 2
    Thread (implementing Runnable): 3
    Thread (implementing Runnable): 4
    Thread (implementing Runnable): 0
    Thread (implementing Runnable): 1
    Thread (implementing Runnable): 2
    Thread (implementing Runnable): 3
    Thread (implementing Runnable): 4
    - Will continue until the main thread is finished.
    - The output may vary due to the nature of multithreading.
    - The main thread may finish before the new thread, or vice versa.

Explanation:
    - This code demonstrates how to create a thread by implementing the Runnable interface.
    - The MyRunnable class implements the run() method, which contains the code that will be executed in the new thread.
    - The main method creates a new Thread object and starts it, which invokes the run() method in a separate thread of execution.
*/
// Note: The output may vary due to the nature of multithreading. The main thread may finish before the new thread, or vice versa.