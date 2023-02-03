package portfolio.Polymorphism;

class Circle extends Shape {

    private double radius;

    public Circle(double radius) { // Constructor
        this.radius = radius;
    }

    // Overridden Method the getArea() which returns the area of Circle

    public double getArea() {
        return (radius*radius) * 3.14;
    }

}
