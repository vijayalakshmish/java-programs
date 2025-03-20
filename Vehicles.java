package modifier;

public class Vehicles {  // Renamed class for correct spelling
    public void vehiclesDetails() {  // Method name corrected
        System.out.println("vehicles_details");
    }
}

class Car1 extends Vehicles {
    @Override
    public void vehiclesDetails() {  // Correct method name to match superclass
        System.out.println("car1_details");
    }
}
