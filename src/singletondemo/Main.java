package singletondemo;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();

        int result = singleton.calculate(5, 3);
        System.out.println("Calculation result: " + result);
    }
}

