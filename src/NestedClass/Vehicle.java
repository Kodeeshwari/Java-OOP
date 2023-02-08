package NestedClass;

public class Vehicle {
    static class Car{
        public void engineSound(){
            System.out.println("I am car - vehicle");
        }
    }
    class Truck{
        public void engineSound(){
            System.out.println("I am Truck - vehicle");
        }
    }

    static class Bus{
        public void engineSound(){
            System.out.println("I am Bus");
        }
    }
    static class Motorcycle{
        static Motorcycle motor = null;
        private Motorcycle(){

        }
        public static Motorcycle getInstance(){
            if(motor==null){
                motor = new Motorcycle();
            }
            return motor;
        }
        public void engineSound(){
            System.out.println("I am Motor - Sounds like drouun doruun");
        }
    }
}
