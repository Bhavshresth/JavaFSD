package tech.codingclub;

public class LearnClass {

    public static void main(String[] args) {
        Car audi = new Car("AUDI 007");
        audi.wheelCount = 8;

        audi.accelerate();
        audi.accelerate();
        audi.accelerate();

        Car bmw = new Car("BMW 001", 100);
        bmw.increaseSpeed(1100);
        System.out.println("Current Speed BMW : " + bmw.getCurrentSpeed());
        System.out.println("Current Speed Audi : " + audi.getCurrentSpeed());
        System.out.println("Audi Wheels : " + audi.wheelCount);
        System.out.println("BMW Wheels : " + bmw.wheelCount);

//        car.wheelCount is static in nature
        Car.printAboutWheels();

        Car.wheelCount = 4;
        System.out.println("Audi Wheels : " + audi.wheelCount);
        System.out.println("BMW Wheels : " + bmw.wheelCount);


        DummyCar car = new DummyCar() {
            @Override
            public void move() {
//                this.accelerate();
//                this.getCurrentSpeed();
            }
        };

    }
}
