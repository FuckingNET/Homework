public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        System.out.println(timeDelivery(deliveryDistance));
    }

    private static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2018;
        int os = 1;
        versionApp(os, clientDeviceYear);
    }

    private static void task1() {
        System.out.println("Задача 1");
        int year = 2023;
        isLeapYear(year);
    }

    private static int timeDelivery(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        return deliveryDays;
    }

    public static void versionApp(int os, int releaseDate) {
        if (os == 1) {
            if (releaseDate < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (releaseDate < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}