public class ForeignBook extends Book {
    private String language;

    public ForeignBook(String name, String author, int numberOfPages, String language, int id) {
        super(name, author, numberOfPages, id);
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
