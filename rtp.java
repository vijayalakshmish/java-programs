package modifiers.java;

public class rtp {
    public void sound() {
        System.out.println("Animal sounds");
    }
}

class Dog extends rtp {
    @Override
    public void sound() {
        System.out.println("bow bow");
    }
}

public class main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
