package portfolio.Polymorphism;

// Base Class
public class Shape {

    // Private Data Members
    private String name;
    private double area;

    public Shape() { // Default Constructor
        name = "Shape";
        area = 0;
    }

    // Getter Function
    public String getName() {
        return name;
    }
    public double getArea() {
        return area;
    }

}

