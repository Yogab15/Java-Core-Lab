//Write a Java program to compare a given string to the specified character sequence.
package exercise;

public class CompareStr21
{
    public static void main(String[] args)
    {
        // Given string
        String str = "Hello,Summer!";
        // Sequence to compare with
        String sequence = "Summer"; 
        // Check if the string is equal to the sequence
        boolean isEqual = str.equals(sequence);

        // Check the result and print appropriate message
        if (isEqual) 
        {
            System.out.println("The string \"" + str + "\" is equal to the sequence \"" + sequence + "\".");
        } else
        {
            System.out.println("The string \"" + str + "\" is not equal to the sequence \"" + sequence + "\".");
        }
    }
}

 Dry Run:
 The string "Hello,Summer!" is not equal to the sequence "Summer".

