public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 24;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int temp = 10;
        if (temp >= 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 42;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 14;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 9;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (age > 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в без сопровождении взрослого");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int allPlaces = 102;
        int sitPlaces = 60;
        int ticket = 27;

        if (ticket > sitPlaces && ticket <= allPlaces) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (ticket <= sitPlaces) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (ticket > allPlaces){
            System.out.println("В вагоне нет мест");
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two){
            if (two > three) {
                System.out.println(one);
            } else {
                if (one > three) {
                    System.out.println(one);
                } else {
                    System.out.println(three);
                }
            }
        } else {
            if (one > three) {
                System.out.println(two);
            } else {
                if (two > three) {
                    System.out.println(two);
                } else {
                    System.out.println(three);
                }
            }
        }

    }
}