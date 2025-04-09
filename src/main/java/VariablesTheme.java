
public class VariablesTheme {
    public static void main(String[] args) {
        int frequencyCpuMemory=3200;
        char modelCpu = 'M';
        boolean gaming = true;
        byte memoryOfRam = 64;
        short memoryOfRamGpu = 24;
        float frequencyCpuGhz = 2.4F;
        double powerUsage = 65D;
        System.out.println("1. Вывод характеристик компьютера \n");
        System.out.println("Частота шины процессора: "+ frequencyCpuMemory);
        System.out.println("Модель процессора: "+ modelCpu);
        System.out.println("Предназначен для игрового компьютера: " + gaming);
        System.out.println("Количество оперативной памяти компьютера: " + memoryOfRam + "Gb");
        System.out.println("Количество оперативной памяти видеокарты: " + memoryOfRamGpu + "Gb");
        System.out.println("Тактовая частота процессора: " + frequencyCpuGhz + "GHz");
        System.out.println("Энергопотребление процессора: " + powerUsage + "Вт");

        System.out.println("\n2. Расчет стоимости товара со скидкой \n");
        double costPen = 105.5D;
        double costPencil = 235.83D;
        double discount = 0.11D;
        double totalSumm = costPencil+costPen;
        double finalSumm = (totalSumm*(1-discount));
        double saleSumm = ((totalSumm)-finalSumm);

        System.out.println("Стоимость товаров без скидки: \n Ручка: " + costPen + "\n Карандаш: " + costPencil);
        System.out.println("Общая стоимость товаров без скидки: " + String.format("%.2f", totalSumm));
        System.out.println("Сумма скидки: " + String.format("%.2f", saleSumm));
        System.out.println("Стоимость товаров с учетом скидки: " + String.format("%.2f", finalSumm));

        System.out.println("\n3. Вывод слова  JAVA \n");

        System.out.println("    J    a  v     v  a " +
                "\n    J   a a  v   v  a a\n" +
                " J  J  aaaaa  V V  aaaaa\n" +
                "  JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод MIN И MAX значение целых числовых типов: \n");
        int intValue=2147483647;
        long longValue = 9223372036854775807L;
        byte byteValue = 127;
        short shortValue = 32767;
        char charValue = '9';

        System.out.println("Работа с переменной типа int: \n"+ "исходное значение: " + longValue +
                "\nзначение после инкремента на 1: " + (intValue++)
                + "\nзначение после декремента на 1: " + (intValue--));

        System.out.println("Работа с переменной типа long: \n"+ "исходное значение: " + longValue +
                "\nзначение после инкремента на 1: " + (longValue++)
                + "\nзначение после декремента на 1: " + (longValue--));

        System.out.println("Работа с переменной типа byte: \n"+ "исходное значение: " + byteValue +
                "\nзначение после инкремента на 1: " + (byteValue++)
                + "\nзначение после декремента на 1: " + (byteValue--));

        System.out.println("Работа с переменной типа short: \n"+ "исходное значение: " + shortValue +
                "\nзначение после инкремента на 1: " + (shortValue++)
                + "\nзначение после декремента на 1: " + (shortValue--));

        System.out.println("Работа с переменной типа char: \n"+ "исходное значение: " + charValue +
                "\nзначение после инкремента на 1: " + (charValue++)
                + "\nзначение после декремента на 1: " + (charValue--));

        System.out.println("\n5. Перестановка значений переменных: \n");

        int replaceValueOne = 2;
        int replaceValueTwo = 5;

        System.out.println("Исходное значение первой переменной: " + replaceValueOne +
        "\nИсходное значение второй переменной: " + replaceValueTwo);
        System.out.println("\nПерестановка значений с помощью третьей переменной: ");

        int replaceValueTree = replaceValueOne;

        replaceValueOne = replaceValueTwo;
        replaceValueTwo = replaceValueTree;
        System.out.println("Значение первой переменной: " + replaceValueOne + "\nЗначение второй переменной: "
                + replaceValueTwo);

        System.out.println("\nПерестановка значений с помощью математических операций: ");
        replaceValueOne = replaceValueOne + replaceValueTwo;
        replaceValueTwo = replaceValueOne - replaceValueTwo;
        replaceValueOne = replaceValueOne - replaceValueTwo;
        System.out.println("Значение первой переменной: " + replaceValueOne + "\nЗначение второй переменной: "
                + replaceValueTwo);

        System.out.println("\nПерестановка значений с помощью побитовой операций ^ : ");
        replaceValueTree = replaceValueOne ^ replaceValueTwo;
        replaceValueOne = replaceValueOne ^ replaceValueTree;
        replaceValueTwo = replaceValueTwo ^ replaceValueTree;
        System.out.println("Значение первой переменной: " + replaceValueOne + "\nЗначение второй переменной: "
                + replaceValueTwo);

        System.out.println("\n6. Вывод символов и их кодов: \n");


        char symbol36 = '$';
        char symbol42 = '*';
        char symbol64 = '@';
        char symbol94 = '^';
        char symbol126 = '~';

        System.out.println("Вывод символа: "+ symbol36 + " и его кода: " + (int)symbol36);
        System.out.println("Вывод символа: "+ symbol42 + " и его кода: " + (int)symbol42);
        System.out.println("Вывод символа: "+ symbol64 + " и его кода: " + (int)symbol64);
        System.out.println("Вывод символа: "+ symbol94 + " и его кода: " + (int)symbol94);
        System.out.println("Вывод символа: "+ symbol126 + " и его кода: " + (int)symbol126);


        System.out.println("\n7. Вывод в консоль ASCII-АРТ дюка: \n");
        char dukeElementOne = (char) 47; //Slash
        char dukeElementTwo = (char) 92; //backslash
        char dukeElementTree = (char) 95; //	Underscore
        char dukeElementFour = (char) 40; //Left parenthesis
        char dukeElementFive = (char) 41; //Right parenthesis


        System.out.println("    "+dukeElementOne+dukeElementTwo+"\n" +
                "   "+dukeElementOne+"  "+dukeElementTwo+"\n" +
                "  "+dukeElementOne+dukeElementTree+dukeElementFour+" "+dukeElementFive+dukeElementTwo+"\n" +
                " "+dukeElementOne+"      "+dukeElementTwo+"\n" +
                dukeElementOne+dukeElementTree+dukeElementTree+dukeElementTree+dukeElementTree+dukeElementOne+
                dukeElementTwo+dukeElementTree+dukeElementTree+dukeElementTwo);

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами: \n");

        int decManipulation = 543;
        int decManipulationHundred = decManipulation / 100;
        int decManipulationTens = (decManipulation % 100) / 10;
        int decManipulationUnits = (decManipulation % 100) % 10;

        System.out.println("Число " + decManipulation + " содержит:");
        System.out.println("     сотен: " + decManipulationHundred );
        System.out.println("     десятков: " + decManipulationTens );
        System.out.println("     единиц: " + decManipulationUnits);
        System.out.println("Сумма разрядов: " + (decManipulationHundred + decManipulationTens + decManipulationUnits));
        System.out.println("Произведение разрядов: "
                + (decManipulationHundred * decManipulationTens * decManipulationUnits));

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды ЧЧ:ММ:СС: \n");

        int secondsValue = 86399;
        int secondsValueHours = secondsValue / 3600;
        int secondsValueMinutes = (secondsValue % 3600) / 60;
        int secondsValueSecond = (secondsValue % 3600) % 60;

        System.out.println("Имеется значение в секундах: "+ secondsValue);

        System.out.println("Значение времени: "
                + secondsValueHours + ":" + secondsValueMinutes + ":"+ secondsValueSecond );

        System.out.println("\n10*. Расчет стоимости товара со скидкой: \n");





    }
}
