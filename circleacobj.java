//Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute.
//Calculate the area and circumference of the circle.

public class circleacobj {
    private double radius;  // Declares a private instance variable 'radius' to store the radius of the circle
    
    // Constructor to initialize the radius
    public circleacobj(double radius) {
        this.radius = radius;  // Assigns the value of 'radius' parameter to the instance variable 'radius'
    }
    
    // Getter method to retrieve the radius
    public double getRadius() {
        return radius;  // Returns the value of the 'radius' instance variable
    }
    
    // Setter method to set the radius
    public void setRadius(double radius) {
        this.radius = radius;  // Sets the value of the 'radius' instance variable to the specified value
    }
    
    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;  // Returns the area of the circle (π * radius^2)
    }
    
    // Method to calculate the circumference of the circle
    public double calculateCircumference() {
        return 2 * Math.PI * radius;  // Returns the circumference of the circle (2 * π * radius)
    }
    
    // Main method: the entry point of the program
    public static void main(String[] args) {
        // Creating a circle object with radius 5.0
        circleacobj circle = new circleacobj(5.0);
        
        // Calculating area and circumference
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();
        
        // Printing the results
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + circumference);
        
        // Modifying the radius of the circle
        circle.setRadius(7.0);
        
        // Recalculating area and circumference after modifying radius
        area = circle.calculateArea();
        circumference = circle.calculateCircumference();
        
        // Printing the updated results
        System.out.println("\nUpdated Circle Area: " + area);
        System.out.println("Updated Circle Circumference: " + circumference);
    }
}

Dry Run:

Class Definition:

Define a class named circleacobj.
Private Instance Variable:

Declare a private instance variable radius to store the radius of the circle.
Constructor:

Define a constructor that takes a radius parameter and initializes the radius instance variable with the given value.
Getter Method:

Define a getter method getRadius() to retrieve the value of the radius instance variable.
Setter Method:

Define a setter method setRadius(double radius) to set the value of the radius instance variable.
Method to Calculate Area:

Define a method calculateArea() to calculate the area of the circle using the formula π * radius^2.
Method to Calculate Circumference:

Define a method calculateCircumference() to calculate the circumference of the circle using the formula 2 * π * radius.
Main Method:

Inside the main method:
Create a circleacobj object named circle with a radius of 5.0.
Calculate the area and circumference of the circle using the calculateArea() and calculateCircumference() methods.
Print the calculated area and circumference.
Set the radius of the circle to 7.0 using the setRadius() method.
Recalculate the area and circumference of the circle.
Print the updated area and circumference.

Output:
Circle Area: [Area]
Circle Circumference: [Circumference]

Updated Circle Area: [Updated Area]
Updated Circle Circumference: [Updated Circumference]
The program calculates and prints the area and circumference of a circle with an initial radius of 5.0, then updates the radius 
to 7.0 and recalculates and prints the updated area and circumference.
