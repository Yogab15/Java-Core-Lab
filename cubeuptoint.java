package exercise;  // Declares the package name as 'exercise'

import java.util.Scanner;  // Imports the Scanner class for taking input from the user

public class cubeuptoint {  // Declares a public class named 'cubeuptoint'
   
    public static void main(String[] args) {  // Main method: the entry point of the program

        int i, n;  // Declares variables for loop counter 'i' and the number of terms 'n'

        System.out.print("Input number of terms : ");  // Prompts the user to input the number of terms
        Scanner in = new Scanner(System.in);  // Creates a Scanner object 'in' to read input from the console
        n = in.nextInt();  // Reads the integer input from the user and stores it in 'n'

        // Loop to calculate and print the cube of each number from 1 to 'n'
        for(i = 1; i <= n; i++) {  // Initializes 'i' to 1; continues loop as long as 'i' is less than or equal to 'n'; increments 'i' by 1 in each iteration
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i * i * i));  // Prints the current number 'i' and its cube
        }
    }
}

Dry Run:
Initialization:

Declare variables: i, n.
User Input:

Print "Input number of terms : ".
Assume the user inputs: 4.
Loop Execution:

Iterate i from 1 to 4.
Calculate the cube of each number (i) and print it.
For i = 1: Print "Number is : 1 and cube of 1 is : 1".
For i = 2: Print "Number is : 2 and cube of 2 is : 8".
For i = 3: Print "Number is : 3 and cube of 3 is : 27".
For i = 4: Print "Number is : 4 and cube of 4 is : 64".
Output:

Print the cube of each number from 1 to 4:
csharp
Copy code
Number is : 1 and cube of 1 is : 1
Number is : 2 and cube of 2 is : 8
Number is : 3 and cube of 3 is : 27
Number is : 4 and cube of 4 is : 64
The program successfully calculates and prints the cube of each number from 1 to 4.
