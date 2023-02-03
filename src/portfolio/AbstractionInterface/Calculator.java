package portfolio.AbstractionInterface;

// Addition interface
interface Addition {

    int add(int num1, int num2);

}
class Calculator implements Addition {

    // Overriding the add method of Addition interface
    public int add(int num1, int num2) {
        return num1 + num2;
    }

}