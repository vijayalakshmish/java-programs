package modifiers.java;

// two possible of method and classes
abstract class Flowers { // Parent class
    abstract void smell(); // Abstract method without a body
}

class Rose extends Flowers {
    @Override
    void smell() {
        System.out.println("Rose smells sweet");
    }
}

class Lily extends Flowers {
    @Override
    void smell() {
        System.out.println("Lily has a mild fragrance");
    }
}

public class Abstraction {
    public static void main(String[] args) {
      
        Rose rose = new Rose();
        rose.smell();

        Lily lily = new Lily();
        lily.smell(); 
    }
}
