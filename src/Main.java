public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task8() {
        System.out.println("Задача 8");
        int now = 2023;
        int past = now - 200;
        int future = now + 100;

        for (int i = past; i < future; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void task7() {
        System.out.println("Задача 7");
        int friday = 2;
        int day = 0;
        System.out.println("Сегодня пятница, "+ friday +"-е число. Необходимо подготовить отчет");
        while (day <= 31) {
            if (friday == day - 7) {
                friday = day;
                System.out.println("Сегодня пятница, "+ friday +"-е число. Необходимо подготовить отчет");
            }
            day++;
        }
    }

    private static void task6() {
        System.out.println("Задача 6");
        double percent = 0.07;
        int countMonth = 0;
        double total = 15000;
        while (countMonth < 1092) {
            total = total + (total * percent);
            countMonth++;
            if (countMonth % 6 == 0) {
                System.out.println("Месяц: " + countMonth);
                System.out.printf("Накоплений: %f%n", total);
            }
        }
    }

    private static void task5() {
        System.out.println("Задача 5");
        double percent = 0.07;
        int countMonth = 0;
        double total = 15000;
        while (total <= 12_000_000) {
            total = total + (total * percent);
            countMonth++;
            if (countMonth % 6 == 0) {
                System.out.println("Месяц: " + countMonth);
                System.out.printf("Накоплений: %f%n", total);
            }
        }
    }

    private static void task4() {
        System.out.println("Задача 4");
        double percent = 0.07;
        int countMonth = 0;
        double total = 15000;
        while (total <= 12_000_000) {
            total = total + (total * percent);
            countMonth++;
            System.out.println("Месяц: " + countMonth);
            System.out.printf("Накоплений: %f%n", total);
        }
    }

    private static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int mortalityRate = 8;
        int birthRate = 17;
        for (int i = 0; i < 11; i++) {
            int delta = (int)(population * (birthRate/(double) 1000) - population * (mortalityRate/(double) 1000));
            population = population + delta;
            System.out.println("Год " + i + ", чиисленность населения составляет " + population);
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    private static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int countMonth = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            countMonth++;
            System.out.println("Месяц " + countMonth + " сумма накоплений равна " + total + " рублей");
        }
    }
}