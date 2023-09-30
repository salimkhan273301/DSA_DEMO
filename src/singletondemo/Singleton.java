package singletondemo;

public class Singleton {
    private static Singleton instance;

    // Private constructor to prevent direct instantiation
    private Singleton() {
    }

    // Lazy initialization with double-checked locking
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        // Method implementation
        System.out.println("Singleton instance is doing something.");
    }

    public int calculate(int a, int b) {
        // Method implementation
        return a + b;
    }
}

