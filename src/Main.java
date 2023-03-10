import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        String text = "Расскажите про покупки, " +
                "Про какие про покупки? " +
                "Про покупки, про покупки, " +
                "Про покупочки мои.";
        text = text.replaceAll("[.?,]", "");
        List<String> strings = List.of(text.split(" "));
        Map<String, Integer> countStr = new HashMap<>();
        for (String s : strings) {
            if (countStr.get(s) == null) {
                countStr.put(s, 1);
            } else {
                countStr.put(s, countStr.get(s) + 1);
            }
        }
        System.out.println(countStr);
    }

    private static void task3() {
        System.out.println("Задача 3");
        String text = "Расскажите про покупки, " +
                "Про какие про покупки? " +
                "Про покупки, про покупки, " +
                "Про покупочки мои.";
        text = text.replaceAll("[.?,]", "");
        Set<String> strings = new HashSet<>(List.of(text.split(" ")));
        System.out.println(strings);
    }

    private static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> numsResult = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                numsResult.add(num);
            }
        }
        System.out.println(numsResult);
    }

    private static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}