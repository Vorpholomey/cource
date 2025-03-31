package Lession6;

import java.util.Arrays;

public class StringConverter {
   //Печать строк наоборот, реверс строки
    public static void reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        System.out.println(stringBuilder.reverse());
    }
//Метод проверки на полином
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
    //Метод возвращения слов из массива строк
    public static void returnMassiveWord(String[] stringArrays) {
        for (String stringArray : stringArrays) {
            String[] partsWord = stringArray.split(" ");
            System.out.println("Количество слов в строке: " + partsWord.length);
            System.out.println("Слова в строке: " + Arrays.toString(partsWord));
        }
    }

}
