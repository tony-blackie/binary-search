public class Fibonacci {
    public static void main(String args[]) {
        for(int i = 0; i < 10; i++) {
            System.out.println(calculateFibonacciNumber(i));
        }
    }

    public static int calculateFibonacciNumber(int number) {
        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        return calculateFibonacciNumber(number - 1) + calculateFibonacciNumber(number - 2);
    }
}
