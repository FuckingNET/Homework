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

    public static void task1() {
        System.out.println("Задача 1");
        int a = 432532;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 65;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 2345;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 23526L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 235.6f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 23.647;
        System.out.println("Значение переменной f с типом double равно " + f);

    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        System.out.println("Значение переменной a с типом float равно " + a);
        long b = 987678965549L;
        System.out.println("Значение переменной b с типом long равно " + b);
        double c = 2.786;
        System.out.println("Значение переменной c с типом double равно " + c);
        short d = 569;
        System.out.println("Значение переменной d с типом short равно " + d);
        short e = -159;
        System.out.println("Значение переменной e с типом short равно " + e);
        int f = 27897;
        System.out.println("Значение переменной f с типом int равно " + f);
        byte g = 67;
        System.out.println("Значение переменной g с типом byte равно " + g);
    }

    public static void task3(){
        System.out.println("Задача 3");
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short allSheets = 480;
        int sheetOnPupil = allSheets / (firstClass + secondClass + thirdClass);
        System.out.println("На каждого ученика рассчитано " + sheetOnPupil + " листов бумаги");

    }

    public static void task4(){
        System.out.println("Задача 4");
        int minutes = 16 * 10;
        System.out.println("За 20 минут машина произвела " + minutes + " штук бутылок");
        int day = 1440 / 20 * minutes;
        System.out.println("За день машина произвела " + day + " штук бутылок");
        int threeDay = day * 3;
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        int month = threeDay * 10;
        System.out.println("За месяц машина произвела " + month + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int countPaint = 120;
        int whiteOnClass = 2;
        int brownOnClass = 4;
        int countClasses = countPaint / (whiteOnClass + brownOnClass);
        int countWhite = countClasses * whiteOnClass;
        int countBrown = countClasses * brownOnClass;
        System.out.println("В школе, где " + countClasses + " классов, нужно " + countWhite + " банок белой краски и " + countBrown + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int banana = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;

        int sumWeight = banana + milk + iceCream + eggs;
        float sumWeightKilo = sumWeight / 1000f;
        System.out.println(sumWeight + " грамм");
        System.out.println(sumWeightKilo + " килограмм");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int weight = 7;
        float firstDiet = weight / 0.25f;
        float secondDiet = weight / 0.5f;
        System.out.println("Если спортсмен будет терять 250 грамм в день, потребуется " + firstDiet + " дней");
        System.out.println("Если спортсмен будет терять 500 грамм в день, потребуется " + secondDiet + " дней");

    }

    public static void task8() {
        System.out.println("Задача 8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float percent = 0.1f;

        int salaryOfYearMasha = salaryMasha * 12;
        int salaryOfYearDenis = salaryDenis * 12;
        int salaryOfYearKristina = salaryKristina * 12;

        float newSalaryMasha = (salaryMasha * percent) + salaryMasha;
        float newSalaryDenis = (salaryDenis * percent) + salaryDenis;
        float newSalaryKristina = (salaryKristina * percent) + salaryKristina;

        float newSalaryOfYearMasha = newSalaryMasha * 12;
        float newSalaryOfYearDenis = newSalaryDenis * 12;
        float newSalaryOfYearKristina = newSalaryKristina * 12;

        float differenceMasha = newSalaryOfYearMasha - salaryOfYearMasha;
        float differenceDenis = newSalaryOfYearDenis - salaryOfYearDenis;
        float differenceKristina = newSalaryOfYearKristina - salaryOfYearKristina;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");
    }
}