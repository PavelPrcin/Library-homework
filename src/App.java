import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int option;
        boolean loadInput = true;

        while (loadInput) {
            System.out.println("1) Add new book to library \n2) add new customer \n"
                    + "3) change customer address \n4) list all books \n5) list all customers \n6) list avaliable books\n7) borrow book \n8) return book \n100) is over for program");
            System.out.print("Input: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.addCustomer();
                    break;
                case 3:
                    library.changeCustomerAddress();
                    break;
                case 4:
                    library.listAllBooks();
                    break;
                case 5:
                    library.listAllCustomers();
                    break;
                case 6:
                    library.listAllNonBorrowedBooks();
                    break;
                case 7:
                    library.borrowBook();
                    break;
                case 8:
                    library.returnBook();
                    break;
                case 100:
                    System.out.println("Ukoncil si program.");
                    loadInput = false;
                    break;
                default:
                    System.out.println("Vyberte si polozku z menu !!!");
            }

        }

    }
}
