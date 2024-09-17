class LoanAccount extends Account {

    private static final double INTEREST_RATE = 0.10;

    public LoanAccount(String accountNumber, String accountHolderName, double loanAmount) {
        super(accountNumber, accountHolderName, -loanAmount);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdraw not allowed for loan account");
    }

    @Override
    public void calculateInterest() {
        balance -= Math.abs(balance) * INTEREST_RATE;
    }

    @Override
    public void dailyTransactionreport() {
        System.out.println("Loan Account: " + accountNumber + " has a remaining balance of Rs " + balance);

    }
}
