package pro.sky.java.course1.lesson12;

public class Author {
    private String nameFirst;
    private String nameSecond;
    private String fullName;

    public Author(String nameFirst, String nameSecond) {
        this.nameFirst = nameFirst;
        this.nameSecond = nameSecond;
    }
    public String getNameFirst(){
        return this.nameFirst;
    }
    public String getNameSecond(){
        return this.nameSecond;
    }

    public void setNameFirst(String nameFirst){
        this.nameFirst = nameFirst;

    }
    public void setNameSecond(String nameSecond){
        this.nameSecond = nameSecond;
    }

    public String toString() {
        return  this.nameFirst + " " + this.nameSecond  + ";";

    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
        return false;
        }
        Author author2 = (Author) other;
        return nameFirst.equals(author2.nameFirst) && nameSecond.equals(author2.nameSecond) ;
    }

    @Override
    public int hashCode() {
        fullName = nameFirst + nameSecond;
        return java.util.Objects.hash(fullName);
    }
}

