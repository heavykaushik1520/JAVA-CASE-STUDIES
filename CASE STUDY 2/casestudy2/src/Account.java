public abstract class Account {

    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Account(String accountNumber , String accounHolderName , double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accounHolderName;
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public  abstract void calculateInterest();
    public abstract void dailyTransactionreport();

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

}
