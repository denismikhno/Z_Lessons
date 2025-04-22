package lesson_2.homework_1;

public class ClassDemo {

    public static void main(String[] args) {
//        Book book = new Book(1, "Утро", "Иванов. И.И","АСТ", 1963, 55, 1300, "мягкий");
//        System.out.println(book);

        Book[] books = new Book[] {
                new Book(1, "Утро", "Иванов. И.И.","АСТ", 1963, 55, 1300, "мягкий"),
                new Book(2, "День", "Петров П.П.", "АСТ", 1975, 365, 2100, "твердый"),
                new Book(3, "Вечер", "Иванов И.И.", "АСТ", 2018, 258, 654, "глянец"),
                new Book(4, "Полночь", "Сидоров А.А.", "ЭКСМО", 2002, 182, 1, "мягкий")
        };

        System.out.println("Все книги:");
        Book.show(books);

        String author = "Иванов";
        System.out.println("\nКниги автора " + author + " :");
        Book.showByAuthor(books, author);

        // цена книги в рублях-копейках по id книги
        System.out.println(Book.toRubKop(books, 4));
        System.out.println(Book.toRubKop(books, 3));
        System.out.println(Book.toRubKop(books, 2));
    }
}
