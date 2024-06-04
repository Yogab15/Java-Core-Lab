//Write a Java program to check whether a given string ends with another string.
package exercise;
public class CheckEndStr21
{
    public static void main(String[] args) 
    {
        // Given string
        String str = "Hello, Summer!";
        // Sequence to check for at the end
        String endSequence = "Summer!";

        // Check if the string ends with the specified sequence
        boolean endsWithSequence = str.endsWith(endSequence); 
        
        // Print the result based on whether the string ends with the sequence or not
        if (endsWithSequence)
        {
            System.out.println("The string \"" + str + "\" ends with the sequence \"" + endSequence + "\".");
        }
        else
        {
            System.out.println("The string \"" + str + "\" does not end with the sequence \"" + endSequence + "\".");
        }
    }
}

Dry Run :
The string "Hello, Summer!" ends with the sequence "Summer!".

