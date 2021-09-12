public class ScientificBook extends Book {
    private String scientificField;

    public ScientificBook(String name, String author, int numberOfPages, String scientificField, int id) {
        super(name, author, numberOfPages, id);
        this.scientificField = scientificField;
    }

    public String getScientificField() {
        return this.scientificField;
    }

    public void setScientificField(String scientificField) {
        this.scientificField = scientificField;
    }
}
