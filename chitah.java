//Write a Java program to create a class called Animal with a method named move(). Create a subclass called 
//Cheetah that overrides the move() method to run.
package exercise;
class Animal {
    // Method to move (base class)
    public void move() {
        System.out.println("Animal moves");
    }
}

class Cheetah extends Animal {
    // Method to move (overrides move method in Animal class)
    public void move() {
        System.out.println("Cheetah runs");
    }
}

public class wildanimal {
    public static void main(String[] args) {
        // Creating an instance of Cheetah
        Cheetah cheetah = new Cheetah();
        // Calling move method of Cheetah
        cheetah.move(); // This will call the move method in Cheetah class
    }
}

Dry Run:
Animal Class:

Define a class named Animal.
Contains a method move() which prints "Animal moves". This method represents the movement of any generic animal.
Cheetah Class:

Define a class named Cheetah which extends Animal.
Overrides the move() method inherited from Animal with a specialized behavior for a cheetah, printing "Cheetah runs".
Main Class:

Contains the main method, the entry point of the program.
Creates an instance of Cheetah named cheetah.
Calls the move() method of the cheetah object.
Since cheetah is of type Cheetah, the overridden move() method in the Cheetah class is called, printing "Cheetah runs".
