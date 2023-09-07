package pro.sky.java.course1.lesson12;

public class Book {
    private String name;
    private Author author;
    private int publishingYear;

    private String fullInfo;

    public Book(String name, Author author, int publishingYear ) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }
    public Author getAuthor() {
        return this.author;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setName(String bookName) {
        this.name = bookName;
    }
    public void setAuthor(Author author) {
       this.author = author;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return "Имя: " + this.name + "; Автор: " + author.toString() + " Год издания: " + this.publishingYear;

    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book2 = (Book) other;
        return name.equals(book2.name) && author.equals(book2.author) ;
    }

    public int hashCode() {
        fullInfo = name + author.toString() + publishingYear;
        return java.util.Objects.hash(fullInfo);
    }

}
