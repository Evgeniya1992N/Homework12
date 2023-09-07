package pro.sky.java.course1.lesson12;

public class Book {
    private String name;
    private Author author;
    private int publishingYear;

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
}
