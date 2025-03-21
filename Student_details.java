package Java.work;
import java.util.Scanner;

public class Student_details { // Follow Java naming conventions

    public static void main(String[] args) { // Added String[] args
        String name;
        int id;
        float CGPA;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        
        System.out.print("Enter CGPA: ");
        CGPA = sc.nextFloat();

        // Printing details
        System.out.println("STUDENT DETAILS");
        System.out.println("----------------");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + CGPA);

        sc.close(); // Closing scanner to avoid resource leak
    }
}
