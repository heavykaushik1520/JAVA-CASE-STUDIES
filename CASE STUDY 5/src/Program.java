import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TollBoothRevenueManager manager = new TollBoothRevenueManager(50.00, 100.00, 30.00);

        while (true){
            TollBoothRevenueManagerUtil.menuList();
            System.out.println("Enter Your Choice :");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Enter Car Toll Rate :");
                    manager.setCarTollRate(scanner.nextDouble());
                    System.out.println("Enter Truck Toll Rate :");
                    manager.setTruckTollRate(scanner.nextDouble());
                    System.out.println("Enter MotorCycle Toll Rate :");
                    manager.setMotorcycleTollRate(scanner.nextDouble());

                    break;

                case 2 :
                    TollBoothRevenueManagerUtil.acceptRecord(manager);
                    break;

                case 3 :
                    TollBoothRevenueManagerUtil.printRecord(manager);
                    break;

                case 4 :
                    System.out.println("Exiting....");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice ...");

            }
        }
    }
}