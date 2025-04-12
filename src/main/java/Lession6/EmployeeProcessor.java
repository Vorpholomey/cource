package Lession6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EmployeeProcessor {

    public static void editEmployer(String[] stringArrays) {
        sortStringArrays(stringArrays);
        printInitials(stringArrays);
        searchVowelSurnames(stringArrays);
        searchNameEndingInConsonant(stringArrays);
        printNamesWithoutDuplicateChars(stringArrays);
    }

    //Метод вывода отсортированного списка
    private static void sortStringArrays(String[] stringArrays) {
        System.out.println("\nВывод отсортированный список сотрудников");
        Arrays.sort(stringArrays);
        System.out.println(Arrays.toString(stringArrays));

    }

    //Метод который выводит фамилий с инициалами
    private static void printInitials(String[] stringArrays) {
        System.out.println("\nВывод фамилий с инициалами");
        for (String stringArray : stringArrays) {
            String[] partsName = stringArray.split(" ");
            String surname = partsName[0];
            char firsnameInitial = partsName[1].charAt(0);
            char secondnameinitial = partsName[2].charAt(0);
            System.out.println(surname + " " + firsnameInitial + "." + secondnameinitial + ".");
        }
    }

    //Метод который выводит ФИО чьи фамилии начинаются на гласную
    private static void searchVowelSurnames(String[] stringArrays) {
        System.out.println("\nВывод ФИО чьи фамилии начинаются на гласную");
        for (String stringArray : stringArrays) {
            String surname = stringArray.split(" ")[0];
            if (checkStartVowel(surname)) {
                System.out.println(stringArray);
            }
        }
    }

    //Метод который выводит ФИО имена котрых заканчиваются на согласную
    private static void searchNameEndingInConsonant(String[] stringArrays) {
        System.out.println("\nВывод ФИО чьи имена заканчиваются на согласную ");
        for (String stringArray : stringArrays) {
            if (checkEndConsonantal(stringArray)) {
                System.out.println(stringArray);
            }
        }
    }

    //Метод который проверяет начало фамилии на гласную
    private static boolean checkStartVowel(String string) {
        String vowels = "АЕЁИОУЫЭЮЯаеёиоуыэюя";
        return vowels.indexOf(string.charAt(0)) != -1;
    }

    //Метод который проверяет окончание имени на согласную
    private static boolean checkEndConsonantal(String string) {
        String name = string.split(" ")[1];
        char lastChar = name.charAt(name.length() - 1);
        String consonants = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ";
        return consonants.indexOf(lastChar) != -1;
    }

    //Метод который удаляет дубликаты букв в строках
    private static String removeDuplicateChars(String string) {
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c : string.toCharArray()) {
            char upperC = Character.toUpperCase(c);
            if (!seen.contains(upperC)) {
                seen.add(upperC);
                result.append(c);
            }
        }
        return result.toString();
    }

    //Метод который выводит строки без дубликатов букв
    private static void printNamesWithoutDuplicateChars(String[] employees) {
        for (String emp : employees) {
            System.out.println(removeDuplicateChars(emp));
        }
    }
}
