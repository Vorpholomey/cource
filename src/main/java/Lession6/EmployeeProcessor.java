package Lession6;

import java.util.Arrays;

public class EmployeeProcessor {

    public static void editEmployer(String[] stringArrays) {
        sortStringArrays(stringArrays);
        printInitials(stringArrays);
        searchVowelSurnames(stringArrays);
        searchNameEndingInConsonant(stringArrays);
    }

    private static void sortStringArrays(String[] stringArrays) {
        System.out.println("\nВывод отсортированный список сотрудников");
        Arrays.sort(stringArrays);
        System.out.println(Arrays.toString(stringArrays));

    }

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

    private static void searchVowelSurnames(String[] stringArrays) {
        System.out.println("\nВывод ФИО чьи фамилии начинаются на гласную");
        for (String stringArray : stringArrays) {
            String surname = stringArray.split(" ")[0];
            if (checkStartVowel(surname)) {
                System.out.println(stringArray);
            }
        }
    }

    private static void searchNameEndingInConsonant(String[] stringArrays) {
        System.out.println("\nВывод ФИО чьи имена заканчиваются на согласную ");
        for (String stringArray : stringArrays) {
            if (checkEndConsonantal(stringArray)) {
                System.out.println(stringArray);
            }
        }
    }


    private static boolean checkStartVowel(String string) {
        String vowels = "АЕЁИОУЫЭЮЯаеёиоуыэюя";
        return vowels.indexOf(string.charAt(0)) != -1;
    }

    private static boolean checkEndConsonantal(String string) {
        String name = string.split(" ")[1];
        char lastChar = name.charAt(name.length() - 1);
        String consonants = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩбвгджзйклмнпрстфхцчшщ";
        return consonants.indexOf(lastChar) != -1;
    }
}
