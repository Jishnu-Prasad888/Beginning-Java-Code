class NewThread extends Thread {
    NewThread() {
        super("Demo Thread"); // Call the superclass constructor
        System.out.println("Child Thread :" + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread : " + i);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted : " + e);
        }
        System.out.println("Exiting Child Thread");
    }
}

class ExtendingThread {
    public static void main(String[] args) {
        new NewThread();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main Thread : " + i);
                Thread.sleep(200); // Fixed typo: Thred -> Thread
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted : " + e);
        }
        System.out.println("Exiting main Thread");
    }
}
