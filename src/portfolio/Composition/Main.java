package portfolio.Composition;

public class Main {
    public static void main(String args[]) {
        // Creating a Vehicle object with model: "Volvo S60", and id: "4453"
        Vehicle vehicle = new Vehicle("Volvo S60", 4453);

        // Creating a Driver object having name: "John" and passing the
        // vehicle in its constructor
        Driver driver = new Driver("John", vehicle);
        System.out.println(driver.driverName +
                " is a driver of car Id: " + driver.vehicle.id);


        // Declaring and initializing Toyota object
        Toyota t = new Toyota();
        t.setModel("Fortuner");
        t.setColor("Silver");

        t.carFeatures();
        t.setStart();
    }
}

