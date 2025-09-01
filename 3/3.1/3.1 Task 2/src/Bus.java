public class Bus extends Car {
    private int passengerCount;
    private int capacity;

    public Bus(String typeName, int capacity) {
        super(typeName);
        this.capacity = capacity;
        this.passengerCount = 0;
    }
    public boolean passengerEnter() {
        if (passengerCount < capacity) {
            passengerCount++;
            return true;
        } else {
            System.out.println("Bus is full");
            return false;
        }
    }
    public boolean passengerExit() {
        if (passengerCount > 0) {
            passengerCount--;
            return true;
        } else {
            System.out.println("No passengers");
            return false;
        }
    }
    public int getPassengerCount() {
        return passengerCount;
    }
    public int getCapacity() {
        return capacity;
    }
}
