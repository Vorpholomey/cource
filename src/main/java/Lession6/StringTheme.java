package Lession6;

import java.util.Arrays;

public class StringTheme {
    public static void main(String[] args) {


        System.out.println("\n1. Напишите программу, которая выводит строку и ее длину. ");
        String firstSentence = "Менеджер,  программист и тестировщик попали в ДТП,  " +
                "несясь с горы,  из-за отказа тормозов";
        String secondSentence = ("Менеджер предложил сформировать группу обсуждения проблемы с тормозами");
        String thirdSentence = ("Программист предложил проверить каждый винтик");
        String fourthSentence = ("Тестировщик предложил затолкать машину в гору и повторить баг");

        searchMinMax(firstSentence, secondSentence, thirdSentence, fourthSentence);


        System.out.println("\n2. Напишите программу, которая переписывает строки в обратном порядке, " +
                "используя StringBuilder.\n");
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

        System.out.println("\n4. Напишите программу,  в которой создается массив строк,  " +
                "можно использовать строки, которые приведены выше в  задачах.\n");
        String[] stringArrays = {firstSentence, secondSentence, thirdSentence, fourthSentence};
        changeStringArrays(stringArrays);

        System.out.println("\n5. Создайте массив строк, в котором перечислены все  наши ФИО");

        String[] employeeNames = {"Жулин Роман Геннадьевич",
                "Шишляков Никита Евгеньевич",
                "Маношкин Никита Сергеевич",
                "Горковенко Алёна Дмитриевна",
                "Боровских Антон Евеньевич",
                "Золотарёва Диана Евгеньевна",
                "Милковский Роман Николаевич",
                "Бородина Ольга Викторовна",
                "Головина Анастасия Леонидовна",
                "Диятова Анжелика Сергеевна",
                "Юсупова Светлана Эмильевна",
                "Шевченко Евгения Николаевна",
                "Николаева Наталья Игоревна",
                "Недозрелов Евгений Батькович",
                "Приданников Николай Михайлович",
                "Хатажукова Наталья Сергеевна",
                "Шипулин Константин Батькович",
                "Агафонов Дмитрий Дмитриевич",
                "Дитинбир Артём Владимирович",
                "Заяц Юлия Федоровна",
                "Сваткова Ксения Сергеевна",
                "Масанов Александр Николаевич",
                "Бычков Алексей Александрович",
                "Степанова Оюна Борисовна"};

        sortStringArrays(employeeNames);

    }

    public static void sortStringArrays(String[] stringArrays) {
        Arrays.sort(stringArrays);
        System.out.println(Arrays.toString(stringArrays));



    }


    public static void changeStringArrays(String[] stringArrays) {

        for (String stringArray : stringArrays) {
            int digitCount = countDigits(stringArray);
            int letterCount = countLetters(stringArray);
            int spaceCount = countSpaces(stringArray);
            int vowelCount = countVowels(stringArray);

            System.out.println("\n1. Количество чисел (цифр): " + digitCount);
            System.out.println("2. Количество букв: " + letterCount);
            System.out.println("3. Количество пробелов: " + spaceCount);
            System.out.println("4. Количество гласных букв: " + vowelCount);
            System.out.println("5. Строка в верхнем регистре: " + stringArray.toUpperCase());
            System.out.println("6. Строка в нижнем регистре: " + stringArray.toLowerCase());
        }
    }

    private static int countDigits(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

    private static int countLetters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    private static int countSpaces(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }

    private static int countVowels(String str) {
        int count = 0;
        String vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void searchMinMax(String firstSentence, String secondSentence,
                                    String thirdSentence, String fourthSentence) {
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
            System.out.println(maxStringFirstGroup + "\n имеет максимальное количество символов равный "
                    + maxStringFirstGroup.length());
        } else {
            System.out.println(maxStringSecondtGroup + "\n имеет максимальное количество символов равный "
                    + maxStringSecondtGroup.length());
        }

        if (minStringFirstGroup.length() < minStringSecondtGroup.length()) {
            System.out.println(minStringFirstGroup + "\nимеет минимальное количество символов равный "
                    + minStringFirstGroup.length());
        } else {
            System.out.println(minStringSecondtGroup + "\nимеет минимальное количество символов равный "
                    + minStringSecondtGroup.length());
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
            if (stringBuilder.charAt(i) != ' ' && stringBuilder.charAt(i) != ',') {
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
