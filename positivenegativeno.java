//Write a Java program to get a number from the user and print whether it is positive or negative.
package exercise;  // Declares the package name as 'exercise'

import java.util.Scanner;  // Imports the Scanner class for taking input from the user
 
public class numberpn  // Declares a public class named 'numberpn'
{  
    public static void main(String[] args)   // Main method: the entry point of the program
    {  
        int num;  // Declares an integer variable 'num' to store the user's input
        
        Scanner sc = new Scanner(System.in);  // Creates a Scanner object 'sc' to read input from the console
        System.out.print("Enter a number: ");  // Prompts the user to enter a number
        
        num = sc.nextInt();  // Reads the next integer input from the user and stores it in 'num'
        
        // Checks if the number is greater than 0
        if(num > 0)  
        {  
            System.out.println("The number is positive.");  // Prints "The number is positive." if 'num' is greater than 0
        }  
        // Checks if the number is less than 0
        else if(num < 0)  
        {  
            System.out.println("The number is negative.");  // Prints "The number is negative." if 'num' is less than 0
        }  
        // Executes when the above two conditions (num > 0 and num < 0) are false, meaning 'num' is 0
        else  
        {  
            System.out.println("The number is zero.");  // Prints "The number is zero." if 'num' is 0
        }  
    }  
}  


Dry Run:
Initialization:
Declare int num;
Create Scanner sc object.

User Input:
Print "Enter a number: ".
Assume user enters 5.
num is assigned the value 5.

Condition Check:
if (num > 0) evaluates to true because 5 > 0.

Output:
Print "The number is positive.".
