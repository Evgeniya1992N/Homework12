import pro.sky.java.course1.lesson12.Author;
import pro.sky.java.course1.lesson12.Book;

public class Main {
    public static void main(String[] args) {

        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и Мир", levTolstoy, 1867);
        System.out.println("warAndPeace = " + warAndPeace);
        Author fedorDostoevsiy = new Author("Федор", "Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", fedorDostoevsiy, 1866);
        System.out.println("crimeAndPunishment = " + crimeAndPunishment);
    }
}