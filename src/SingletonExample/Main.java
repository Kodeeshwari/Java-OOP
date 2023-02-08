package SingletonExample;

public class Main {
    public static void main(String[] args) {
        Account myCheqinAc = Account.getInstance();
        myCheqinAc.getChequing();
    }
}
