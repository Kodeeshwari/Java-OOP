package portfolio.AbstractionInterface;

class MyBook extends Book {

    // Parameterized constructor
    public MyBook(String name, String author, String price) {
        super(name, author, price); // Calling base class constructor
    }

    // Override the getDetails method of the Base Class
    public String getDetails() {
        return name + ", " + author + ", " + price;
    }

}