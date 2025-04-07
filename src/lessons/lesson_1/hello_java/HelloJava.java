package lesson_1.hello_java;

import javax.swing.*;
import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
        // Обычный неформатный вывод.
        System.out.println("\033[34mПривет, \033[32mмир \033[31mJava!\033[30m");

        long x = 1_000_000_000L;
        double y = 3.14;
        // В утилитном классе Math содержаться не только константы. Так более точно определять.
        double pi = Math.PI;
        // В Java тип char 2х байтовый (16 бит) Unicode.
        char ch = '\u3698';
        /* String это объект и его экземпляры должны создаваться через конструктор,
         но так как строки создаются часто, то их создание упростили до такой записи. */
        String str = "Это строка текста";
        // Создание переменной без инициализации.
        int p;
        // Модификатор final создает константы.
        final double E = 2.71;
        // В утилитном классе Math содержаться не только константы, но и статические математические функции
        double alpha = Math.cos(pi);

        // Форматный вывод
        System.out.printf("Косинус угла alpha = %.15f\n", alpha);
        // Вывод значения переменных в консоль
        System.out.println(x);
        // Инициализация ранее объявленной переменной
        p = 543;
        System.out.printf("%f\n%c\n%s\n%d\n", y, ch, str, p);

        // Создание массивов. Все массивы только динамические!!!
        final int SIZE = 5;
        // Размер массива правильно задавать через константу!!!
        int[] arr = new int[SIZE];

        final int FROM = -50, TO = 50;

        // Свои методы в своем утилитном классе
        System.out.println("Исходный массив:");
        Utils.show(arr);
        System.out.println("Массив заполнен случ. значениями:");
        Utils.fill(arr, FROM, TO);
        Utils.show(arr);

        // Ввод данных от пользователя
        Scanner scan = new Scanner(System.in);

        // print в отличие от println не переводит на новую строку
        System.out.print("Введите целое число> ");
        p = scan.nextInt();
        scan.close();
        System.out.println("Вы ввели число " + p);

        // Создание диалогового окна
        p = Integer.parseInt(JOptionPane.showInputDialog("Введите целое число"));
        JOptionPane.showMessageDialog(null, "Введенное значение: " + p);
    }
}
