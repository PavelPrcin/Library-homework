public class Book {
    private String name;
    private String author;
    private int numberOfPages;
    private boolean isBorrowed;
    private int id;

    public Book(String name, String author, int numberOfPages, int id) {
        this.name = name;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.isBorrowed = false;
        this.id = id;
    }

    public boolean getIsBorrowed() {
        return this.isBorrowed;
    }

    public int getId() {
        return this.id;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", author='" + getAuthor() + "'" + ", numberOfPages='"
                + getNumberOfPages() + "'" + "}";
    }

}
