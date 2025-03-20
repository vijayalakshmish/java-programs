package modifiers.java;

public class vehicals {
	    public void vehiclesDetails() {  // Method name corrected
	        System.out.println("vehicles_details");
	    }
	}

	class Car1 extends vehicals {
	    @Override
	    public void vehiclesDetails() {  // Correct method name to match superclass
	        System.out.println("car1_details");
	    }
	}



