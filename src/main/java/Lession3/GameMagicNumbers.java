package Lession3;

public class GameMagicNumbers {
    public static void main(String[] args) {
        // берем 100/2 =50  50/2=25 (50-25 или 20+25) (25/2=12)(75-12)
        int targetNumber = 76;
        int mid = 0;
        int left = 1;
        int right = 100;

        while (targetNumber != mid) {
            mid = left + (right - left) / 2;
            if (mid > targetNumber) {
                right = mid - 1;
                System.out.println("Число " + mid + " больше того, что загадал компьютер");
            } else {
                left = mid + 1;
                System.out.println("Число " + mid + " меньше того, что загадал компьютер");;
            }
        } System.out.println("Вы победили! Искомое число: " + mid );

    }
}
