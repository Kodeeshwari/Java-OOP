package portfolio.Polymorphism;

class Current extends Account {

    public Current(int balance) { // Parametrized constructor
        super(balance); // calling base class constructor
    }

    // Implementation of public member functions
    public void Deposit(double amount) {
        balance += amount;
    }

    public void Withdraw(double amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("Balance in your current account: " + balance);
    }

}
