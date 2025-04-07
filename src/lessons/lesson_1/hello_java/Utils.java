package lesson_1.hello_java;

import java.util.Random;

public class Utils {
    private static final Random rand = new Random();

    public static void fill(int[] arr, int from, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = from + rand.nextInt(to - from);
        }
    }

    public static void show(int[] arr) {
        // forech - "умный" цикл for для обхода объектов
        for (int elem : arr) {
            System.out.printf("%8d", elem);
        }
        System.out.println("");
    }

}
