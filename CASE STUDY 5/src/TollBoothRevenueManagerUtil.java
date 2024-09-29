import java.util.Scanner;

public class TollBoothRevenueManagerUtil {

    public static void acceptRecord(TollBoothRevenueManager manager){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Cars Passing Through : ");
        int cars = sc.nextInt();
        manager.acceptCars(cars);

        System.out.println("Enter Number of Trucks Passing Through : ");
        int trucks = sc.nextInt();
        manager.acceptTrucks(trucks);

        System.out.println("Enter Number of MotorCycles Passing Through : ");
        int motorCycles = sc.nextInt();
        manager.acceptMotorcycles(motorCycles);

    }

    public static void printRecord(TollBoothRevenueManager manager){
        System.out.println(manager);
    }

    public  static void menuList(){
        System.out.println("1 : Set Toll Rates");
        System.out.println("2 : Accept Vehicle Record");
        System.out.println("3 : Display Total Revenue & Vehicle Count");
        System.out.println("4 : Exit");
    }

}
