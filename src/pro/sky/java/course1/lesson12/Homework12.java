package pro.sky.java.course1.lesson12;

public class Homework12 {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и Мир", levTolstoy, 1867);
        System.out.println("warAndPeace = " + warAndPeace.getName());
        Author fedorDostoevsiy = new Author("Федор", "Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", fedorDostoevsiy, 1866);
        System.out.println("crimeAndPunishment = " + crimeAndPunishment.getName());
        crimeAndPunishment.setPublishingYear(2000);
        System.out.println("crimeAndPunishment = " + crimeAndPunishment.getPublishingYear());

    }
}
