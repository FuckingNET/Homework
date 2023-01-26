import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int total = 0;
        double avg;
        for (int elem : arr) {
            total = total + elem;
        }
        avg = (double) total/arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", avg);
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = 200_000;
        int max = 100_000;
        for (int elem : arr) {
            if (elem < min) {
                min = elem;
            }
            if (elem > max) {
                max = elem;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int elem : arr) {
            total = total + elem;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}