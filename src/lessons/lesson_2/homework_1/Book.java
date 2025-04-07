package lesson_2.homework_1;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publish;
    private int year;
    private int pages;
    private int price;
    private String cover;

    public Book() {}

    public Book(int id, String name, String author, String publish, int year, int pages, int price, String cover) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.cover = cover;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static void show(Book... books) {
        Book.header();
        for (Book book : books) {
            System.out.print("+");
            System.out.println(book + "  +");
            Book.footer();
        }
    }

    public static void showByAuthor(Book[] books, String author) {
        Book.header();
        for (Book book : books) {
            if (book.getAuthor().contains(author)) {
                System.out.print("+");
                System.out.println(book + "  +");
                Book.footer();
            }
        }
    }

    public static void header() {
        System.out.println("+----+--------------------+------------------+---------+----------+------+--------+----------+");
    }

    public static void footer() {
        System.out.println("+----+--------------------+------------------+---------+----------+------+--------+----------+");
    }

    // Переводим цену книги с заданным id из копеек в рубли-копейки
    public static String toRubKop(Book[] books, int id) {
        int price = books[id - 1].getPrice();
        if (price > 9) {
            return "\nЦена книги с id " + id + " в рублях " + price / 100 + "," + price % 100 + " руб.";
        } else {
            return "\nЦена книги с id " + id + " в рублях " + price / 100 + "," + 0 + price % 100 + " руб.";
        }

    }

    @Override
    public String toString() {
        return String.format("%4d%20s%20s%10s%10d%8d%8d%10s", id, name, author, publish, year, pages, price, cover);
    }
}
