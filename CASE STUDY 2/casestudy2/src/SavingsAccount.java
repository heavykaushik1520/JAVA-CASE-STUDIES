public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 10000;
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE)
            balance -= amount;
        else
            System.out.println("Cannot withdraw Minimum balance should be 10000");

    }

    @Override
    public void calculateInterest() {
        double interest = balance * INTEREST_RATE;  // Step 1: Calculate the interest
        balance = balance + interest;               // Step 2: Add the interest to the balance

    }

    @Override
    public void dailyTransactionreport() {
        System.out.println("Savings Account: " + accountNumber + " has a balance of Rs " + balance);

    }
}
