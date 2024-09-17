import java.util.InputMismatchException;
import java.util.Scanner;

public class BankSystem
{
    public static void main(String[] args) throws InputMismatchException {

        Scanner sc = new Scanner(System.in);

        Account[] accounts = new Account[100];

        int accountCount = 0;

        while (true){
            System.out.println("1. Open Account");
            System.out.println("2. Login");
            System.out.println("3. Close Account");
            System.out.println("4. Exit");
            System.out.println("Select Option : ");
            int option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("1 . Saving Account");
                    System.out.println("2 . Salary Account");
                    System.out.println("3 . Current Account");
                    System.out.println("4 . Loan Account");
                    System.out.println("Select Account Type :");
                    int type = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Account Holder Name : ");
                    String name = sc.nextLine();
                    System.out.println("Enter Initial Deposit :");
                    double deposit = sc.nextDouble();

                    Account account = null;

                    String accountNumber = "XYZ" + (accountCount + 1);
                    System.out.println(accountNumber);

                    if (type == 1){
                        account = new SavingsAccount(accountNumber , name , deposit);
                    } else if (type == 2) {
                        account = new SalaryAccount(accountNumber , name , deposit);
                    } else if (type == 3) {
                        System.out.println("Enter overdraft limit :");
                        double limit = sc.nextDouble();
                        account = new CurrentAccount(accountNumber , name , deposit , limit);
                    } else if (type == 4) {
                        account = new LoanAccount(accountNumber , name , deposit);
                    }

                    if (account != null){
                        accounts[accountCount++] = account;
                    }

                    break;

                case 2 :
                    System.out.println("Enter Account Number : ");
                    String accNumber = sc.next();

                    Account loggedInAccount = null ;
                    for (Account acc : accounts){
                        if (acc != null && acc.getAccountNumber().equals(accNumber)){
                            loggedInAccount = acc;
                            break;
                        }
                    }

                    if (loggedInAccount == null){
                        System.out.println("Account not found");
                    }

                    boolean loggedIn = true;

                    while (loggedIn){
                        System.out.println("1 : Deposit");
                        System.out.println("2 : Withdraw");
                        System.out.println("3 : Check Balance");
                        System.out.println("4 : Daily Transaction Report");
                        System.out.println("5 : Calculate Interest");
                        System.out.println("6 : Logout");

                        System.out.println("Select Option : ");
                        int loginChoice = sc.nextInt();

                        switch (loginChoice){
                            case 1 :
                                System.out.println("Enter Amount To Deposit");
                                double amount = sc.nextDouble();
                                loggedInAccount.deposit(amount);
                                break;

                            case 2 :
                                System.out.println("Enter Amount to Withdraw : ");
                                double withadrwal = sc.nextDouble();
                                loggedInAccount.withdraw(withadrwal);
                                break;

                            case 3 :
                                System.out.println("Balance : Rs "+ loggedInAccount.getBalance());
                                break;

                            case 4 :
                                loggedInAccount.dailyTransactionreport();
                                break;

                            case 5 :
                                loggedInAccount.calculateInterest();
                                break;

                            case 6 :
                                loggedIn = false;
                                break;
                        }

                    }
                    break;

                case 3 :
                    System.out.println("Feature not implemented yet");
                    break;

                case 4 :
                    System.exit(0);
            }
        }
    }
}