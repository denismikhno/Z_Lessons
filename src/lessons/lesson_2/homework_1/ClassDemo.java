package lesson_2.homework_1;

public class ClassDemo {

    public static void main(String[] args) {
//        Book book = new Book(1, "Утро", "Иванов. И.И","АСТ", 1963, 55, 1300, "мягкий");
//        System.out.println(book);

        Book[] books = new Book[] {
                new Book(1, "Утро", "Иванов. И.И.","АСТ", 1963, 55, 1300, "мягкий"),
                new Book(2, "День", "Петров П.П.", "АСТ", 1975, 365, 2100, "твердый"),
                new Book(3, "Вечер", "Иванов И.И.", "АСТ", 2018, 258, 654, "глянец")
        };

        System.out.println("Все книги:");
        Book.show(books);
        System.out.println("\n\nКниги по автору Иванову И.И. :");
        Book.showByAuthor(books, "Иванов");
    }
}
