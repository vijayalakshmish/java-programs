package modifiers.java;
import java.util.*;

// IMPLEMENTATION OF ABSTRACTION:

abstract class Apps { // Abstract Parent Class
    
    String phone_number;
    String otp;
    
    void user_input() {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER PHONE NUMBER:");
        phone_number = s.nextLine();
        
        // Simulating OTP Generation
        Random rand = new Random();
        String generatedOtp = String.format("%04d", rand.nextInt(10000)); // 4-digit OTP
        System.out.println("Your OTP is: " + generatedOtp); // In real applications, OTP is sent via SMS.
        
        System.out.println("ENTER OTP:");
        otp = s.nextLine();
        
        // Storing the generated OTP for verification
        validateOtp(generatedOtp);
    }
    
    void validateOtp(String generatedOtp) {
        while (!otp.equals(generatedOtp)) {
            System.out.println("Invalid OTP. Please try again:");
            Scanner s = new Scanner(System.in);
            otp = s.nextLine();
        }
    }
    
    void user_login() {
        System.out.println("\nWELCOME TO WHATSAPP");
        System.out.println("--------------------\n");
    }
    
    abstract void app_open(); // Abstract method
}

class WhatsApp extends Apps { // Child class
    @Override
    void app_open() { 
        System.out.println("Opening WhatsApp...");
    }
}

public class Apps {
    public static void main(String[] args) {
        Apps myApp = new WhatsApp();
        myApp.user_input();         
        myApp.user_login();          
        myApp.app_open();            
    }
}
