public class Customer extends Thread {
    private Theater theater;
    private int customerId;
    private int seatsToReserve;

    public Customer(Theater theater, int customerId, int seatsToReserve) {
        this.theater = theater;
        this.customerId = customerId;
        this.seatsToReserve = seatsToReserve;
    }

    public void run() {
        theater.reserveSeats(customerId, seatsToReserve);
    }
}