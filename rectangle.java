//Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides 
//the getArea() method to calculate the area of a rectangle.
package exercise;
class Shape 
{
    // Method to get area (returns 0 for the base class)
    public double getArea()
    {
        return 0; 
    }
}

class Rectangle extends Shape 
{
    // Declare private instance variables for length and width of the rectangle
    private double length;
    private double width;

    // Constructor to initialize length and width of the rectangle
    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    // Overriding getArea method to calculate area of rectangle
    @Override
    public double getArea() {
        return length * width;  // Returns the area of the rectangle (length * width)
    }
}

public class aayat  
{
    public static void main(String[] args)
  {
        // Creating an instance of Rectangle with length 4 and width 6
        Rectangle rectangle = new Rectangle(4,6);
        // Printing the area of the rectangle
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}


Dry Run:
Shape Class:

Define a class named Shape.
Contains a method getArea() which returns 0. This method serves as a placeholder for getting the area of any shape.
Rectangle Class:

Define a class named Rectangle which extends Shape.
Declares private instance variables length and width to represent the dimensions of the rectangle.
Provides a constructor to initialize the length and width of the rectangle.
Overrides the getArea() method inherited from Shape to calculate the area of the rectangle using the formula length * width.
Main Class:

Contains the main method, the entry point of the program.
Creates an instance of Rectangle named rectangle with length 4 and width 6.
Calls the getArea() method of the rectangle object to calculate and print the area of the rectangle.
Prints the message "Area of the rectangle: " followed by the result of rectangle.getArea().
Output: 
Area of the rectangle: 24.0
The program successfully creates a rectangle object, calculates its area, and prints the result.
