import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LoanAmortizationCalculator calculator = null;

        while (true) {
//            LoanAmortizationCalculatorUtil.menuList();
            System.out.println("Menu : ");
            System.out.println("1 : Accept Loan Details");
            System.out.println("2 : Display Loan Information And Monthly Payment");
            System.out.println("3 : Exit");
            System.out.println("Select Option : ");
            int select = sc.nextInt();

            switch (select) {
                case 1:
                    calculator = LoanAmortizationCalculatorUtil.acceptRecord();
                    break;

                case 2:
                    if (calculator != null)
                        LoanAmortizationCalculatorUtil.printRecord(calculator);
                    else
                        System.out.println("Empty Loan Details");
                    break;

                case 3:
                    System.out.println("Exit");
                    return;

                default:
                    System.out.println("Invalid Choice...");
            }

        }

    }
}