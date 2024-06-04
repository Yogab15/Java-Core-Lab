//Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw the respective shape. 
//In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder.
abstract class Shape {
    // Abstract methods to draw the shape and calculate area
    public abstract void draw();
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    // Constructor for Circle
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

class Cylinder extends Circle {
    private double height;

    // Constructor for Cylinder
    public Cylinder(double radius, double height) {
        super(radius); // Call to superclass constructor
        this.height = height;
    }

    // Override draw method for Cylinder
    public void draw() {
        System.out.println("Drawing Cylinder");
    }

    // Override calculateArea method for Cylinder
    public double calculateArea() {
        // Calculate total surface area of Cylinder using formula
        return 2 * super.calculateArea() + 2 * Math.PI * getRadius() * height;
    }

    // Helper method to get the radius
    private double getRadius() {
        return super.radius;
    }
}

public class inheritshape {
    public static void main(String[] args) {
        // Create instances of Circle and Cylinder
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(3, 6);

        // Draw shapes and calculate areas
        circle.draw();
        cylinder.draw();
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Total Surface Area of Cylinder: " + cylinder.calculateArea());
    }
}

Dry Run:

Initialization of Shapes:
Creates instances of Circle and Cylinder with specified dimensions.
Draw Shapes:
Calls the draw() method for each shape, printing the shape being drawn.
Calculate Areas:
Calls the calculateArea() method for each shape, printing the calculated area.
Output:
The expected output of the program is:
Drawing Circle
Drawing Cylinder
Area of Circle: 78.53981633974483
Total Surface Area of Cylinder: 131.94689145077132

