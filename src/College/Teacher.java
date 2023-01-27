package College;

public class Teacher extends Person {
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Teacher(){
        super("michelle","michelle@","computerscience");
    }
    public static void main(String args[]){
        Teacher t1=new Teacher();
        System.out.println(t1.getName());
        System.out.println(t1.getEmail());
        System.out.println(t1.getDept());
        t1.setId(1052689);
        System.out.println(t1.getId());
    }
}
