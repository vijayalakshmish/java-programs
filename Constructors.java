package myjava;

class Fruits {
    // Default constructor
    Fruits() {
        System.out.println("I am the default constructor");
    }

    // Parameterized constructor
    Fruits(String name) {
        System.out.println("I am the parameterized constructor");
        System.out.println("Fruit name: " + name);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Fruits f1 = new Fruits(); // Calls the default constructor
        System.out.println("I am the main method");

        Fruits f2 = new Fruits("Apple"); // Calls the parameterized constructor
    }
}
