// The Car object doesn't have a "stop" method, so you can't tell it to stop. 
// Either add a "stop" method to the Car class or take out the line that tries to make the car stop.

class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("Starting the car.");
    }

    public void stop() {
        System.out.println("Stopping the car.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        car.start();
        car.stop();
    }
}


// Now, the program will compile and run without errors. 
// The stop method has been added to the Car class to demonstrate basic object-oriented programming principles.