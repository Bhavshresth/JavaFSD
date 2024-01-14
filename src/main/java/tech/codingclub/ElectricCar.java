package tech.codingclub;

public class ElectricCar extends Car {

    private double batteryLeft = 100.0;

    public ElectricCar() {
        super();
    }

    public ElectricCar(String numberPlate) {
        super(numberPlate);
    }

    public ElectricCar(String numberPlate, int currentSpeed) {
        super(numberPlate, currentSpeed);
    }

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("TESLA 001", 500);
        tesla.accelerate();
        ElectricCar.printAboutWheels();
        System.out.println("TESLA SPEED : " + tesla.getCurrentSpeed() + " Battery : " + tesla.batteryPercentage());

    }

    public void accelerate() {
        //polymorphism
        super.accelerate();
        batteryLeft -= 0.5;
    }

    public double batteryPercentage() {

        return batteryLeft;
    }
}
