package pro.sky.java.course1.lesson12;

public class Book {
    private String bookName;
    private Author authorName;
    int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear ) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.bookName;
    }
    public Author getAuthorName() {
        return this.authorName;
    }
    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setName(String bookName) {
        this.bookName = bookName;
    }
    public void setAuthorName(Author authorName) {
       this.authorName = authorName;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
