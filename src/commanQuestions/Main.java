package commanQuestions;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        
        int maxNumber = findMaxNumber(num1, num2, num3);
        
        System.out.println("The biggest number is: " + maxNumber);
    }
    
    public static int findMaxNumber(int num1, int num2, int num3) {
        int max = (num1 > num2) ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        return max;
    }
}
