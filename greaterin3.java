//Write a Java program that takes three numbers from the user and prints the greatest number.
package exercise;  // Declares the package name as 'exercise'

import java.util.Scanner;  // Imports the Scanner class for taking input from the user
 
public class greaterin3  // Declares a public class named 'greaterin3'
{  
    public static void main(String[] args)  // Main method: the entry point of the program
    {
        Scanner in = new Scanner(System.in);  // Creates a Scanner object 'in' to read input from the console
       
        System.out.print("Input the 1st number: ");  // Prompts the user to input the first number
        int num1 = in.nextInt();  // Reads the first integer input from the user and stores it in 'num1'
       
        System.out.print("Input the 2nd number: ");  // Prompts the user to input the second number
        int num2 = in.nextInt();  // Reads the second integer input from the user and stores it in 'num2'
       
        System.out.print("Input the 3rd number: ");  // Prompts the user to input the third number
        int num3 = in.nextInt();  // Reads the third integer input from the user and stores it in 'num3'
       
        // Checks if the first number is greater than the second number
        if (num1 > num2)
            // Checks if the first number is also greater than the third number
            if (num1 > num3)
                System.out.println("The greatest: " + num1);  // Prints the first number if it is the greatest
       
        // Checks if the second number is greater than the first number
        if (num2 > num1)
            // Checks if the second number is also greater than the third number
            if (num2 > num3)
                System.out.println("The greatest: " + num2);  // Prints the second number if it is the greatest
       
        // Checks if the third number is greater than the first number
        if (num3 > num1)
            // Checks if the third number is also greater than the second number
            if (num3 > num2)
                System.out.println("The greatest: " + num3);  // Prints the third number if it is the greatest
    }
}

 
Dry Run: 

Initialization:
Create Scanner in object.

User Input:
Assume user enters 3, 7, and 5 for the first, second, and third numbers respectively.

Conditional Checks:
if (num1 > num2) is true (3 > 7 is false), so it doesn't execute.
if (num2 > num1) is true (7 > 3 is true).
if (num2 > num3) is true (7 > 5 is true), so it prints "The greatest: 7".

Output:
Print "The greatest: 7".
