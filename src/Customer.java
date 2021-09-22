import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private Address address;
    private int id;
    private ArrayList<Book> borrowedBooks;

    public Customer(String firstName, String lastName, Address address, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public ArrayList<Book> getBorrowedBooks() {
        return this.borrowedBooks;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return this.id;
    }

    public void addBorrowedBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public void removeBorrowedBook(int bookID) {
        int foundBookIndex = -1;
        for (int i = 0; i < this.borrowedBooks.size(); i++) {
            Book book = this.borrowedBooks.get(i);
            if (book.getId() == bookID) {
                foundBookIndex = i;
            }

        }
        if (foundBookIndex == -1) {
            System.out.println("customer doesn't borrowed this book");
        } else {
            this.borrowedBooks.remove(foundBookIndex);
        }
    }

    @Override
    public String toString() {
        return "ID =" + getId() + " firstName='" + getFirstName() + "'" + ", lastName='" + getLastName() + "'"
                + ", address='" + getAddress();
    }
}
