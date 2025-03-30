package Lession6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringTheme {
    public static void main(String[] args) {


        System.out.println("\n1. Напишите программу, которая выводит строку и ее длину. ");
        String firstSentence = "Менеджер, программист и тестировщик попали в ДТП, " +
                "несясь с горы, из-за отказа тормозов";
        String secondSentence = ("Менеджер предложил сформировать группу обсуждения проблемы с тормозами");
        String thirdSentence = ("Программист предложил проверить каждый винтик");
        String fourthSentence = ("Тестировщик предложил затолкать машину в гору и повторить баг");

        SearchMinMax.searchMinMax(firstSentence, secondSentence, thirdSentence, fourthSentence);

        System.out.println("\n2. Напишите программу, которая переписывает строки в обратном порядке, " +
                "используя StringBuilder.\n");
        StringConverter.reverseString(firstSentence);
        StringConverter.reverseString(secondSentence);
        StringConverter.reverseString(thirdSentence);
        StringConverter.reverseString(fourthSentence);

        System.out.println("\n3. Напишите программу, которая  проверяет является ли строка палиномом.\n");

        String firstPolynomeWord = "Ежу хуже";
        String secondPolynomeWord = "Лев осовел";
        String thirdPolynomeWord = "кошмар, срам, шок";
        String fourthPolynomeWord = "кирилл лирик";

        StringConverter.checkForPalynome(firstPolynomeWord);
        StringConverter.checkForPalynome(secondPolynomeWord);
        StringConverter.checkForPalynome(thirdPolynomeWord);
        StringConverter.checkForPalynome(fourthPolynomeWord);

        System.out.println("\n4. Напишите программу,  в которой создается массив строк,  " +
                "можно использовать строки, которые приведены выше в  задачах.\n");
        String[] stringArrays = {firstSentence, secondSentence, thirdSentence, fourthSentence};
        StringCharachterCount.changeStringArrays(stringArrays);

        System.out.println("\n5. Создайте массив строк, в котором перечислены все  наши ФИО");
        String[] employeeNames;
        employeeNames = new String[]{"Жулин Роман Геннадьевич",
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

        EmployeeProcessor.editEmployer(employeeNames);

        System.out.println("\n5. Код, который принимает строки,  " +
                "и возвращает массив слов, из которых состоит строка, а так же количество слов в строке\n");
        returnMassiveWord(stringArrays);
    }

    public static void returnMassiveWord(String[] stringArrays) {
        for (String stringArray : stringArrays) {
            String[] partsWord = stringArray.split(" ");
            System.out.println("Количество слов в строке: " + partsWord.length);
            System.out.println("Слова в строке: " + Arrays.toString(partsWord));
        }
    }

}

