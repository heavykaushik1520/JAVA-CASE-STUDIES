//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AirplaneSeating {
    private char seats[][];
    private int rows;
    private int cols;

    public AirplaneSeating(int rows, int cols) {
        this.rows = rows;

        this.cols = cols;
        seats = new char[rows][cols];
        initializeSeats();
    }

    private void initializeSeats() {
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                seats[i][j] = 'A'; // represents available seat
            }

        }
    }

    //book a seat by marking it as a occupied ('B')
    public void bookSeat(int row, int col) {
        if (isValidSeat(row, col) && seats[rows][cols] == 'B') {
            seats[row][col] = 'A';
            System.out.println(" seat " + (row + 1) + "-" + (col + 1) + "has been successfully booked");
        } else if (!isValidSeat(row, col)) {
            System.out.println("Invalid Seat selection");
        } else {
            System.out.println("Seat " + (row + 1) + "-" + (col + 1) + "is already booked");
        }

    }

    public void checkAvailability(){
        
    }

    public void displaySeatingChart() {
        System.out.println("Current seating Chart : ");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

    }

    private boolean isValidSeat(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;

    }
}