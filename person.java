//Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
package exercise;  // Declares the package name as 'exercise'

public class person {  // Declares a public class named 'person'
    // Private instance variables to store name and age
    private String name;
    private int age;
    
    // Constructor to initialize name and age
    public person(String name, int age) {
        this.name = name;  // Assigns the value of 'name' parameter to the instance variable 'name'
        this.age = age;    // Assigns the value of 'age' parameter to the instance variable 'age'
    }
    
    // Getter method to retrieve the name
    public String getName() {
        return name;  // Returns the value of the 'name' instance variable
    }
    
    // Getter method to retrieve the age
    public int getAge() {
        return age;  // Returns the value of the 'age' instance variable
    }
    
    // Main method: the entry point of the program
    public static void main(String[] args) {
        // Creating two instances of Person using the constructor
        person person1 = new person("Yogada", 23);  // Creates an instance with name "Yogada" and age 23
        person person2 = new person("Manasi", 22);  // Creates an instance with name "Manasi" and age 22
        
        // Printing details of person1
        System.out.println("Person 1:");
        System.out.println("Name: " + person1.getName());  // Calls the getName() method to get the name of person1
        System.out.println("Age: " + person1.getAge());    // Calls the getAge() method to get the age of person1
        
        System.out.println();  // Prints a blank line
        
        // Printing details of person2
        System.out.println("Person 2:");
        System.out.println("Name: " + person2.getName());  // Calls the getName() method to get the name of person2
        System.out.println("Age: " + person2.getAge());    // Calls the getAge() method to get the age of person2
    }
}


Dry Run:
Class Definition:

Define a class named person.
Declare two private instance variables: name (String) and age (int).
Constructor:

Define a constructor that takes two parameters (name and age) and assigns them to the corresponding instance variables.
Getter Methods:

Define two getter methods: getName() and getAge() to retrieve the values of name and age respectively.
Main Method:

Inside the main method:
Create two instances of the person class: person1 and person2.
person1 with name "Yogada" and age 23.
person2 with name "Manasi" and age 22.

Print the details of person1:
Print "Person 1:".
Print "Name: Yogada".
Print "Age: 23".
Print a blank line.
Print the details of person2:
Print "Person 2:".
Print "Name: Manasi".
Print "Age: 22".

Output:

Person 1:
Name: Yogada
Age: 23

Person 2:
Name: Manasi
Age: 22
The program successfully creates two instances of the person class with 
different names and ages,and then prints their details.
