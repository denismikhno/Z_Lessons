package lesson_2.matrix;

import java.util.Random;

public class Utils {
    // Поле типа Random для получения случайных чисел
    private static final Random rand = new Random();

    // Получаем случайное число
    public static int random(int from, int to) {
        return from + rand.nextInt(to - from);
    }

    // Заполняем матрицу случ. целыми значениями
    public static void fill(int[][] matrix, int from, int to) {
        // Получаем количество столбцов в матрице
        int cols = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random(from, to);
            }
        }
    }

    // Вывод матрицы целых чисел в консоль
    public static void show(int[][] matrix) {
        int cols = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%6d", matrix[i][j]);
            }
            System.out.println("");
        }
    }

    /* 1. Построить матрицу, вычитая из элементов каждой строки матрицы
          её среднее арифметическое */
    public static void task1(int[][] matrix) {
        int cols = matrix[0].length;

        int avg;

        for (int i = 0; i < matrix.length; i++) {
            avg = 0;
            for (int j = 0; j < cols; j++) {
                avg += matrix[i][j];
            }

            avg /= cols;
            System.out.printf("Среднее арифметическое строки %d - %3d\n", i, avg);

            for (int j = 0; j < cols; j++) {
                matrix[i][j] -= avg;
            }

        }


    }

    /* 2. Преобразовать строки матрицы таким образом, чтобы элементы, равные
          нулю, распологались после всех остальных */
    public static void task2(int[][] matrix) {
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                for (int j = 0; j < row.length - i - 1; j++) {
                    if (row[j] == 0) {
                        int temp = row[j];
                        row[j] = row[j + 1];
                        row[j + 1] = temp;
                    }
                }
            }
        }
    }

    /* 3. Найти количество всех седловых точек матрицы.
    (Матрица А имеет седловую точку Аi,j, если Аi,j является минимальным элементом в i-й строке
    и максимальным в j-м столбце) */
    public static int task3(int[][] matrix) {
        int saddlePoint = 0;
        int cols = matrix[0].length;
        int[] maxElemsInCols = getMaxElemsInMatrixCols(matrix);

        for (int i = 0; i < matrix.length; i++) {
            int min = getMin(matrix[i]);
            for (int j = 0; j < cols; j++) {
                if (maxElemsInCols[j] == min) {
                    saddlePoint++;
                }
            }
        }

        return saddlePoint;
    }

    // Получаем массив наибольших элементов в столбцах матрицы
    public static int[] getMaxElemsInMatrixCols(int[][] matrix) {
        int cols = matrix[0].length;
        int[] temp = new int[cols];

        for (int i = 0; i < cols; i++) {
            temp[i] = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > temp[i]) {
                    temp[i] = matrix[j][i];
                }
            }
        }

        return temp;
    }

    // Получаем наименьшее число массива
    public static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    // Вывод массива целых чисел в консоль по 20 элементов в строку
    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%6d", arr[i]);
            if ((i + 1) % 20 == 0) {
                System.out.println("");
            }
            System.out.println("");
        }
    }

}
