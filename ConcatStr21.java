//Write a Java program to concatenate a given string to the end of another string.
public class ConcatStr21 {
    public static void main(String[] args) {
        // Original string
        String originalString = "Hello,";
        // String to append
        String appendString = "Summer!:)"; 
        // Concatenate the original string with the appended string
        String concatenatedString = originalString.concat(appendString);

        // Print the concatenated string
        System.out.println("Concatenated String: " + concatenatedString);
    }
}

Dry Run:
Concatenated String: Hello,Summer!
The program successfully demonstrates string concatenation by appending one string to another.
 
