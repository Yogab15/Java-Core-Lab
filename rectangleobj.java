//Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.
public class rectangleobj {  // Declares a public class named 'rectangleobj'
    private double width;  // Declares a private instance variable 'width' to store the width of the rectangle
    private double height;  // Declares a private instance variable 'height' to store the height of the rectangle
    
    // Constructor to initialize width and height
    public rectangleobj(double width, double height) 
    {
        this.width = width;  // Assigns the value of 'width' parameter to the instance variable 'width'
        this.height = height;  // Assigns the value of 'height' parameter to the instance variable 'height'
    }
    
    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return width * height;  // Returns the area of the rectangle (width * height)
    }
    
    // Method to calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (width + height);  // Returns the perimeter of the rectangle (2 * (width + height))
    }
}

Dry Run:
Object Creation:

Create an object myRectangle of the class rectangleobj with width 5 and height 4.
Area Calculation:

Call the calculateArea() method on myRectangle.
Calculate area: 5 * 4 = 20.
Store the result in the variable area.
Perimeter Calculation:

Call the calculatePerimeter() method on myRectangle.
Calculate perimeter: 2 * (5 + 4) = 2 * 9 = 18.
Store the result in the variable perimeter.
Output:

Print "Area of the rectangle: 20".
Print "Perimeter of the rectangle: 18".
