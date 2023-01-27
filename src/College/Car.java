package College;

public class Car {
    // Private Fields
    private String carName;
    private String carModel;
    private String carCapacity;

    // Default Constructor
    public Car() {

        this.carName = "";
        this.carModel = "";
        this.carCapacity = "";
    }

    // Parameterized Constructor 1
    public Car(String name, String model) {

        this.carName = name;
        this.carModel = model;
    }

    // Parameterized Constructor 2
    public Car(String name, String model, String capacity) {
        // Write your code here
        this(name,model);
        this.carCapacity = capacity;

    }

    // Method to return car details
    public String getDetails() {

        return this.carName + ", " + this.carModel + ", " + this.carCapacity;
    }

    public static void main(String args[]){
        Car c=new Car("Tesla","Model 3","6");
        System.out.println(c.getDetails());
    }

}
