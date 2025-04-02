package Lession6;

public class StringCharachterCount {
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
}
