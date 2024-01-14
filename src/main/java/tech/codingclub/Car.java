package tech.codingclub;

public class Car implements CarInterface {

    public static final int maxSpeed = 300;
    public static int wheelCount = 4;
    String numberPlate;
    private int currentSpeed = 0;//Any method will be able to access but cannot access out of this class

    public Car() {
//        default constructor
    }

    public Car(String numberPlate, int currentSpeed) {
//        current object reference
        this.numberPlate = numberPlate;
        this.currentSpeed = currentSpeed;
    }

    public Car(String numberPlate) {
//        current object reference
        this.numberPlate = numberPlate;
    }

    //Static methos can only access/modify data variable
    public static void printAboutWheels() {
        //not valid to write currentSpeed
        System.out.println("Car has " + Car.wheelCount + " : wheels.");
    }

    public static void main(String[] args) {


    }

    public void accelerate() {
        System.out.println("Speeding Up ! " + numberPlate);
        currentSpeed += 10;
    }

    @Override
    public void applyBrake() {
        currentSpeed = 0;
    }

    public void increaseSpeed(int i) {
        if (i < 0) return;
        currentSpeed += i;
        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed;
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
