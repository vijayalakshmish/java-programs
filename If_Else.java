package Java;

public class If_Else {
    
    public static void main(String[] args) {
        
        int a = 40, b = 13, c = 3;

        if (a > b && a > c) {
            System.out.println("A is Greater");
        } 
        else if (b > a && b > c) {
            System.out.println("B is Greater");
        } 
        else {
            System.out.println("C is Greater");
        }
    }
}
