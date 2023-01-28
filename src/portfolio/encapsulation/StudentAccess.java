package portfolio.encapsulation;

// Student Class
class Student {

    // Private Fields
    private String name;
    private String rollNumber;
    public Student(){
        name = "Unknown";
        rollNumber = "N/A";
    }


    // getter function for name
    public String getName() {
        return name;
    }

    // setter function for name
    public void setName(String x) {
        this.name = x;
    }

    // getter function for roll number
    public String getRollNumber() {
        return this.rollNumber;
    }

    // setter function for roll number
    public void setRollNumber(String x) {
        this.rollNumber = x;
    }

}

public class StudentAccess
{
    public static void main(String[] args) {
        Student x = new Student();
        System.out.println(x.getName());
        x.setName("Samantha");
        String student_name = x.getName();
        System.out.println(student_name);

        System.out.println(x.getRollNumber());
        x.setRollNumber("2211");
        String student_rollnum = x.getRollNumber();
        System.out.println(student_rollnum);
    }
}
