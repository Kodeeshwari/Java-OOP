package portfolio.Polymorphism;

class Account {

    protected double balance; // protected variable

    public Account(double balance) { // parametrized constructor
        this.balance = balance;
    }

    // member functions
    public void Deposit(double amount){}
    public void Withdraw(double amount){}
    public void printBalance(){}

}

