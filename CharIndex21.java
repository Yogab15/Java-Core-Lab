//Write a Java program to get the character at the given index within the string.
public class CharIndex21 {
    public static void main(String[] args) {
        // Given string
        String str = "Hello, Summer!";
        // Index of the character to access
        int index = 8;

        // Check if the index is within the bounds of the string
        if (index >= 0 && index < str.length()) {
            // Access the character at the specified index
            char charAtIndex = str.charAt(index);
            // Print the character at the specified index
            System.out.println("Character at index " + index + " is: " + charAtIndex);
        } else {
            // If the index is invalid (out of bounds), print a message
            System.out.println("Invalid index");
        }
    }
}

Dry Run:
Initialization:

The program initializes a string variable str with the value "Hello, Summer!".
It also initializes an integer variable index with the value 8, which represents the index of the character to be accessed.
Validity Check:

The program checks if the index is within the bounds of the string using the condition index >= 0 && index < str.length().
Since the length of the string is 13 and the index is 8, the condition is true, and the program proceeds.
Accessing Character:

It accesses the character at index 8 in the string using the charAt() method.
The character at index 8 in the string "Hello, Summer!" is 'S'.

Output:
It prints the character at index 8 along with the index: "Character at index 8 is: S".

End:
The program execution completes.
Output: 
Character at index 8 is: S
The program successfully demonstrates accessing a character at a specific index in a string.
