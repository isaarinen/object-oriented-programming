public class CoffeeMakerDriver {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.onOffSwitch();
        if (coffeeMaker.isOn()) {
            System.out.println("Coffee maker is on");
        }
        coffeeMaker.espressoToggle();
        if (coffeeMaker.isEspresso()) {
            System.out.println("Coffee type is espresso");
        }
        coffeeMaker.setCoffeeAmount(50);
        System.out.printf("Coffee amount is %d",  coffeeMaker.getCoffeeAmount());
        coffeeMaker.onOffSwitch();
    }
}
