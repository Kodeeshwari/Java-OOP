package College;

public class Testclass {
    public String fname;
    public static String lname="Solanki";

    public Testclass(){
        fname="kodee";
        this.lname="sengunthar";
    }
    public static void main(String[] args){
        String course="java";
        Testclass testob = new Testclass();
        //fname="mimoh";
     System.out.println(testob.fname);
        testob.fname = "mimoh";
        testob.lname ="solanki";
        System.out.println(testob.fname);
        System.out.println(testob.lname);


        //     System.out.println(testob.fname + " " + lname + " takes "+course);
    }
}
