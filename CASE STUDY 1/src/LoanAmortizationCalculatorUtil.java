import java.util.Scanner;

public class LoanAmortizationCalculatorUtil {

    public static LoanAmortizationCalculator acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount : ");
        double principal = sc.nextDouble();

        System.out.println("Enter the annual interest rate : ");
        double annualInterestRate = sc.nextDouble();

        System.out.println("Enter the loan term (in yrs) :");
        int loanTermInYears = sc.nextInt();

        return new LoanAmortizationCalculator(principal, annualInterestRate, loanTermInYears);
    }

    public static  void printRecord(LoanAmortizationCalculator calculator){
        System.out.println(calculator);
        System.out.println("Monthly Payment : ₹" + calculator.calculateMonthlyPayment());
        System.out.println("Total Payment : ₹" + calculator.calculateTotalPayment());

    }

 /*   public static void menuList(){
        System.out.println("Menu : ");
        System.out.println("1 : Accept Loan Details");
        System.out.println("2 : Display Loan Information And Monthly Payment");
        System.out.println("3 : Exit");
    } */


}
