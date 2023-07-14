package assignment;
import java.util.Scanner;
class TreasureHunt{
	public static void main(String args[]){
		System.out.println("Welcome to treasure Island. Your mission is to find the treasure");
		Scanner sc=new Scanner(System.in);
		System.out.println("left or right?");
		String direction=sc.next();
		if (direction.equalsIgnoreCase("left")){
			System.out.println("swim or wait?");
			String directiontwo=sc.next();
			if (directiontwo.equalsIgnoreCase("wait")){
				System.out.println("Which door?");
				String directionthree=sc.next();
				if (directionthree.equalsIgnoreCase("blue")){
					System.out.println("Eaten by Beasts. Game Over.");
				}
				else if (directionthree.equalsIgnoreCase("yellow")){
					System.out.println("You Win.");
				}
				else if (directionthree.equalsIgnoreCase("red")){
					System.out.println("Burned by fire. Game Over.");
				}
				else{
					System.out.println("Game Over.");
				}
			}
			else{
				System.out.println("Attacked ny trout. Game Over.");
			}
		}
		else{
			System.out.println("Fall into a hole. Game Over.");
		}
	}
}