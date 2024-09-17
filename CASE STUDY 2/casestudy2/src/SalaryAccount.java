class SalaryAccount extends SavingsAccount {
    private int monthsInactive = 0;

    public SalaryAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        monthsInactive = 0;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        monthsInactive = 0;
    }

    public void freezeIfInactive() {
        if (monthsInactive >= 2) {
            System.out.println("Salary account frozen due to inactivity");
        }
    }

    @Override
    public void dailyTransactionreport() {
        System.out.println("Salary Account: " + accountNumber + " has a balance of Rs " + balance);

    }
}
