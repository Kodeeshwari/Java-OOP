package portfolio.Composition;

public class Driver {
    String driverName;
    Vehicle vehicle;

    Driver(String name, Vehicle v) { // Parameterized constructor
        vehicle = v;
        this.driverName = name;
    }
}
