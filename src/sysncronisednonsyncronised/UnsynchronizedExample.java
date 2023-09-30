package sysncronisednonsyncronised;

public class UnsynchronizedExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                stringBuilder.append(Thread.currentThread().getName());
                try {
                    Thread.sleep(100);  // Simulating some work
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

        System.out.println(stringBuilder.toString());
    }
}
