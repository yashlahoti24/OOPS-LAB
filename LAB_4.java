// Car, train, helicopter
import java.util.Scanner;

// Abstract base class for vehicles
abstract class Vehicle {
    // Abstract method for movement
    abstract void move();
}

// Helicopter subclass
class Helicopter extends Vehicle {
    @Override
    void move() {
        System.out.println("The helicopter flies in the air.");
    }
}

// Car subclass
class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car drives on the road.");
    }
}

// Train subclass
class Train extends Vehicle {
    @Override
    void move() {
        System.out.println("The train runs on the track.");
    }
}

// Factory class for creating vehicles based on user input
class VehicleFactory {
    static Vehicle createVehicle(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("helicopter")) {
            return new Helicopter();
        } else if (vehicleType.equalsIgnoreCase("car")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("train")) {
            return new Train();
        } else {
            return null;
        }
    }
}

public class LAB_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of vehicle you want (helicopter, car, train): ");
        String vehicleType = scanner.nextLine();

        Vehicle vehicle = VehicleFactory.createVehicle(vehicleType);

        if (vehicle != null) {
            vehicle.move();
        } else {
            System.out.println("Invalid vehicle type.");
        }
    }
}
