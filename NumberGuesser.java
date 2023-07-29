package assignment;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

	public static void main(String[] args) {
		
		int turns=1;
		double Number=1;
		int result=0;
        
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int randomnumber=rand.nextInt(100);
		while(turns<=6)
		{
			System.out.println("your turn is "+ turns );
			System.out.println("enter the Number between 1 to 100 ");
			Number=sc.nextDouble();
			if(randomnumber==Number) {
				System.out.println("You win");
				result=1;
				break;
			}
			else if(randomnumber<Number){
				System.out.println("Number is too high...Enter the small Number");
			}
			else if(randomnumber>Number) {
				System.out.println("Number is too low...Enter the high Number");
			}
			else {
				System.out.println("Invalid Input");
			}
			turns++;
		}
		
		if(result==0) {
			System.out.println("you lose ");
			System.out.println("your number is "+ randomnumber);
		}
		
	}

}

