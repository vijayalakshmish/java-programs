package modifiers.java;
import java.util.*;

// IMPLEMENTATION OF ABSTRACTION:

abstract class Apps { // Abstract Parent Class
    
    String user_name;
    String password;
    
    void user_input() {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER USERNAME:");
        user_name = s.nextLine();
        System.out.println("ENTER PASSWORD:");
        password = s.nextLine();
    }
    
    void user_login() {
        System.out.println("\nWELCOME TO INSTAGRAM");
        System.out.println("--------------------\n");
    }
    
    abstract void app_open(); // Abstract method
}

class Instagram extends Apps { // Child class
    @Override
    void app_open() { // Implementing the abstract method
    	
    	while (true) {
    		
    	
    		
        if (user_name.equals("Raghav") && password.equals("123456")) {
            System.out.println("App is open..!!!");
            break;
        } else {
            System.out.println("Invalid credentials. Please try again.");
            user_input();
        }
    	}
        System.out.println("Opening Instagram...");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        Apps myApp = new Instagram(); // Creating an object of the child class
        myApp.user_input();          // Capturing the username and password
        myApp.user_login();          // Displaying the login welcome message
        myApp.app_open();            // Calling the implemented method
    }
}
