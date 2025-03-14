package Entities;

public class Book {
    private String name, author, genre;
    private int id, quantity;
    public Book () {}
    public Book( int Id  , String Name , String Author , String Genre, int Quantity) {
        this.id = Id;
        this.author = Author;
        this.name = Name;
        this.genre = Genre;
        this.quantity = Quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
