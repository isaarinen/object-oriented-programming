public class CoffeeMaker {
    public boolean isOn;
    public int coffeeAmount;
    public boolean isEspresso;

    public CoffeeMaker() {
        this.isOn = false;
        this.coffeeAmount = 10;
        this.isEspresso = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public int  getCoffeeAmount() {
        return coffeeAmount;
    }

    public boolean isEspresso() {
        return isEspresso;
    }

    public void onOffSwitch() {
        isOn = !isOn;
    }
    public void espressoToggle() {
        if (this.isOn) {
            this.isEspresso = !this.isEspresso;
        }
    }
    public void setCoffeeAmount(int coffeeAmount) {
        if (this.isOn) {
            if (coffeeAmount > 80) {
                this.coffeeAmount = 80;
            }
            else if (coffeeAmount < 10) {
                this.coffeeAmount = 10;
            }
            else {
                this.coffeeAmount = coffeeAmount;
            }
        }
    }
}
