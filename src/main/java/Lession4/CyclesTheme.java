package Lession4;
public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел: \n");
        int begin = -10;
        int end = 21;
        int start = begin;
        int summEven = 0;
        int summOdd = 0;
        do {
            if ((start % 2) == 0) {
                summEven += start;
            } else {
                summOdd += start;
            }
            start++;
        } while (start != end + 1);
        System.out.println("В отрезке [" + begin + ", " + end + "] сумма четных чисел = " + summEven + ", а нечетных = " + summOdd);
        System.out.println("\n2. Вывод чисел в порядке убывания:");
        int firstValue = 10;
        int secondValue = 5;
        int thirdValue = -1;
        int max = 0;
        int min = 0;
        if (firstValue > secondValue) {
            max = firstValue;
        } else {
            max = secondValue;
        }
        if (max < thirdValue) {
            max = thirdValue;
        }
        if (firstValue < secondValue) {
            min = firstValue;
        } else {
            min = secondValue;
        }
        if (min > thirdValue) {
            min = thirdValue;
        }
        System.out.println("max " + max + " min " + min);
        System.out.print("Числа в интервале (" + min + ", " + max + ") в порядке убывания: ");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int reversValue = 1234;
        int reversResult = 0;
        int summDigit = 0;
        while (reversValue != 0) {
            int digit = reversValue % 10;
            reversResult = reversResult * 10 + digit;
            summDigit += digit;
            reversValue /= 10;
        }
        System.out.println("Исходное число: " + reversValue);
        System.out.println("Исходное число в обратном порядке: " + reversResult);
        System.out.println("Сума цифр числа: " + summDigit);
        System.out.println("\n4. Вывод чисел в несколько строк");
        int minValue = 1;
        int maxValue = 24;
        int l = 0;
        for (int i = 1; i < maxValue; i++) {
            if (l == 5) {
                System.out.println();
                l = 0;
            }
            if ((minValue % 2) != 0) {
                System.out.printf("%4d", minValue);
                l++;
            }
            minValue++;
        }
        if (l > 0) {
            for (int i = l; i < 5; i++) {
                System.out.printf("%4d", 0);
            }
        }
        System.out.printf("\n\n 5. Проверка количества двоек числа на четность/нечетность\n");
        int dualValueOriginal = 3242592;
        int dualValue = dualValueOriginal;
        int j = 0;
        while (dualValue != 0) {
            int digit5 = dualValue % 10;
            if (digit5 == 2) {
                j++;
            }
            dualValue /= 10;
        }
        if (j % 2 != 0) {
            System.out.println("В " + dualValueOriginal + " нечетное количество двоек равно: " + j);
        } else {
            System.out.println("В " + dualValueOriginal + " двоек равно четное количество");
        }
        System.out.printf("\n6. Отображение геометрических фигур\n");
        int n = 0;
        int k = 5;
        int o = 0;
        for (int i = 0; i < 50; i++) {
            System.out.print("*");
            n++;
            if (n == 10) {
                System.out.println();
                n = 0;
            }
        }
        System.out.println();
        while (k != 0) {
            for (int m = 0; m < k; m++) {
                System.out.print("#");
            }
            System.out.println();
            k--;
        }
        System.out.println();
        do {
            for (int i = 0; i <= o; i++) {
                System.out.print("$");
            }
            System.out.println();
            o++;
        } while (o != 3);
        o--;
        do {
            o--;
            for (int i = 0; i <= o; i++) {
                System.out.print("$");
            }
            System.out.println();
        } while (o != 0);
        System.out.println("\n 7. Отображение ASCII-символов");
        String decimalHeader = "DECIMAL";
        String characterHeader = "CHARACTER";
        String descriptionHeader = "DESCRIPTION";
        System.out.printf("%-10s %-10s %-20s%n", decimalHeader, characterHeader, descriptionHeader);
        for (int code = 15; code <= 126; code++) {
            char ch = (char) code;

            if ((code < 48 && code % 2 != 0) || (code >= 97 && code <= 122 && code % 2 == 0)) {
                String description = Character.getName(code);
                System.out.printf("%-10d %-10c %-20s%n", code, ch, description);
            }
        }
        System.out.println("\n 8. Проверка, является ли число палиндромом");
        int palindromeValueOriginal = 1234321;
        int palindromeValue = palindromeValueOriginal;
        int palindromeResult = 0;
        while (palindromeValue != 0) {
            int digit = palindromeValue % 10;
            palindromeResult = palindromeResult * 10 + digit;
            palindromeValue /= 10;
        }
        if (palindromeValueOriginal == palindromeResult) {
            System.out.println("Число " + palindromeValueOriginal + " является палиндромом");
        } else {
            System.out.println("Число " + palindromeValueOriginal + " не является палиндромом");
        }
        System.out.println("\n 9. Проверка, является ли число счастливым");
        int happyDigitOriginal = 123123;
        int happyDigit = happyDigitOriginal;
        int happyDigitSum1 = 0;
        int happyDigitSum2 = 0;
        int digitNumber = 0;
        while (digitNumber != 3) {
            int digit = happyDigit % 10;
            happyDigitSum1 += digit;
            happyDigit /= 10;
            digitNumber++;
        }
        digitNumber = 0;
        while (digitNumber != 3) {
            int digit = happyDigit % 10;
            happyDigitSum2 += digit;
            happyDigit /= 10;
            digitNumber++;
        }
        if (happyDigitSum1 == happyDigitSum2) {
            System.out.println("Число " + happyDigitOriginal + " является  счастливым\n" +
                    "Сумма цифр ABC = " + happyDigitSum2 + ", а сумма DEF = " + happyDigitSum1);
        } else {
            System.out.println("Число " + happyDigitOriginal + " не является  счастливым\n" +
                    "Сумма цифр ABC = " + happyDigitSum2 + ", а сумма DEF = " + happyDigitSum1);
        }
        System.out.println("\n10.Отображение таблицы умножения Пифагора");
        int h = 0;
        int result = 0;
        for (int i = 1; i < 11; i++) {
            for (int m = 1; m < 10; m++) {
                if (i == 2) {
                    System.out.printf("%4s", "-");
                    h++;
                    if (h == 1) {
                        System.out.printf("%4s", "+");
                    }
                    if (h == 9) {
                        System.out.println();
                        h = 0;
                    }
                } else if (i == 1) {
                    result = i * m;
                    System.out.printf("%4d", result);
                    h++;
                    if (h == 1) {
                        System.out.printf("%4s", "|");
                    }
                    if (h == 9) {
                        System.out.println();
                        h = 0;
                    }
                } else {
                    result = (i - 1) * m;
                    System.out.printf("%4d", result);
                    h++;
                    if (h == 1) {
                        System.out.printf("%4s", "|");
                    }
                    if (h == 9) {
                        System.out.println();
                        h = 0;
                    }
                }
            }
        }
    }
}
