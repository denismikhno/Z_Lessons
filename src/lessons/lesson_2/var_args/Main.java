package lesson_2.var_args;

public class Main {
    // Как работать с переменным количество простых типов
    private static int getSumma(int... args) {
        int summa = 0;

        for (int i = 0; i < args.length; i++) {
            summa += args[i];
        }

        return summa;
    }

    // Как работать с переменным количество объектных типов
    private static String totalString(String... strs) {
        String result = "";

        for (String str : strs) {
            result += str + " ";
        }
        // Обрезаем пробел в конце строки. Попробуй без trim()!
        return result.trim() + "!";
    }

    public static void main(String[] args) {
        int summa = getSumma(5, 5, 5);
        System.out.printf("Сумма = %d\n", summa);
        summa = getSumma(5, 5, 5, 2, 3);
        System.out.printf("Сумма = %d\n", summa);

        String str1 = "Мама";
        String str2 = "мыла";
        String str3 = "раму";

        String str = totalString(str1, str2, str3);
        System.out.println(str);
    }
}
