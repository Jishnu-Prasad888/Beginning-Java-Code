class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // Create a new thread and pass the current object (this) as the Runnable target.
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread Created: " + t);
        t.start(); // Start the thread
    }

    @Override
    public void run() {
        try {
            System.out.println("Child Thread Started");
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread i: " + i);
                Thread.sleep(200); // Sleep for 200 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread Interrupted: " + e);
        }
        System.out.println("Exiting Child Thread");
    }
}

public class CreatingThreads {
    public static void main(String[] args) {
        // Create and start the new thread
        new NewThread();

        try {
            System.out.println("Main Thread Started");
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread i: " + i);
                Thread.sleep(200); // Sleep for 200 milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted: " + e);
        }
        System.out.println("Exiting Main Thread");
    }
}
