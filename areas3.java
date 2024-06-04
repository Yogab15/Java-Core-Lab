//Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, 
//and override the calculateArea() method to calculate and return the area of each shape.
package exercise;

// Abstract base class Shape
abstract class Shape {
    // Abstract methods to draw shape and calculate area
    public abstract void draw();
    public abstract double calculateArea();
}

// Circle class inheriting from Shape
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of draw method for Circle
    public void draw() {
        System.out.println("Drawing Circle");
    }

    // Implementation of calculateArea method for Circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Square class inheriting from Shape
class Square extends Shape {
    private double side;

    // Constructor
    public Square(double side) {
        this.side = side;
    }

    // Implementation of draw method for Square
    public void draw() {
        System.out.println("Drawing Square");
    }

    // Implementation of calculateArea method for Square
    public double calculateArea() {
        return side * side;
    }
}

// Triangle class inheriting from Shape
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementation of draw method for Triangle
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    // Implementation of calculateArea method for Triangle
    public double calculateArea() {
        return 0.6 * base * height;
    }
}

// Main class to test the implementation
public class areas3 {
    public static void main(String[] args) {
        // Creating instances of Circle, Square, and Triangle
        Circle circle = new Circle(4);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 5);

        // Calling draw method for each shape
        circle.draw();
        square.draw();
        triangle.draw();

        // Printing areas of each shape
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}

Dry Run:
Initialization of Shapes:

Creates instances of Circle, Square, and Triangle with specified dimensions.
Draw Shapes:

Calls the draw() method for each shape, printing the shape being drawn.
Calculate Areas:

Calls the calculateArea() method for each shape, printing the calculated area.
Output
The expected output of the program is:
 
Drawing Circle
Drawing Square
Drawing Triangle
Area of Circle: 50.26548245743669
Area of Square: 16.0
Area of Triangle: 9.0
