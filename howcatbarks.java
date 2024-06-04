//Write a Java program to create a class called Animal with a method called makeSound().
//Create a subclass called Cat that overrides the makeSound() method to bark.
package exercise;
class Animal {
    // Method to make a sound (base class)
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    // Method to make a sound (overrides makeSound method in Animal class)
    public void makeSound() {
        System.out.println("Cat barks");
    }
}

public class howcatbarks {
    public static void main(String[] args) {
        // Creating an instance of Cat
        Cat cat = new Cat();
        // Calling makeSound method of Cat
        cat.makeSound(); // This will call the makeSound method in Cat class
    }
}

Dry Run:
Animal Class:

Define a class named Animal.
Contains a method makeSound() which prints "Animal makes a sound". This method represents the sound of any generic animal.
Cat Class:

Define a class named Cat which extends Animal.
Overrides the makeSound() method inherited from Animal with a specialized behavior for a cat, printing "Cat barks".
Main Class:

Contains the main method, the entry point of the program.
Creates an instance of Cat named cat.
Calls the makeSound() method of the cat object.
Since cat is of type Cat, the overridden makeSound() method in the Cat class is called, printing "Cat barks". 
