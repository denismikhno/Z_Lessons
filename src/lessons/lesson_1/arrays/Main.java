package lesson_1.arrays;

/* Статический импорт в Java — это возможность импортировать статические элементы (поля и методы) из класса
и использовать их без указания имени класса. */
import static lesson_1.arrays.Utils.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Диапазон чисел, которыми заполняем массивы.
        final int FROM = -100, TO = 100;
        // Размер массива по умолчанию если не введено иное значение пользователем.
        int size = 20;

        // Запрашиваем размер массива у пользователя.
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива> ");
        size = input.nextInt();
        System.out.println();

        // Создаем массив. В Java массивы только динамические!!!
        int[] arr = new int[size];
        // Заполняем массив случайными значениями.
        fill(arr, FROM, TO);
        // Вывод массива в консоль.
        System.out.println("Исходный массив:");
        show(arr);

        System.out.println("\nРешение задач с массивами\n" +
                             "*************************\n");

        // Вывод четных элементов массива.
        System.out.println("Четные элементы массива:");
        showEven(arr);

        // Вывод нечетных элементов массива.
        System.out.println("Нечетные элементы массива:");
        showOdd(arr);

        // Вывод наибольшего элемента массива.
        int max = getMax(arr);
        System.out.printf("\nНаибольшее число в массиве: %d\n", max);

        // Вывод наименьшего элемента массива.
        int min = getMin(arr);
        System.out.printf("\nНаименьшее число в массиве: %d\n", min);

        // Вывод чисел массива, которые делятся на 3 или на 9.
        System.out.println("\nЧисла массива, которые делятся на 3 или на 9:");
        showElemsDivisionBy3Or9(arr);

        // Вывод чисел массива, которые делятся на 5 и на 7.
        System.out.println("\nЧисла массива, которые делятся на 5 и на 7:");
        showElemsDivisionBy5And7(arr);

        // Сортировка методом пузырька по убыванию модулей элементов.
        System.out.println("\nМассив отсортирован методом пузырька по убыванию модулей элементов:");
        sortBubbleDescAbs(arr);
        show(arr);

        System.out.println("\nКонец работы");
    }

}
