public class Main {
    public static void main(String[] args) {
        Theater theater = new Theater(10);

        int[] seatsRequests = {1, 2, 2, 3, 1, 2, 1, 3, 1, 3, 2, 4, 4, 1, 3};
        Thread[] customers = new Thread[seatsRequests.length];

        for (int i = 0; i < seatsRequests.length; i++) {
            customers[i] = new Customer(theater, i + 1, seatsRequests[i]);
            customers[i].start();
        }

        for (Thread customer : customers) {
            try {
                customer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}