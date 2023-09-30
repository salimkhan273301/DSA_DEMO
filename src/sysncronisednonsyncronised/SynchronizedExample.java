package sysncronisednonsyncronised;

public class SynchronizedExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                stringBuffer.append(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);  // Simulating some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(stringBuffer.toString());
    }
}

