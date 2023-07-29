package assignment;

import java.util.Random;
import java.util.Scanner;

public class WordGuesser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int index = random.nextInt(5);
		String[] wordList = {"LAPTOP", "CHARGER","BUTTON","ROUTER","MOUSE"};
		String word = wordList[index];

		
		char[] fillBoxes = new char[word.length()];
		
		for (int i=0; i<fillBoxes.length; i++) {
			fillBoxes[i] = '#';
		}
		
		System.out.println("Thw Word is of " + fillBoxes.length + " Letters");
		Scanner sc = new Scanner(System.in);
		
		
		String wordGuessed = "no";
		int filled = 0;
		
		int lifes = 0;
		while (wordGuessed == "no") {
			String letterFound = "no";
			lifes++;
			System.out.print("Turn: " + lifes + " Guess letter: ");
			char alphabet = sc.next().toUpperCase().charAt(0);
			
			for (int i=0; i<word.length(); i++) {
				if (word.charAt(i) == alphabet && fillBoxes[i] == '#') {
					fillBoxes[i] = alphabet;
					filled++;
					letterFound = "yes";
					break;
				}
			}
			
			if (letterFound == "yes") {
				System.out.println(fillBoxes);
			} else {
				System.out.println("Wrong Guess");
			}
			
			if (filled == fillBoxes.length) {
				System.out.println("\nYou Win");
				break;
			}
			
			if (lifes == 10) {
				wordGuessed = "yes";
				System.out.println("\nYou Lost");
				System.out.println("Word: " + word);
			}
			
		}
		
	}


}
