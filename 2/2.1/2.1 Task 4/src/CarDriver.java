public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla");
        myCar.fillTank();

        myCar.setTargetSpeed(80);
        if (myCar.cruiseControl()) {
            System.out.printf("Cruise control has been successful, accelerating to %3.0f\n", myCar.targetSpeed);
            System.out.println(myCar.getSpeed());
        }
        else {
            System.out.println("Cruise control unsuccessful, not enough gasoline.");
        }


        /*
        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
         */
    }
}