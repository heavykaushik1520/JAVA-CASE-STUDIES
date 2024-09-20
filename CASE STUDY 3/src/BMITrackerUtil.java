import java.util.Scanner;

public class BMITrackerUtil {
    private Scanner sc;

    public BMITrackerUtil() {
        sc = new Scanner(System.in);
    }

    public BMITracker acceptRecord() {
        double weight = 0.0;
        double height = 0.0;

        try {
            System.out.println("Enter Weight : ");
            weight = Double.parseDouble(sc.nextLine());

            System.out.println("Enter Height : ");
            height = Double.parseDouble(sc.nextLine());

            if (height <= 0 || weight <= 0)
            {
                System.out.println("Weight and Height must be positive");
                return null;

            }

            return  new BMITracker(weight , height);
        } catch (NumberFormatException e ) {
            System.out.println("Invaid Input .. please input numeric value");
            return null;
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void printRecord(BMITracker record){

        if (record != null)
            System.out.println(record.toString());
        else
            System.out.println("No record to display");


    }

    public void menuList(){
        BMITracker record = null;
        int choice = 0;

        while (true){
            System.out.println("----BMI TRACKER MENU----");
            System.out.println("1 . Enter BMI Record");
            System.out.println("2 . Display BMI Record");
            System.out.println("3 . Exit");
            System.out.println("Choose an Option :");

            try {
                choice = Integer.parseInt(sc.nextLine());

                switch (choice){
                    case 1 :
                        record = acceptRecord();
                        if (record != null)
                            System.out.println("BMI record successfully added");
                        break;

                    case 2 :
                        printRecord(record);
                    break;

                    case 3 :
                        System.out.println("Exiting Program...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice...");

                }
            }catch (NumberFormatException e)
            {
                System.out.println("Invalid Input.... input should be numeric between 1 - 3");
            }
        }
    }
}
