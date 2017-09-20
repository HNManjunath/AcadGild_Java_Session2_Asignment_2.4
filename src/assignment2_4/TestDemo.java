/**
 * 
 */
package assignment2_4;

/**
 * @author MANJUNATH, This class is to accepts the number as argument and print “You
	Have Entered Zero” if the value is equal to 0 along with the ASCII value of the number.
 *
 */
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class TestDemo {

	// Method to get ASCII value
	public void ascii(int n) throws UnsupportedEncodingException {
		String input = String.valueOf(n); // Converts input number to String
		String asciiValue = "";

		byte[] bytes = input.getBytes("US-ASCII"); // Gets the array of bytes in ASCII for the input String (number)

		for (int i = 0; i < bytes.length; i++) { // Iterating the byte array to form the ASCII
			asciiValue = asciiValue.concat(" ").concat(String.valueOf(bytes[i]));
		}

		if (n == 0) {
			System.out.println("You Have Entered Zero with ASCII value : " + asciiValue);
		} else if (n > 0) {
			System.out.println("You Have Entered Positive Value with ASCII value : " + asciiValue);
		} else {
			System.out.println("You Have Entered Negative Value with ASCII value : " + asciiValue);
		}
	}

	// Main function
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // To get the input from the user

		TestDemo td = new TestDemo(); // creating the Testdemo object.

		try {
			System.out.println("Enter a number : \n");
			td.ascii(input.nextInt()); // Calling the ascii method
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		input.close();
	}

}