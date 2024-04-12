package itmo.lab_2;

public class Calculator {
    public double sum(double a, double b) {
        return a + b;
    }

    public long sum(long a, long b) {
        return a + b;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public long divide(long a, long b) {
        return a / b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result1 = calculator.sum(2.5, 3.5);
        long result2 = calculator.sum(3L, 5L);
        int result3 = calculator.sum(3, 5);
        double result4 = calculator.divide(2.5, 3.5);
        long result5 = calculator.divide(10L, 2L);
        int result6 = calculator.divide(3, 5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
