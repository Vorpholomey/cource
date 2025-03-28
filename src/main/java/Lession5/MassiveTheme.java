package Lession5;

import java.util.Arrays;
import java.util.Random;

public class MassiveTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Создайте массив целых чисел и найдите его сумму.");
        int[] digits = {123, 333, 234, 455, 676, 3, 42, 3, 3};
        int dig = 0;
        for (int i = 0; i < digits.length; i++) {
            dig = dig + digits[i];
        }
        System.out.println(dig);

        System.out.println("\n\n2. Создайте массив строк и выведите на экран все строки, у которых длина больше 5 символов.");

        String[] strings = {"Sergey", "Roman", "Goga", "Zhora", "Gosha", "Georgiy"};
        for (String str : strings) {
            if (str.length() > 5) {
                System.out.println(str);
            }
        }
        System.out.println("\n\n3. Создайте массив целых чисел и найдите минимальное и максимальное значение в нем.");
        int digitsMax = digits[0];
        int digitsMin = digits[0];
        for (int digit : digits) {
            if (digitsMax < digit) {
                digitsMax = digit;
            }
            if (digitsMin > digit) {
                digitsMin = digit;
            }

        }
        System.out.println("Максимальное значение массива: " + digitsMax);
        System.out.println("Минимальное значение массива: " + digitsMin);

        System.out.println("\n\n4. Создайте массив целых чисел и отсортируйте его по возрастанию.");

        for (int k = 0; k < digits.length; k++) {
            for (int i = 0; i < digits.length - 1; i++) {
                if (digits[i] > digits[i + 1]) {
                    int digitSortedItem = digits[i];
                    digits[i] = digits[i + 1];
                    digits[i + 1] = digitSortedItem;
                }
            }
        }
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("\n\n5. Создайте двумерный массив и выведите на экран сумму каждой строки.");
        int[][] digits2dMassive = {{1, 5, 8, 9}, {8, 66, 54, 8}, {96, 12, 11, 2}};
        int digits2dMassiveSumm = 0;
        for (int i = 0; i < digits2dMassive.length; i++) {
            for (int j = 0; j < digits2dMassive[i].length; j++) {
                digits2dMassiveSumm = digits2dMassiveSumm + digits2dMassive[i][j];
            }
            System.out.println("Сумма " + i + " строки массива равна : " + digits2dMassiveSumm);
            digits2dMassiveSumm = 0;
        }

        System.out.println("\n\n6. Создайте двумерный массив и найдите наименьший элемент в каждом столбце.");

        for (int i = 0; i < digits2dMassive[0].length; i++) {
            digitsMin = digits2dMassive[0][i];
            for (int j = 0; j < digits2dMassive.length; j++) {
                if (digitsMin > digits2dMassive[j][i]) {
                    digitsMin = digits2dMassive[j][i];
                }
            }
            System.out.println("Наименьшее чило в столбце " + i + " равна : " + digitsMin);
        }

        System.out.println("\n\n7. Создайте массив целых чисел и определите, является ли он палиндромом (т.е. читается одинаково слева направо и справа налево).");

        int[] palindromMassive = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int leftItemMassive = 0;
        int rightItemMassive = palindromMassive.length - 1;
        boolean isPalindrom = true;

        while (leftItemMassive < rightItemMassive) {
            if (palindromMassive[leftItemMassive] != palindromMassive[rightItemMassive]) {
                isPalindrom = false;
                break;
            }
            leftItemMassive++;
            rightItemMassive--;
        }
        if (isPalindrom) {
            System.out.println("Массив " + Arrays.toString(palindromMassive) + " является палиндромом");
        } else {
            System.out.println("Массив " + Arrays.toString(palindromMassive) + " не является палиндромом");
        }


        System.out.println("\n\n8.  Вычисление среднего значения всех элементов в неравномерном массиве");
        int[][] array = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        double[] arrayNew = new double[array.length];
        int arrayNewitem = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayNewitem = arrayNewitem + array[i][j];
            }
            arrayNew[i] = (double) arrayNewitem / array[i].length;
            arrayNewitem = 0;
        }
        System.out.println("Массив из средних значений равен: " + Arrays.toString(arrayNew));


        System.out.println("\n\n9.  Поиск максимальной суммы подмассива в неравномерном массиве.");

        int[][] irregularArray = new int[7][];

        Random random = new Random();
        for (int i = 0; i < irregularArray.length; i++) {
            int subArrayLength = random.nextInt(8) + 3; // Длина подмассива от 3 до 10
            irregularArray[i] = new int[subArrayLength];
            for (int j = 0; j < subArrayLength; j++) {
                irregularArray[i][j] = random.nextInt(201) - 100; // Числа от -100 до 100
            }
        }
        System.out.println("Исходный массив:");
        for (int[] subArray : irregularArray) {
            System.out.println(Arrays.toString(subArray));
        }
        int sums = 0;
        int[] maxSums = new int[irregularArray.length];
        for (int i = 0; i < irregularArray.length; i++) {
            for (int j = 0; j < irregularArray[i].length; j++) {
                sums = sums + irregularArray[i][j];
            }
            maxSums[i] = sums;
            sums = 0;
        }
        System.out.println("\nМассив сумм подмассивов: " + Arrays.toString(maxSums));

        int maxSum = Arrays.stream(maxSums).max().getAsInt();
        int minSum = Arrays.stream(maxSums).min().getAsInt();
        double averageSum = Arrays.stream(maxSums).average().orElse(0);

        System.out.println("\nМаксимальная сумма: " + maxSum);
        System.out.println("Минимальная сумма: " + minSum);
        System.out.println("Средняя сумма: " + averageSum);

    }
}




