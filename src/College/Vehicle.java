package College;

public class Vehicle
{
    protected String color;
    private String model;
    private int year;
    private int numOfDoor;
    private double price;
    public Vehicle(){}
    public Vehicle(String color, String model, int year, int numOfDoor, int price)
    {
        this.color = color;
        this.model = model;
        this.numOfDoor = numOfDoor;
        this.year = year;
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getNumOfDoor() {
        return numOfDoor;
    }
    public void setNumOfDoor(int numOfDoor) {
        this.numOfDoor = numOfDoor;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

