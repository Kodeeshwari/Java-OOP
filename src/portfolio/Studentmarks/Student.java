package portfolio.Studentmarks;

public class Student {
    private String name;
    private Double mark1;
    private Double mark2;

    public Student(){
        this.name=null;
        this.mark1=null;
        this.mark2=null;
    }
    public Student(String name,Double mark1, Double mark2){
        this.name=name;
        this.mark1=mark1;
        this.mark2=mark2;
    }

    public double getMarks(int markNumber){
        if(markNumber==1){
            return this.mark1;
        }
        else {
            return this.mark2;
        }
    }

    public double calcTotal(){
        return this.mark1+this.mark2;
    }

    public static void main(String args[]){
        Student std=new Student("kodee",60.5,70.5);
        System.out.println(std.getMarks(1));
        System.out.println(std.calcTotal());
    }
}
