package Lession6;

public class StringConverter {
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
