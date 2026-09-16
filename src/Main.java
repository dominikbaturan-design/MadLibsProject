/*******************************
 * Name: Your name
 * Class: ICS3U
 * Date:Friday Sept 18
 * Project Name: MadLibs
 * 
 * Project Description
 * You will read in multiple entries from the user and store the results in variables
 * You will then insert those variables into the following story to create a MadLib style result
 * 
 * A recent survey informs us that one out of every PLURALNOUN1 owns a/an ADJECTIVE1 phone. 
 * Fortunately, VERB_ING_1 over a mobile NOUN1 in recent years has improved ADVERB1. 
 * Today, BODY_PART1-held PLURALNOUN2 are all the rage. 
 * In restaurants, you find many PLURALNOUN3 talking ADVERB2 into their ADJECTIVE2 phones as they eat their NOUN2. 
 * NUMBER1 percent of American PLURALNOUN4 place their NOUN3 calls from their cars as they are VERB_ING_2 to and from their home, office, or NOUN4. 
 * Walking and talking are now the “in” NOUN5 to do. 
 * Over NUMBER2 percent of Americans walk our ADJECTIVE3 streets with a handheld PLURALNOUN5 pressed against their BODYPART2.
 * 
 * Ask for the capitalized words in the input. Print out the full story in the output.
 * See https://www.thewordfinder.com/wordlibs/story/41/ for an example.
 ********************************/
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// YOUR CODE GOES HERE!!!!
		
		System.out.println(" Give me a pluralNoun: " );
		String pluralNoun = in.nextLine();
		System.out.println(" Give me an adjective: ");
		String adjective = in.nextLine();
		System.out.println(" Give me a verb ending in \"ing\": ");
		String verb = in.nextLine();
		System.out.println(" Give me a second noun: ");
		String N2 = in.nextLine();
		System.out.println(" Give me a second verb ending in \"ing\":");
		String V2 = in.nextLine();
		System.out.println(" Give me a number ending in \"th:\" ");
		String num = in.nextLine();
		System.out.println(" Give me a second adjective:");
		String A2 = in.nextLine();
		System.out.println(" Give me a third noun:");
		String N3 = in.nextLine();
		System.out.println(" Give me a food:");
		String food = in.nextLine();
		System.out.println(" Give me a number:");
		int number = in.nextInt();
		in.nextLine();
		System.out.print("I love "+pluralNoun+", I usually enjoy it while " +verb+ ". The other day, while I was " +V2+ ", I found a " +N2+ " that was " +adjective+ ", and it realy scared me. After my " +num+ " birthday, I got a " +N3+" which was " +A2+", it was deliciouse. Now before you think I am crazy, I did have some " +food+ " earlier. Though I didn't over eat, I only had " +number+ ".");
		
		
		
		
		
		
		
		
		in.close();//Don't forget to clean up after yourselves!
	}

}
