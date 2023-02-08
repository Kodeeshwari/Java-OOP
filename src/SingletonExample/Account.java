package SingletonExample;

public class Account {
    static Account chequing = null;
    private Account(){

    }
    static public Account getInstance(){
        if (chequing == null){
            chequing = new Account();
        }
        return chequing;
    }

    public void getChequing() {
        System.out.println("You are chequing account created");
    }
}
