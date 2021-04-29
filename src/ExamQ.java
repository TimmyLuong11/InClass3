/*
 * 02/18/2019
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamQ 
{
	public static void main(String[] args) throws IOException
	{
		System.out.print("\nEnter an integer: \n>> ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		try 
		{
			int someNumber = Integer.parseInt(input);
			someNumber *= 2;
			System.out.format("Your final integer be %d\n", someNumber);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("The input enter was not an integer. Please try again.\n");
		}
	}
}

/*
*In the code above what need to be added for it to loop indefeinly or when the users want to quit 
*a) a do while loop
*b) if else statement 
*c) for loop
*d) while loop
*/