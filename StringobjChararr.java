//Write a Java program to create a String object with a character array.
package exercise;

public class StringobjChararr 
{ 
	    public static void main(String[] args)
	    {
	        // Creating a character array
	        char[] charArray = {'H', 'e', 'l', 'l', 'o', ',', ' ', 'S', 'u', 'm', 'm', 'e', 'r','!'};

	        // Create a String object using the character array
	        String str = new String(charArray);

	        // Printing the String object
	        System.out.println("String created with character array: " + str);
	    }
	}
 
Dry run:
String created with character array: Hello, Summer!
