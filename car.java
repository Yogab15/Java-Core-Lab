//Write a Java program to create a class called Vehicle with a method called drive().
//Create a subclass called Car that overrides the drive() method to print "Repairing a car".
class Vehicle 
{
    // Method to drive a vehicle
    public void drive()
    {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle
{
    // Method to drive a car (overrides the drive method in Vehicle class)
    public void drive() 
    {
        System.out.println("Repairing a car");
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        // Creating an instance of Car
        Car myCar = new Car();
        // Calling drive method of Car
        myCar.drive(); // This will call the drive method in Car class
    }
}

Dry Run:
Vehicle Class:

Define a class named Vehicle.
Declares a method drive() to drive a vehicle.
Car Class:

Define a class named Car which extends Vehicle.
Overrides the drive() method inherited from Vehicle.
Implements a new behavior for driving a car, which is to print "Repairing a car".
Main Class:

Creates an instance of Car named myCar.
Calls the drive() method of myCar.
Since myCar is of type Car, the overridden drive() method in the Car class is called.
Prints "Repairing a car".
