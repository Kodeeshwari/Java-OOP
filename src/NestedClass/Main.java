package NestedClass;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.Car tesla = new Vehicle.Car();
        tesla.engineSound();

        Vehicle.Truck truckObj = vehicle.new Truck();
        truckObj.engineSound();

        Vehicle.Bus bus = new Vehicle.Bus();
        bus.engineSound();

//        Vehicle.Motorcycle bike = vehicle.new Motorcycle();
//        bike.engineSound();

        Vehicle.Motorcycle bike = Vehicle.Motorcycle.getInstance();
        bike.engineSound();
    }
}
