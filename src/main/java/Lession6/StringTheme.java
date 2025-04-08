package Lession6;

import static Lession6.EmployeeProcessor.editEmployer;
import static Lession6.SearchMinMax.searchMinMax;
import static Lession6.StringCharacterCount.changeStringArrays;
import static Lession6.StringConverter.checkForPolynomial;
import static Lession6.StringConverter.reverseString;

public class StringTheme {
    public static void main(String[] args) {

        System.out.println("\n1. Напишите программу, которая выводит строку и ее длину. ");
        String firstSentence = "Менеджер, программист и тестировщик попали в ДТП, " +
                "несясь с горы, из-за отказа тормозов";
        String secondSentence = "Менеджер предложил сформировать группу обсуждения проблемы с тормозами";
        String thirdSentence = "Программист предложил проверить каждый винтик";
        String fourthSentence = "Тестировщик предложил затолкать машину в гору и повторить баг";
        String[] sentences = new String[]{firstSentence, secondSentence, thirdSentence, fourthSentence};
        searchMinMax(sentences);

        System.out.println("2. Напишите программу, которая переписывает строки в обратном порядке, " +
                "используя StringBuilder.\n");
        reverseString(sentences);

        System.out.println("3. Напишите программу, которая  проверяет является ли строка палиномом.\n");
        String[] polynomialWords = {"Ежу хуже","Лев осовел","кошмар, срам, шок","кирилл лирик"};
        checkForPolynomial(polynomialWords);

        System.out.println("4. Напишите программу,  в которой создается массив строк,  " +
                "можно использовать строки, которые приведены выше в  задачах.\n");
        changeStringArrays(sentences);

        System.out.println("5. Создайте массив строк, в котором перечислены все  наши ФИО");
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

        editEmployer(employeeNames);

        System.out.println("6. Код, который принимает строки,  " +
                "и возвращает массив слов, из которых состоит строка, а так же количество слов в строке\n");
        StringConverter.returnMassiveWord(sentences);

        System.out.println("7. Напишите код, который в массиве строк находит пустую и " +
                "пишет на какой позиции она находится\n");
        String firstSentenceWithNull = "Менеджер, программист  и тестировщик попали в ДТП, " +
                "несясь с горы, из-за отказа  тормозов";
        String secondSentenceWithNull = ("Менеджер предложил  сформировать группу обсуждения  проблемы с тормозами");
        String thirdSentenceWithNull = (" Программист  предложил проверить  каждый винтик");
        String fourthSentenceWithNull = ("Тестировщик предложил затолкать машину  в гору и повторить  баг");
        String[] arrayWithNullStrings = {firstSentenceWithNull, secondSentenceWithNull, thirdSentenceWithNull,
                fourthSentenceWithNull};
        StringConverter.findEmptyStrings(arrayWithNullStrings);

        System.out.println("8. апишите метод, который принимает строку и заменяет все " +
                "вхождения одной подстроки на другую\n");

        StringConverter.replacesSomeStrings(arrayWithNullStrings, " ", "$$$");
        StringConverter.replacesSomeStrings(arrayWithNullStrings, "про", "№№№");
    }
}

