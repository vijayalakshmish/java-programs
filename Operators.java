package Java;

public class Operators {
    static int add(int a, int b) { return a + b; }
    static int subtract(int a, int b) { return a - b; }
    static int multiply(int a, int b) { return a * b; }
    static float divide(int a, int b) {return a/b;}
    static int modulo(int a, int b) {return a%b;}

    public static void main(String[] args) {
        int a = 20, b = 10;
        System.out.println("Add: " + add(a,b));
        System.out.println("Sub: " + subtract(a,b));
        System.out.println("Mul: " + multiply(a,b));
        System.out.println("Div: " + divide(a,b));
        System.out.println("Mod: " + modulo(a,b));
    }
}
