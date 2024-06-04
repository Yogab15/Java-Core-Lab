//Write a Java program to display the first 10 natural numbers.
package exercise;  // Declares the package name as 'exercise'

public class naturalnum10 {  // Declares a public class named 'naturalnum10'
      
    public static void main(String[] args)  // Main method: the entry point of the program
    {     
        int i;  // Declares an integer variable 'i' for the loop counter
        
        System.out.println ("The first 10 natural numbers are:\n");  // Prints a message indicating the output
        
        // Loop to print the first 10 natural numbers
        for (i = 1; i <= 10; i++)  // Initializes 'i' to 1; continues loop as long as 'i' is less than or equal to 10; increments 'i' by 1 in each iteration
        {      
            System.out.println (i);  // Prints the current value of 'i'
        }
        
        System.out.println ("\n");  // Prints a blank line after printing the numbers
    }
}

Dry run: 
Initialization:

Initialize loop counter i.
Output Message:

Print "The first 10 natural numbers are:".
Loop Execution:

Iterate i from 1 to 10.
Print each value of i.
Output:

Print numbers 1 through 10, each on a new line.
Completion:

Print a blank line.
