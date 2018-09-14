/*
 * magpie.runner is static. It's one launch/one static method that creates an 
 * instance of a Magpie
 * magpie.runner creates a copy of the Magpie class. the runner just instantiates, 
 * or creates a copy of the Magpie, and allows you to interact with it 
*/



import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie maggie = new Magpie();
		
		System.out.println (maggie.getGreeting()); //i get a greeting
		Scanner in = new Scanner (System.in); //allows me to type something in
		String statement = in.nextLine();
		
		while (!statement.equals("Bye")) // typing "Bye" ends the loop
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}