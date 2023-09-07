package pro.sky.java.course1.lesson12;

public class Author {
    private String nameFirst;
    private String nameSecond;

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

}
