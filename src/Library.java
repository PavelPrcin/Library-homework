import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Customer> customers;

    Scanner sc = new Scanner(System.in);

    public Library() {
        this.books = new ArrayList<Book>();
        this.books.add(new Book("LOTR1", "Tolkien", 350, 0));
        this.books.add(new Book("LOTR2", "Tolkien", 360, 1));
        this.books.add(new Book("LOTR3", "Tolkien", 390, 2));
        this.books.add(new Book("HP1", "Rowling", 390, 3));
        this.customers = new ArrayList<Customer>();
        this.customers.add(new Customer("John", "Dou", new Address("25ali", "5ave", "NY", "USA"), 0));
    }

    public void addBook() {
        System.out.print("name of book : ");
        String name = sc.next();
        System.out.print("author of book : ");
        String author = sc.next();
        System.out.print("number of pages : ");
        int numberOfPages = sc.nextInt();
        Book book = new Book(name, author, numberOfPages, this.books.size());
        this.books.add(book);
        System.out.println("Book was added : ");
    }

    public Address createAddress() {
        System.out.print("streetName of customer : ");
        String streetName = sc.next();
        System.out.print("streetNumber of customer : ");
        String streetNumber = sc.next();
        System.out.print("city of customer : ");
        String city = sc.next();
        System.out.print("country of customer : ");
        String country = sc.next();
        Address address = new Address(streetName, streetNumber, city, country);
        return address;
    }

    public void addCustomer() {
        Address address = createAddress();
        System.out.print("first-name of customer : ");
        String firstName = sc.next();
        System.out.print("last-name of customer : ");
        String lastName = sc.next();
        Customer customer = new Customer(firstName, lastName, address, this.customers.size());
        this.customers.add(customer);
        System.out.println("Customer was made : ");
    }

    public void listAllCustomers() {
        System.out.println(this.customers);
    }

    public void changeCustomerAddress() {
        listAllCustomers();
        System.out.print("ID of customer : ");
        int ID = sc.nextInt();
        Customer customer = this.customers.get(ID);
        Address address = createAddress();
        customer.setAddress(address);
    }

    public void listAllBooks() {
        System.out.println(this.books);
    }

    public void listAllNonBorrowedBooks() {
        for (int i = 0; i < this.books.size(); i++) {
            Book book = this.books.get(i);
            if (!book.getIsBorrowed()) {
                System.out.println(book);
            }
        }
    }

    public void borrowBook() {
        System.out.print("ID of customer : ");
        int customerID = sc.nextInt();
        System.out.print("ID of book : ");
        int bookID = sc.nextInt();
        Customer foundCustomer = null;
        Book foundBook = null;

        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getId() == customerID) {
                foundCustomer = customer;
            }
        }
        if (foundCustomer == null) {
            System.out.println("customer not found");
            return;
        }
        for (int i = 0; i < this.books.size(); i++) {
            Book book = this.books.get(i);
            if (book.getId() == bookID) {
                foundBook = book;
            }
        }
        if (foundBook == null) {
            System.out.println("book not found");
            return;
        }
        if (foundBook.getIsBorrowed()) {
            System.out.println("Book is already borrowed");
            return;
        }
        if (foundCustomer.getBorrowedBooks().size() == 3) {
            System.out.println("customer has already 3 borrowed books");
        }
        foundCustomer.addBorrowedBook(foundBook);
        foundBook.setIsBorrowed(true);
    }

    public void returnBook() {
        System.out.print("ID of customer : ");
        int customerID = sc.nextInt();
        System.out.print("ID of book : ");
        int bookID = sc.nextInt();
        Customer foundCustomer = null;
        Book foundBook = null;

        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getId() == customerID) {
                foundCustomer = customer;
            }
        }
        if (foundCustomer == null) {
            System.out.println("customer not found");
            return;
        }
        for (int i = 0; i < this.books.size(); i++) {
            Book book = this.books.get(i);
            if (book.getId() == bookID) {
                foundBook = book;
            }
        }
        if (foundBook == null) {
            System.out.println("book not found");
            return;
        }

        foundCustomer.removeBorrowedBook(foundBook.getId());
        foundBook.setIsBorrowed(false);
    }

}
