
class Counter {

    private int count = 0; // Shared resource

    // Synchronized method to control access. synchronized ensures that only one thread can execute this method at a time.
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizationExample {

    public static void main(String[] args) {
        Counter counter = new Counter(); // Create a shared Counter object	

        // Creating two threads that share the same Counter object
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        try {
            t1.join(); // Ensure t1 completes before proceeding
            t2.join(); // Ensure t2 completes before proceeding
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Final Count: " + counter.getCount());
    }
}

/*
Output:
    Final Count: 2000

Explanation:
    - The Counter class has a synchronized method increment() that ensures only one thread can increment the count at a time.
    - Two threads are created that both increment the count 1000 times each.
    - The main thread waits for both threads to finish using join() before printing the final count.
*/
