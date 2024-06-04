//Write a program in Java to input 5 numbers from the keyboard and find their sum and average.
 
package exercise;  // Declares the package name as 'exercise'

import java.util.Scanner;  // Imports the Scanner class for taking input from the user 

public class sumavgnumof5 {  // Declares a public class named 'sumavgnumof5'
   
    public static void main(String[] args) {  // Main method: the entry point of the program

        int i, n = 0, sum = 0;  // Declares variables for loop counter, current input number, sum, and average
        double avg;  // Declares variable for average as double to store fractional values

        System.out.println("Input the 5 numbers : ");  // Prints a message prompting the user to input 5 numbers
         
        for (i = 0; i < 5; i++) {  // Loop to input 5 numbers
            Scanner in = new Scanner(System.in);  // Creates a new Scanner object for each input
            n = in.nextInt();  // Reads the next integer input from the user
            sum += n;  // Adds the input number to the sum
        }

        avg = sum / 5.0;  // Calculates the average by dividing the sum by 5 (converted to double for fractional results)

        // Prints the sum and average of the 5 numbers
        System.out.println("The sum of 5 numbers is : " + sum + "\nThe Average is : " + avg);
    }
}

Dry Run: 
 
Initialization:
Declare variables: i, n, sum, avg.
sum and avg are initialized to 0.
User Input:
Print "Input the 5 numbers : ".
 
 Loop Execution:
Iterate i from 0 to 4 (inclusive).
Prompt the user to input a number.
Assume the user inputs: 2, 4, 6, 8, 10.
Add each input number to sum.
Sum Calculation:

Sum of input numbers: 2 + 4 + 6 + 8 + 10 = 30.
Average Calculation:

Average: 30 / 5 = 6.0.
Output:

Print "The sum of 5 numbers is : 30".
Print "The Average is : 6.0".
