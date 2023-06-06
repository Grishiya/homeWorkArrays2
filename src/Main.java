import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1.");
        int[] spendingDay = generateRandomArray();
        int spendingMonth = 0;
        for (int i = 0; i < spendingDay.length; i++) {
            spendingMonth = spendingMonth + spendingDay[i];
        }
        System.out.println("Сумма трат за месяц, составила - " + spendingMonth + " рублей.");
    }

    public static void task2() {

    }
}