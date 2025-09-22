public class Theater {
    private int availableSeats;

    public Theater(int seats) {
        this.availableSeats = seats;
    }

    public synchronized boolean reserveSeats(int customerId, int seats) {
        if (seats <= availableSeats) {
            availableSeats -= seats;
            System.out.println("Customer " + customerId + " reserved " + seats + " tickets.");
            return true;
        } else {
            System.out.println("Customer " + customerId + " couldn't reserve " + seats + " tickets.");
            return false;
        }
    }
}