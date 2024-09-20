import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/* Design a system to calculate the final price of an item after applying a discount. The system should:
    1.Accept the original price of an item and the discount percentage from the user.
    2.Calculate the discount amount and the final price using the following formulas:
    oDiscount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
    oFinal Price Calculation: finalPrice = originalPrice - discountAmount
    3.Display the discount amount and the final price of the item, in Indian Rupees (₹).
    Define the class DiscountCalculator with fields, an appropriate constructor, getter and setter methods, a toString method,
    and business logic methods. Define the class DiscountCalculatorUtil with methods acceptRecord, printRecord, and menuList.
Define the class Program with a main method to test the functionality of the utility class.*/
public class Main {
    public static void main(String[] args) {
        DiscountCalculatorUtil util = new DiscountCalculatorUtil();
        int choice;

        do {
            util.menuList();
            choice = getChoice();

            switch (choice){
                case 1 :
                    DiscountCalculator dc = util.acceptRecord();
                    util. printRecord(dc);

                    break;

                case 2 :
                    System.out.println("Exiting......");
                    break;

                default:
                    System.out.println("Invalid Choice. Please enter valid options.\n");

            }
        }while (choice != 2);
    }

    private static int getChoice() {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        try {
            while (true){
                choice = Integer.parseInt(sc.nextLine());
                break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter 1 or 2");;
        }

        return choice;
    }

}