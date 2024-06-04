//Write a Java program to create a base class Sports with a method called play().
//Create three subclasses: Football, Basketball, and Rugby. Override the play() method in each subclass to play a specific statement for each sport.
package exercise;

// Base class Sports
class Sports {
    // Method to play a sport, default implementation prints a generic message
    public void play() {
        System.out.println("Playing generic sports");
    }
}

// Derived class Football inheriting from Sports
class Football extends Sports {
    // Overridden method to play football
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

// Derived class Basketball inheriting from Sports
class Basketball extends Sports {
    // Overridden method to play basketball
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

// Derived class Rugby inheriting from Sports
class Rugby extends Sports {
    // Overridden method to play rugby
    @Override
    public void play() {
        System.out.println("Playing rugby");
    }
}

// Main class to test the implementation
public class sport {
    public static void main(String[] args) {
        // Creating an instance of Football
        Football football = new Football();
        // Creating an instance of Basketball
        Basketball basketball = new Basketball();
        // Creating an instance of Rugby
        Rugby rugby = new Rugby();
        
        // Calling the play method on each instance
        football.play();       // Outputs: Playing football
        basketball.play();     // Outputs: Playing basketball
        rugby.play();          // Outputs: Playing rugby
    }
}

Dry Run:
Playing football
Playing basketball
Playing rugby
This output confirms that the overridden methods in each subclass (Football, Basketball, Rugby)
correctly print their respective messages when the play method is called.
