/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{
	public static void main(String[] args) //function is another word for method
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick"); //position of letters (quick is from 4-8, index starts at 0)
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase(); // declaring a string, changes all uppercase letters to lowercase
		System.out.println ("sample.toLowerCase() = " + lowerCase); // doesn't permanently change sample. returns a new string, and the original sample remains (example: my hair)
		System.out.println ("After toLowerCase(), sample = " + sample);
				
		//  Try other methods here:
		
		//  Demonstrate the toUpperCase method.
			String upperCase = sample.toUpperCase(); //variables start lowercase
			System.out.println ("sample.toUpperCase() = " + upperCase);
			
			System.out.println(sample.compareTo(lowerCase));
			System.out.println(sample.startsWith(upperCase));
			System.out.println(sample.lastIndexOf(upperCase, position));
		
			
			int notFoundPsn = sample.indexOf("slow"); //if it returns -1, it is false, or not there
			
			//experiment with compareTo --> punctuation, then capitals, then lowercase. going DOWN the list is negative, going UP the list is positive
			String example1 = "U";
			String example2 = "p";
			System.out.println(example1.compareTo(example2)); 
			
			//experiment with substring
			String starter = "start middle end";
			int psn1 = starter.indexOf("middle");
			System.out.println(starter.substring(psn1, psn1+6)); //inclusive, starts printing at 10 to the end, substring is an OVERLOADED METHOD

	}
}
