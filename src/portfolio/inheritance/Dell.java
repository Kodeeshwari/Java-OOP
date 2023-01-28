package portfolio.inheritance;

public class Dell extends Laptop{
    private String name;
    public Dell(String name){
        super(name);
    }
    public String getName(){
        return super.getName();
    }
    public static void main(String[] args){
        Dell del = new Dell("Allienware");
        System.out.println(del.getName());
    }
}
