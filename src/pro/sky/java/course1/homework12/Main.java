package pro.sky.java.course1.homework12;

public class Main {
    public static void main(String[] args) {
        Author dostaevsky = new Author("Фёдор", "Достаевский");
        Author pushkin = new Author("Александр", "Пушкин");

        Book book1 = new Book("Идиот", dostaevsky, 1867);
        Book book2 = new Book("Евгений Онегин", pushkin, 1833);

        book1.setYear(1868);

    }
}