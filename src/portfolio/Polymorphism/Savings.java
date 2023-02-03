package portfolio.Polymorphism;

class Savings extends Account {

    double interestRate = 0.8; // member variable

    public Savings(int balance) { // parametrized contructor
        super(balance); // calling base class constructor
    }

    // Implementation of member functions
    public void Deposit(double amount) {
        balance += amount + (amount * interestRate);
    }

    public void Withdraw(double amount) {
        balance -= amount + (amount * interestRate);
    }

    public void printBalance() {
        System.out.println("Balance in your saving account: " + balance);
    }

}
