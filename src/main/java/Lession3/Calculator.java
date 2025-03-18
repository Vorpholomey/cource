package Lession3;

public class Calculator {
    public static void main(String[] args) {
        // Вводим значения математических операций +, -, *, /, ^, %
        double a = 2;
        double b = 0;
        char sign = '%';

        if (sign == '+') {
            double result = a + b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
        if (sign == '-') {
            double result = a - b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
        if (sign == '*') {
            double result = a * b;
            System.out.println(a + " " + sign + " " + b + " = " + result);
        }
        if (sign == '/') {
            if (b != 0) {
                double result = a / b;
                System.out.println(a + " " + sign + " " + b + " = " + result);
            } else {
                System.out.println("На ноль делить нельзя");
            }
        }
        if (sign == '%') {
            if (b != 0) {
                double result = a % b;
                System.out.println(a + " " + sign + " " + b + " = " + result);
            } else {
                System.out.println("На ноль делить нельзя");
            }
        }
        if (sign == '^') {
            if (b != 0) {
                double result = 1;
                for (int i = 0; i < b; i++) {
                    result = result * a;
                }
                System.out.println(a + " " + sign + " " + b + " = " + result);
            } else {
                double result = 1;
                System.out.println(a + " " + sign + " " + b + " = " + result);
            }
        }
    }
}
