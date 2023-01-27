package portfolio.encapsulation;

// Class Rectangle
class Rectangle {

    // Private Fields
    private int length;
    private int width;

    // Default Constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Parameterized Constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;

    }

    // Method to calculate Area of a rectangle
    public int getArea() {
        return this.length * this.width;
    }

}

class Demo {

    public static void main(String args[]) {

        Rectangle obj = new Rectangle(2, 2);
        System.out.println(obj.getArea());

    }

}
