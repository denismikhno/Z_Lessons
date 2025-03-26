package lesson_1.arrays;

import java.util.Random;
import static java.lang.Math.abs;

public class Utils {
    // Экземпляр rand имеет модификатор static, т.к он будет использоваться в static методах.
    private static final Random rand = new Random();

    /* Здесь пример перегрузки методов random, fill и show. */
    // -------------------------------------------------------------------------------
    // Получаем случайное целое число.
    public static int random(int from, int to) {
        return from + rand.nextInt(to - from);
    }

    // Получаем случайное вещественное число.
    public static double random(double from, double to) {
        return from + rand.nextDouble(to - from);
    }

    // Заполняем массив случайными целыми значениями.
    public static void fill(int[] arr, int from, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random(from, to);
        }
    }

    // Заполняем массив случайными вещественными значениями.
    public static void fill(double[] arr, int from, int to) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random(from, to);
        }
    }

    // Вывод массива целых чисел в консоль по 20 элементов в строку.
    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%6d", arr[i]);
            // Если элементов в массиве больше 20, переносим их вывод на новую строку.
            if ((i + 1) % 20 == 0) {
                System.out.println("");
            }
        }
        // Отделяем пустой строкой вывод массива от последующих выводов.
        System.out.println("");
    }

    // Вывод массива вещественных чисел в консоль по 15 элементов в строку.
    public static void show(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%8.2f", arr[i]);
            // Если элементов в массиве больше 15, переносим их вывод на новую строку.
            if((i + 1) % 15 == 0) {
                System.out.println("");
            }
        }
        // Отделяем пустой строкой вывод массива от последующих выводов.
        System.out.println("");
    }
    //--------------------------------------------------------------------------------

    /* Решения задач с массивами. */

    // Вывод четных элементов массива.
    public static void showEven(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Число четно если делиться на 2 без остатка.
            if (arr[i] % 2 == 0) {
                System.out.printf("%6d", arr[i]);
            }
        }
        System.out.println();
    }

    // Вывод нечетных элементов массива.
    public static void showOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Число нечетно если не делиться на 2 без остатка.
            if (arr[i] % 2 != 0) {
                System.out.printf("%6d", arr[i]);
            }
        }
        System.out.println();
    }

    // Определяем наибольшее число в массиве.
    public static int getMax(int[] arr) {
        // Способ 1.
        //------------------------------------------
        // Предположим что в max у нас минимально возможное число типа int.
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

        // Способ 2.
        //------------------------------------------
//        int indexMax = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > arr[indexMax]) {
//                indexMax = i;
//            }
//        }
//        return arr[indexMax];

    }

    // Определяем наименьшее число в массиве.
    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    // Показать числа, которые делятся на 3 или на 9.
    public static void showElemsDivisionBy3Or9(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 3 == 0 || arr[i] % 9 == 0) && arr[i] != 0) {
                System.out.printf("%6d", arr[i]);
            }
        }
        System.out.println();
    }

    // Показать числа, которые делятся на 5 и на 7.
    public static void showElemsDivisionBy5And7(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 7 == 0 && arr[i] != 0) {
                System.out.printf("%6d", arr[i]);
            }
        }
        System.out.println();
    }

    // Сортировка методом пузырька по убыванию модулей элементов.
    public static void sortBubbleDescAbs(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (abs(arr[j]) < abs(arr[j + 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
