package College;

public class Dog
{
    private String name;
    private int age;
    private String color;

    public Dog(String name,int age, String color){
        this.name = name;
        this.age = age;
        this.color=color;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }


    public String toString(){
        return (this.getName()+ " " + this.getAge()+ " " +this.getColor());
    }

    public static void main(String[] args){
        Dog dogObj = new Dog("molly",4,"brown");
        System.out.println(dogObj);
    }

}

