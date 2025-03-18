package Lession6;

public class StringTheme {
    public static void main(String[] args) {


        System.out.println("\n1. Напишите программу, которая выводит строку и ее длину. ");
        String firstSentence = "Менеджер,  программист и тестировщик попали в ДТП,  " +
                "несясь с горы,  из-за отказа тормозов";
        String secondSentence = ("Менеджер предложил сформировать группу обсуждения проблемы с тормозами");
        String thirdSentence = ("Программист предложил проверить каждый винтик");
        String fourthSentence = ("Тестировщик предложил затолкать машину в гору и повторить баг");

        searchMinMax(firstSentence, secondSentence, thirdSentence, fourthSentence);


        System.out.println("\n2. Напишите программу, которая переписывает строки в обратном порядке, используя StringBuilder.\n");
        reverseString(firstSentence);
        reverseString(secondSentence);
        reverseString(thirdSentence);
        reverseString(fourthSentence);


        System.out.println("\n3. Напишите программу, которая  проверяет является ли строка палиномом.\n");

        String firstPolynomeWord = "Ежу хуже";
        String secondPolynomeWord = "Лев осовел";
        String thirdPolynomeWord = "кошмар, срам, шок";
        String fourthPolynomeWord = "кирилл лирик";

        checkForPalynome(firstPolynomeWord);
        checkForPalynome(secondPolynomeWord);
        checkForPalynome(thirdPolynomeWord);
        checkForPalynome(fourthPolynomeWord);
    }

    public static void searchMinMax(String firstSentence, String secondSentence, String thirdSentence, String fourthSentence) {
        String maxStringFirstGroup = "";
        String maxStringSecondtGroup = "";
        String minStringFirstGroup = "";
        String minStringSecondtGroup = "";


        //Разбиваем на группы и ищем мин макс в первой группе

        if (firstSentence.length() > secondSentence.length()) {
            maxStringFirstGroup = firstSentence;
            minStringFirstGroup = secondSentence;
        } else {
            maxStringFirstGroup = secondSentence;
            minStringFirstGroup = firstSentence;

        }

        //Разбиваем на группы и ищем мин макс во второй группе

        if (thirdSentence.length() > fourthSentence.length()) {
            maxStringSecondtGroup = thirdSentence;
            minStringSecondtGroup = fourthSentence;
        } else {
            maxStringSecondtGroup = fourthSentence;
            minStringSecondtGroup = thirdSentence;
        }

        //Найденные мин и макс в первой и во второй группах сравниваем между собой

        if (maxStringFirstGroup.length() > maxStringSecondtGroup.length()) {
            System.out.println(maxStringFirstGroup + "\n имеет максимальное количество символов равный " + maxStringFirstGroup.length());
        } else {
            System.out.println(maxStringSecondtGroup + "\n имеет максимальное количество символов равный " + maxStringSecondtGroup.length());
        }

        if (minStringFirstGroup.length() < minStringSecondtGroup.length()) {
            System.out.println(minStringFirstGroup + "\nимеет минимальное количество символов равный " + minStringFirstGroup.length());
        } else {
            System.out.println(minStringSecondtGroup + "\nимеет минимальное количество символов равный " + minStringSecondtGroup.length());
        }
    }

    public static void reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println(stringBuilder.reverse());
    }

    public static void checkForPalynome(String string) {
        String clearString = "";
        StringBuilder stringBuilder = new StringBuilder(string);
        Boolean isPalindrom = true;
        for (int i = 0; i < string.length(); i++) {
            if (stringBuilder.charAt(i) != ' '&& stringBuilder.charAt(i) != ',') {
                clearString = clearString + stringBuilder.charAt(i);
            }
        }
        StringBuilder stringBuilder1 = new StringBuilder(clearString);
        int leftItemString = 0;
        int rightItemString = stringBuilder1.length() - 1;
        while (leftItemString < rightItemString) {
            if (stringBuilder1.charAt(leftItemString) != stringBuilder1.charAt(rightItemString)) {
                isPalindrom = false;
                break;
            }
            leftItemString++;
            rightItemString--;
        }
        if (isPalindrom) {
            System.out.println("Строка является палиномом");
        } else {
            System.out.println("Строка не является палиномом");
        }

    }
}
