package pro.sky.java.course1.lesson12;

public class Homework12 {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author levTolstoy2 = new Author("Лев", "Толстой");
        // Book warAndPeace = new Book("Война и Мир", levTolstoy, 1867);
       // System.out.println("warAndPeace = " + warAndPeace.getName());
        //Task 1 HW 13 toString():
        System.out.println("levTolstoy = " + levTolstoy);
        System.out.println("levTolstoy2 = " + levTolstoy2);
        //Task 2 HW 13 equals():
        System.out.println(levTolstoy.equals(levTolstoy2));
        //Task 3 HW 13 hashCode():
        if (levTolstoy.hashCode() == levTolstoy2.hashCode()) {
        System.out.println("identical");
        } else {
            System.out.println("different");
        }

        Author fedorDostoevsiy = new Author("Федор", "Достоевский");
        Book crimeAndPunishment = new Book("Преступление и наказание", fedorDostoevsiy, 1866);
        Book crimeAndPunishment2 = new Book("Преступление и наказание", fedorDostoevsiy, 1866);
        //  System.out.println("crimeAndPunishment = " + crimeAndPunishment.getName());
      //  crimeAndPunishment.setPublishingYear(2000);
      //  System.out.println("crimeAndPunishment = " + crimeAndPunishment.getPublishingYear());
        //Task 1 HW 13 toString():
        System.out.println("crimeAndPunishment = " + crimeAndPunishment);
        System.out.println("crimeAndPunishment2 = " + crimeAndPunishment2);
        //Task 2 HW 13 equals():
        System.out.println(crimeAndPunishment.equals(crimeAndPunishment2));
        //Task 3 HW 13 hashCode():
        if (crimeAndPunishment.hashCode() == crimeAndPunishment2.hashCode()) {
            System.out.println("identical");
        } else {
            System.out.println("different");
        }


    }
}
