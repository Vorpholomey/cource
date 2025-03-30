package Lession6;

public class SearchMinMax {
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
}
