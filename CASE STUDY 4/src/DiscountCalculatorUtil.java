import java.util.Scanner;

public class DiscountCalculatorUtil {

    private Scanner sc;

    public DiscountCalculatorUtil() {
        sc = new Scanner(System.in);
    }

    public void menuList() {
        System.out.println("=== Discount Calculator ===");
        System.out.println("1 . Calculate Discount");
        System.out.println("2 . Exit");
        System.out.println("Enter Your Choice");

    }

    public DiscountCalculator acceptRecord() {
        System.out.println("Enter original price in Rs : ");
        double originalPrice = Double.parseDouble(sc.nextLine());

        System.out.println("Enter discount in % : ");
        double discountRate = Double.parseDouble(sc.nextLine());

        return new DiscountCalculator(originalPrice, discountRate);
    }

    public void printRecord(DiscountCalculator dc) {
        System.out.println("\n--- Discount Details ---");
        System.out.println(dc.toString());
        System.out.println("------------------------\n");

    }

    private double readDouble() {
        double value ;

        while (true) {
            try {
                value = Double.parseDouble(sc.nextLine());
                if(value < 0)
                    throw new NumberFormatException("Negvative Value Entered");
                break;
            } catch (NumberFormatException e)
            {
                System.out.println("Invalid Input . Please enter valid number");
            }
        }
        return value;
    }

}

