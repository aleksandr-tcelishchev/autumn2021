public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Thread main = new Thread(new MainThread());
//        Thread[] threads = new Thread[10];
//        for (int i = 0; i < 10; i++) {
//            threads[i] = new Thread(new Test(main));
//        }
//        for (int i = 0; i < 10; i++) {
//            threads[i].start();
//        }
//        main.start();
//        Thread.sleep(1010);
//        main.interrupt();

        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new Incrementer());
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }
        for (int i = 0; i < 10; i++) {
            threads[i].join();
        }
        System.out.println(Incrementer.value);
    }
}

class Incrementer implements Runnable{
    public static int value = 0;
    public static final Object monitor = new Object();

    @Override
    public void run() {
        increment();
    }

    public void increment(){
        synchronized (monitor) {
            System.out.println(Thread.currentThread().getName());
            for (int i = 0; i < 1000; i++) {
                value++;
            }
        }
    }
}

class MainThread implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            boolean checker = false;
            try {
                System.out.println("I'm main thread!");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Checked "+ Thread.currentThread().isInterrupted());
                return;
            }
        }
    }
}

class Test implements Runnable {

    private Thread thread;

    public Test(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
                thread.join();
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
