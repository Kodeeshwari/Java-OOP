package portfolio.AbstractionInterface;

abstract class Book {

    // Protected fields
    protected String name;
    protected String author;
    protected String price;

    // Parameterized Constructor
    public Book(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Abstract method
    public abstract String getDetails();

}
