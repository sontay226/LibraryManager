package Entities;

public class RareBook extends  Book{
    private double borrowFee;
    public RareBook ( int id , int quantity , String name , String author , String genre , double borrowFee) {
        super(id , quantity , name , author , genre);
        if ( quantity > 10 ) { throw  new IllegalArgumentException("Rare Book quantity cannot greater than 10!"); }
        this.borrowFee =  borrowFee;
    }

    public double getBorrowFee() {
        return borrowFee;
    }

    public void setBorrowFee(double borrowFee) {
        this.borrowFee = borrowFee;
    }
    @Override
    public String toString() {
        return "RareBook{" +
               "id=" + getId() +
               ", name='" + getName() + '\'' +
               ", author='" + getAuthor() + '\'' +
               ", genre='" + getGenre() + '\'' +
               ", quantity=" + getQuantity() +
               ", borrowFee=" + borrowFee +
               '}';
    }
}
