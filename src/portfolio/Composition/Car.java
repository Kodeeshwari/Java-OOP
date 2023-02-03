package portfolio.Composition;

public class Car {
    // Declaring data members and methods
    private int id;
    private String model;
    private String color;

    public void carFeatures() { // Function to print out car features
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
