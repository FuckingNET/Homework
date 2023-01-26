import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task4() {
        System.out.println("Задача 4");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 != 0) {
                arr1[i]++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {1, 2, 3, 4, 5};

        for (int i = arr1.length-1; i >= 0; i--) {
            if(arr1[i] == arr1[0]){
                System.out.println(arr1[i]);
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }

        for (int i = arr2.length-1; i >= 0; i--) {
            if(arr2[i] == arr2[0]){
                System.out.println(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }

        for (int i = arr3.length-1; i >= 0; i--) {
            if(arr3[i] == arr3[0]){
                System.out.println(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == arr1.length){
                System.out.println(arr1[i]);
            } else {
                System.out.print(arr1[i] + ", ");
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] == arr2[arr2.length-1]){
                System.out.println(arr2[i]);
            } else {
                System.out.print(arr2[i] + ", ");
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i] == arr3[arr3.length-1]){
                System.out.println(arr3[i]);
            } else {
                System.out.print(arr3[i] + ", ");
            }
        }
    }

    private static void task1() {
        System.out.println("Задача 1");
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        double[] arr2 = {1.57, 7.654, 9.986};
        int[] arr3 = {1, 2, 3, 4, 5};
    }
}