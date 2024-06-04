//Write a Java program to test if a given string contains the specified sequence of char values
package exercise;
public class SeqChar
{
    public static void main(String[] args) 
    {
        // Given string
        String str = "Hello,Summer!";
        // Sequence to search for
        String sequence = "Sum"; 
        // Check if the string contains the sequence
        boolean containsSequence = str.contains(sequence); 

        // Check the result and print appropriate message
        if (containsSequence) {
            System.out.println("The string \"" + str + "\" contains the sequence \"" + sequence + "\".");
        } else {
            System.out.println("The string \"" + str + "\" does not contain the sequence \"" + sequence + "\".");
        }
    }
}

Dry run:
The string "Hello,Summer!" contains the sequence "Sum".
The program successfully demonstrates checking if a string contains a specific sequence of characters.

