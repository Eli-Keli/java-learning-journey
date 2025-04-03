// Extending the Thread class

class MyThread extends Thread { // A thread is a thread of execution in a program. The Java virtual machine allows an application to have multiple threads of execution running concurrently.

    public void run() { // The run() method is the entry point for the thread. It contains the code that will be executed when the thread is started.
        for (int i = 0; i < 5; i++) { // The for loop will run 5 times.
            // The loop will print the current value of i and then pause for 500 milliseconds.This simulates some work being done by the thread.
            System.out.println("Thread (extending Thread): " + i);
            try {
                Thread.sleep(500); // Pause for 500ms
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadExample1 {

    public static void main(String[] args) {
        MyThread thread = new MyThread(); // Create a new thread instance
        thread.start(); // Start the thread
    }
}

/*
Output:
    Thread (extending Thread): 0
    Thread (extending Thread): 1
    Thread (extending Thread): 2
    Thread (extending Thread): 3
    Thread (extending Thread): 4
    Thread (extending Thread): 0
    Thread (extending Thread): 1
    Thread (extending Thread): 2
    Thread (extending Thread): 3
    Thread (extending Thread): 4
    Thread (extending Thread): 0
    Thread (extending Thread): 1
    Thread (extending Thread): 2
    Thread (extending Thread): 3
    Thread (extending Thread): 4
    - Will continue until the main thread ends. (The main thread will wait for the child thread to finish before exiting.)
    - The output may vary due to the nature of multithreading.
    - The thread will print numbers from 0 to 4, pausing for 500ms between each number.
    - The main thread will wait for the child thread to finish before exiting.

Explanation:
    - This program demonstrates how to create a thread by extending the Thread class in Java.
    - The MyThread class extends the Thread class and overrides the run() method.
    - The run() method contains a loop that prints numbers from 0 to 4, pausing for 500 milliseconds between each number.
    - In the main method, an instance of MyThread is created and started using the start() method.
    - The start() method creates a new thread and calls the run() method in that thread.
*/
