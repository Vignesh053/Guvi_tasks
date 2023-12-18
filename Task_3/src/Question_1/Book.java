package Question_1;

public class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable = false;


    public Book(int bookID, String title, String author, boolean isAvailable){

        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;

    }

    public int getBookID(){
        return this.bookID;
    }

    public void setBookID(int bookID){
        this.bookID = bookID;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTilte(String title){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public boolean getIsAvailable(){
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }


}
