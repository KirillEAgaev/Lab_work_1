package itmo.lab_11;

public class MyThread implements Runnable {
    private String name;
    private Object lock;
    private boolean running;

    public MyThread(String name, Object lock) {
        this.name = name;
        this.lock = lock;
        this.running = true;
    }

    @Override
    public void run() {
        while (running) {
            synchronized (lock) {
                try {
                    System.out.println(name);
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // восстановить флаг прерывания
                }
            }
        }
    }

    public void stopThread() {
        running = false;
    }
}
