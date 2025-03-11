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
            System.out.println("Ваше имя не начинается на М и I");
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

        if ((equalsFirstNumber / 100 != equalsSecondNumber / 100)
                && (equalsFirstNumber / 10 != equalsSecondNumber / 10)
                && (equalsFirstNumber % 10 != equalsSecondNumber % 10)) {
            System.out.println("Число " + equalsFirstNumber + " и число "
                    + equalsSecondNumber + " не имеют общих цифр");
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
        } else if (Character.isUpperCase(detectSymbolValue)) {
            System.out.println("Это большая буква " + detectSymbolValue);
        } else {
            System.out.println("Это символ не относящийся к искомому диапазону  " + detectSymbolValue);
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");

        double summDdeposit = 300000D;

        if (summDdeposit < 100000) {
            System.out.println("Сумма вклада равна: " + summDdeposit);
            System.out.println("Начисленный процент: " + ((summDdeposit * 1.05) - summDdeposit));
            System.out.println("Итоговая сумма: " + (summDdeposit * 1.05));

        } else if (summDdeposit >= 100000 || summDdeposit <= 300000) {
            System.out.println("Сумма вклада равна: " + summDdeposit);
            System.out.println("Начисленный процент: " + ((summDdeposit * 1.07) - summDdeposit));
            System.out.println("Итоговая сумма: " + (summDdeposit * 1.07));

        } else {
            System.out.println("Сумма вклада равна: " + summDdeposit);
            System.out.println("Начисленный процент: " + ((summDdeposit * 1.1) - summDdeposit));
            System.out.println("Итоговая сумма: " + (summDdeposit * 1.1));

        }
        System.out.println("\n7. Определение оценки по предметам");

        int assessmentHistoryProcent = 59;
        int assessmentProgrammingProcent = 91;
        int assessmentHistory = 0;
        int assessmentProgramming = 0;

        if (assessmentHistoryProcent <= 60) {
            assessmentHistory = 2;
        } else if (assessmentHistoryProcent > 60 && assessmentHistoryProcent <= 73) {
            assessmentHistory = 3;
        } else if (assessmentHistoryProcent > 73 && assessmentHistoryProcent <= 91) {
            assessmentHistory = 4;
        } else if (assessmentHistoryProcent > 91) {
            assessmentHistory = 5;
        }
        if (assessmentProgrammingProcent <= 60) {
            assessmentProgramming = 2;
        } else if (assessmentProgrammingProcent > 60 && assessmentProgrammingProcent <= 73) {
            assessmentProgramming = 3;
        } else if (assessmentProgrammingProcent > 73 && assessmentProgrammingProcent <= 91) {
            assessmentProgramming = 4;
        } else if (assessmentProgrammingProcent > 91) {
            assessmentProgramming = 5;
        }
        int averageScore = (assessmentHistory + assessmentProgramming) / 2;
        int avarageProcent = (assessmentProgrammingProcent + assessmentHistoryProcent) / 2;

        System.out.println("Оценка за предмет История: " + assessmentHistory);
        System.out.println("Оценка за предмет Программирование: " + assessmentProgramming);
        System.out.println("Средний балл по оценкам: " + averageScore);
        System.out.println("Средний процент по предметам: " + avarageProcent);


        System.out.println("\n8. Расчет прибыли за год");

        int rentRoom = 5000;
        int productSaleMonth = 14000;
        int productCost = 9000;

        int profitYear = productSaleMonth - productCost - rentRoom;
        if (profitYear < 0) {
            System.out.println("Прибыль за год составляет: " + profitYear);
        } else if (profitYear == 0) {
            System.out.println("Прибыль за год составляет: " + profitYear);
        } else {
            System.out.println("Прибыль за год составляет: +" + profitYear);
        }

        System.out.println("\n9. Подсчет количества банкнот");

        int needRemoveCash = 567;
        int cash100 = 10;
        int cash10 = 5;
        int cash1 = 50;
        int allCashIn = cash100 * 100 + cash10 * 10 + cash1;
        System.out.println("Необходимо выдать сумму в размере: " + needRemoveCash);
        if (needRemoveCash <= allCashIn) {
            int needCash100 = (needRemoveCash / 100);
            int needCash10 = (needRemoveCash % 100) / 10;
            int needCash1 = (needRemoveCash % 100) % 10;
            if (needCash100 <= cash100) {
                System.out.println("Необходимо выдать банкноты номиналом в 100 колличество: " + needCash100);
            } else {
                System.out.println("Необходимо выдать банкноты номиналом в 10 колличество: " + cash100);
                needCash10 += (needCash100 - cash100) * 10;
            }
            if (needCash10 < cash10) {
                System.out.println("Необходимо выдать банкноты номиналом в 10 колличество: " + needCash10);
            } else {
                System.out.println("Необходимо выдать банкноты номиналом в 10 колличество: " + cash10);
                needCash1 += (needCash10 - cash10) * 10;
            }
            if (needCash1 <= cash1) {
                System.out.println("Необходимо выдать банкноты номиналом в 1 колличество: " + needCash1);
            } else {
                System.out.println("Не возможно выдать остальное");
            }
        } else {
            System.out.println("Такой суммы нет в банкомате");
        }


    }

}
