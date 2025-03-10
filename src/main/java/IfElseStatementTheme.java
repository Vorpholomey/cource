public class IfElseStatementTheme {
    public static void main(String[] args) {

        System.out.println("1. Перевод псевдокода на язык Java:\n");
        int age = 30;
        String sex = "female";
        double hight = 1.12d;
        char name = "Mortey".charAt(0);

        if (age > 20) {
            System.out.println("Пипец ты старый, как ты живешь в свои " + age);
        } else {
            System.out.println("Не ну ты еще норм че в свои " + age);
        }
        if (sex != "male") {
            System.out.println("Вы прекрасная половина человечества");
        } else {
            System.out.println("А ты хорош, мужик!");
        }

        if (hight < 1.80) {
            System.out.println("Вы недостаточно высокого роста");
        } else {
            System.out.println("А вы высокий(ая)");
        }

        if (name == 'M') {
            System.out.println("Ваше имя начинается на М");
        } else if (name == 'I') {
            System.out.println("Ваше имя начинается на I");
        } else {
            System.out.println("Ваше имя не начиинается на М и I");
        }

        System.out.println("\n2. Поиск max и min числа");

        int firstValue = 10;
        int secondValue = 1;

        if (firstValue > secondValue) {
            System.out.println("Максимальное число равно: " + firstValue);
            System.out.println("Минимальное число равно: " + secondValue);
        } else if (firstValue == secondValue) {
            System.out.println("Чила " + firstValue + " и " + secondValue + " равны");
        } else {
            System.out.println("Максимальное число равно: " + secondValue);
            System.out.println("Минимальное число равно: " + firstValue);
        }
        System.out.println("\n3. Проверка числа");
        int verifyNumber = 125;

        if (verifyNumber != 0) {
            if (verifyNumber % 2 == 0) {
                System.out.println("Число " + verifyNumber + " является четным");
            } else if (verifyNumber % 2 != 0) {
                System.out.println("Число " + verifyNumber + " является не четным");
            }
            if (verifyNumber < 0) {
                System.out.println("Число " + verifyNumber + " является отрицательным");
            } else {
                System.out.println("Число " + verifyNumber + " является положительным");
            }
        } else {
            System.out.println("Число " + verifyNumber + " является нулем");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int equalsFirstNumber = 123;
        int equalsSecondNumber = 456;

        if ((equalsFirstNumber / 100 != equalsSecondNumber / 100) && (equalsFirstNumber / 10 != equalsSecondNumber / 10)
                && (equalsFirstNumber % 10 != equalsSecondNumber % 10)) {
            System.out.println("Число " + equalsFirstNumber + " и число " + equalsSecondNumber + " не имеют общих цифр");
        } else {
            System.out.println("В числах " + equalsFirstNumber + " и " + equalsSecondNumber);
            if (equalsFirstNumber / 100 == equalsSecondNumber / 100) {
                System.out.println("В сотнях имеются одинаковые цифры " + (equalsFirstNumber / 100));
            }
            if ((equalsFirstNumber % 100) / 10 == (equalsSecondNumber % 100) / 10) {
                System.out.println("В десятках имеются одинаковые цифры " + ((equalsFirstNumber % 100) / 10));
            }
            if ((equalsFirstNumber % 100) % 10 == (equalsSecondNumber % 100) % 10) {
                System.out.println("В единицах имеются одинаковые цифры " + ((equalsFirstNumber % 100) % 10));
            }
        }
        System.out.println("\n5. Определение символа по его коду");
        char detectSymbolValue = '\u0057';

        if (Character.isDigit(detectSymbolValue)) {
            System.out.println("Это число " + detectSymbolValue);
        } else if (Character.isLowerCase(detectSymbolValue)) {
            System.out.println("Это маленькая буква " + detectSymbolValue);
        } else if (Character.isUpperCase(detectSymbolValue)){
            System.out.println("Это большая буква " + detectSymbolValue);
        } else {
            System.out.println("Это символ не относящийся к искомому диапазону  " + detectSymbolValue);
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        double summDdeposit = 300000D;

        if (summDdeposit < 100000){
            System.out.println("Сумма вклада равна: " + summDdeposit);
            System.out.println("Начисленный процент: " + ((summDdeposit*1.05)-summDdeposit));
            System.out.println("Итоговая сумма: " + (summDdeposit*1.05));

        }else if (summDdeposit >= 100000 || summDdeposit<=300000) {
            System.out.println("Сумма вклада равна: " + summDdeposit);
            System.out.println("Начисленный процент: " + ((summDdeposit*1.07)-summDdeposit));
            System.out.println("Итоговая сумма: " + (summDdeposit*1.07));
            
        } else {
            System.out.println("Сумма вклада равна: " + summDdeposit);
            System.out.println("Начисленный процент: " + ((summDdeposit*1.1)-summDdeposit));
            System.out.println("Итоговая сумма: " + (summDdeposit*1.1));

        }
        System.out.println("\n7. Определение оценки по предметам");


    }

}
