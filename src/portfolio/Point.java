package portfolio;

import java.lang.Math;
class Point{

    // Private fields
    private int x;
    private int y;

    // Default Constructor
    public Point() {
        // Implement the function
        this.x=0;
        this.y=0;
    }

    // Parameterized Constructor
    public Point(int x, int y) {
        // Implement the function
        this.x=x;
        this.y=y;
    }


    public double distance() {
        // Implement the function

        return Math.sqrt(x*x + y*y);
    }

    public double distance(int x2, int y2) {
        // Implement the function
        return Math.sqrt(((x2-x)*(x2-x)) +((x2-x)*(x2-x)));
    }

    public static void main(String args[]) {
        Point p1 = new Point(5, 5);
        System.out.println(p1.distance());
        System.out.println(p1.distance(2, 1));
    }
}




