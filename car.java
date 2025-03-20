package modifiers.java;

//Superclass
class Vehicle {
 String modelName;
 String engineType;

 public Vehicle(String modelName, String engineType) {
     this.modelName = modelName;
     this.engineType = engineType;
 }

 void displayDetails() {
     System.out.println("Model Name: " + modelName);
     System.out.println("Engine Type: " + engineType);
 }
}

//Subclass 1
class Car extends Vehicle {
 int numberOfDoors;

 public Car(String modelName, String engineType, int numberOfDoors) {
     super(modelName, engineType);
     this.numberOfDoors = numberOfDoors;
 }

 void displayCarDetails() {
     super.displayDetails();
     System.out.println("Number of doors: " + numberOfDoors);
 }
}

//Subclass 2
class Truck extends Vehicle {
 int loadCapacity;

 public Truck(String modelName, String engineType, int loadCapacity) {
     super(modelName, engineType);
     this.loadCapacity = loadCapacity;
 }

 void displayTruckDetails() {
     super.displayDetails();
     System.out.println("Load Capacity: " + loadCapacity + " kg");
 }
}

//Main class
public class Main {
 public static void main(String[] args) {
     Car myCar = new Car("Sedan X", "Petrol", 4);
     Truck myTruck = new Truck("Hauler Z", "Diesel", 5000);

     myCar.displayCarDetails();
     System.out.println();
     myTruck.displayTruckDetails();
 }
}

