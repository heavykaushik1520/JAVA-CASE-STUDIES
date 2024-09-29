// incomplete to string method

public class TollBoothRevenueManager {
    private double carTollRate;
    private double truckTollRate;
    private double motorcycleTollRate;
    private int carCount;
    private int truckCount;
    private int motorcycleCount;

    public TollBoothRevenueManager(double carTollRate, double truckTollRate, double motorcycleTollRate) {
        this.carTollRate = carTollRate;
        this.truckTollRate = truckTollRate;
        this.motorcycleTollRate = motorcycleTollRate;
        this.carCount = 0;
        this.truckCount = 0;
        this.motorcycleCount = 0;
    }

    public int getCarCount() {
        return carCount;
    }


    public double getCarTollRate() {
        return carTollRate;
    }

    public void setCarTollRate(double carTollRate) {
        this.carTollRate = carTollRate;
    }

    public double getTruckTollRate() {
        return truckTollRate;
    }

    public void setTruckTollRate(double truckTollRate) {
        this.truckTollRate = truckTollRate;
    }

    public void setMotorcycleTollRate(double v) {
        this.motorcycleTollRate = v;
    }

    public double getMotorcycleTollRate() {
        return motorcycleTollRate;
    }


    public int getTruckCount() {
        return truckCount;
    }


    public int getMotorcycleCount() {
        return motorcycleCount;
    }

    public void acceptCars(int cars) {
        this.carCount += cars;
    }


    public void acceptTrucks(int trucks) {
        this.truckCount += trucks;
    }

    public void acceptMotorcycles(int motorcycles) {
        this.motorcycleCount += motorcycles;
    }

    public double calculateTotalRevenue() {
        return (carCount * carTollRate) + (truckCount * truckTollRate) + (motorcycleCount * motorcycleTollRate);
    }

    public int calculateTotalVehicles() {
        return carCount + truckCount + motorcycleCount;
    }

    public String toString() {
        return "Total Vehicle : " + calculateTotalVehicles() + "\nTotal Revenue : " + calculateTotalRevenue();
    }


}
