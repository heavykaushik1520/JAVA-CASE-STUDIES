class CurrentAccount extends Account {
    private double overDraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, double balance , double overDraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overDraftLimit = overDraftLimit;
    }


    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overDraftLimit >= amount)
            balance -= amount;
        else
            System.out.println("Overdraft limit exceeds");
    }

    @Override
    public void calculateInterest() {

    }

    @Override
    public void dailyTransactionreport() {
        System.out.println("Current Account: " + accountNumber + " has a balance of Rs " + balance);
    }
}
