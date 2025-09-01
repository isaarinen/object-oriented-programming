public class SportsCar extends Car {
    private static final double fuel_usage = 2;
    public SportsCar(String typeName) {
        super(typeName);
    }
    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            double remainingFuel = getGasolineLevel() - fuel_usage;
            if (remainingFuel < 0) remainingFuel = 0;
            super.gasCar(remainingFuel, getSpeed() + 20);
        } else {
            super.gasCar(0, 0);
        }
    }
    @Override
    public void decelerate(int amount) {
        if (getGasolineLevel() > 0) {
            double remainingFuel = getGasolineLevel() - fuel_usage;
            if (remainingFuel < 0) remainingFuel = 0;
            super.gasCar(remainingFuel, Math.max(0, getSpeed() - (amount * 2)));
        } else {
            super.gasCar(0, 0);
        }
    }
}
