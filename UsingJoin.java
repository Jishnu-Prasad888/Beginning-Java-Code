class NewThread implements Runnable {

    String name;
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("NewThread  : " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " i : " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " InterruptedException");
        }
        System.out.println("Exiting :" + name);
    }
}

public class UsingJoin {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread("One");
        NewThread obj2 = new NewThread("Two");
        NewThread obj3 = new NewThread("Three");

        System.out.println("Thread one is alive: " + obj1.t.isAlive());
        System.out.println("Thread two is alive: " + obj2.t.isAlive());
        System.out.println("Thread three is alive: " + obj3.t.isAlive());

        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }

        System.out.println("Thread One is alive: " + obj1.t.isAlive());
        System.out.println("Thread Two is alive: " + obj2.t.isAlive());
        System.out.println("Thread Three is alive: " + obj3.t.isAlive());

        System.out.println("Main Thread Exiting");
    }
}
