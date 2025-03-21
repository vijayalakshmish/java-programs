package Java;
class Constructor {
    String name;
    int age;

    // Constructor
    Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object of Person using the constructor
    	Constructor p1 = new Constructor("Alice", 22);
        p1.display();
    }
}
