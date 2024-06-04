//Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name

package exercise;  // Declares the package name as 'exercise'

import java.util.Scanner;  // Imports the Scanner class for taking input from the user

public class weekday7  // Declares a public class named 'weekday7'
{
    public static void main(String[] args)  // Main method: the entry point of the program
    {
        Scanner in = new Scanner(System.in);  // Creates a Scanner object 'in' to read input from the console
        System.out.print("Input number: ");  // Prompts the user to input a number
        int day = in.nextInt();  // Reads the integer input from the user and stores it in 'day'

        System.out.println(getDayName(day));  // Calls the 'getDayName' method and prints the returned day name
    }

    // Method to get the name of the day based on the given number
    public static String getDayName(int day) {
        String dayName = "";  // Initializes an empty string 'dayName' to store the day name

        // Switch statement to match the input 'day' with the corresponding day of the week
        switch (day) {
            case 1: dayName = "Monday";  // Assigns "Monday" to 'dayName' if 'day' is 1
                    break;
            case 2: dayName = "Tuesday";  // Assigns "Tuesday" to 'dayName' if 'day' is 2
                    break;
            case 3: dayName = "Wednesday";  // Assigns "Wednesday" to 'dayName' if 'day' is 3
                    break;
            case 4: dayName = "Thursday";  // Assigns "Thursday" to 'dayName' if 'day' is 4
                    break;
            case 5: dayName = "Friday";  // Assigns "Friday" to 'dayName' if 'day' is 5
                    break;
            case 6: dayName = "Saturday";  // Assigns "Saturday" to 'dayName' if 'day' is 6
                    break;
            case 7: dayName = "Sunday";  // Assigns "Sunday" to 'dayName' if 'day' is 7
                    break;
            default: dayName = "Invalid day range";  // Assigns "Invalid day range" if 'day' is outside the range 1-7
        }

        return dayName;  // Returns the day name
    }
}

Dry Run:
Initialization:
Create Scanner in object.

User Input:
Assume user enters 3.

Method Call:
getDayName(3) is called.

Switch Statement:
switch (3):
Matches case 3, so dayName = "Wednesday";.

Return Value:
dayName is "Wednesday".

Output:
Print "Wednesday".

