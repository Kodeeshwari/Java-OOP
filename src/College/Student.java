package College;

public class Student extends Person {
    private int id;

    public Student(){
        super("vivek","v@","MEch");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public static void main(String args[]){
        //Person personobj= new Person("kodee","kode@gmail.com","IT");
        Student studObj=new Student();
        System.out.println(studObj.getName());
        System.out.println(studObj.getEmail());
        System.out.println(studObj.getDept());
        studObj.setId(2210783);
        System.out.println(studObj.getId());

        String[] subject={"Java","Python","Php","IOS"};
        for (int i=0;i<subject.length;i++){
            System.out.println(subject[i]);
        }
        String[] studlist = {"kodee","mimoh","vivek"};
        for (String i:studlist
             ) {
            System.out.println(i);
        }
        int[] num_array = {1,2,3,4,5};
        for (int i:num_array
             ) {
            System.out.println(i);
        }
    }
}
