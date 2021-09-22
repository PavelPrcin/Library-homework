import java.util.Date;

public class BorrowingItem {
    private Book book;
    private Customer customer;
    private Date dateOfBorrow;
    private Date dateOfReturn;

    public BorrowingItem(Book book, Customer customer, Date dateOfBorrow, Date dateOfReturn) {
        this.book = book;
        this.customer = customer;
        this.dateOfBorrow = dateOfBorrow;
        this.dateOfReturn = dateOfReturn;
    }

}
