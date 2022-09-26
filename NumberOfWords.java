import java.util.Scanner;

public class NumberOfWords {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		
		System.out.println("Enter your string: ");
		String sentence = input.nextLine();
		
		for( int i = 0; i < sentence.length(); i++ ) {
			if( sentence.charAt(i) == ' ' ) {
				counter++;
			}
		}
		System.out.println("Number of words in the string: " + (counter + 1));
		
		
	}
}