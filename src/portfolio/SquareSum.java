package portfolio;

public class SquareSum {
    public double squareSum(double num1, double num2, double num3) {
        double sum = 0;

        // Write your code here
        sum = num1*num1+num2*num2+num3*num3;

        return sum;
    }

    public static void main(String args[]){
        SquareSum sqsum=new SquareSum();
        System.out.println((int)sqsum.squareSum(2,3,4));

    }
}
