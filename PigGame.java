package assignment;

import java.util.Scanner;
public class PigGame {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int targetScore = 20;      
        int scores = 0;
        System.out.println("Welcome to Pig Game!");
        System.out.println("Your Target Score is " + targetScore);
        
        while (true) {            
            int turnScore = takeTurn(scanner);
            if (turnScore == 0) {                
                System.out.println("Oops! You rolled a 1 and lost your points for this turn.");
            } 
            else {                
                scores += turnScore;
                System.out.println("Turn Score " + turnScore);                
                System.out.println("Total Score: " + scores);
            }

            if (scores >= targetScore) {                
                System.out.println("You reach the Target");
                break;            
            }
            System.out.println();       
        }
    }

    private static int takeTurn(Scanner scanner) {        
        int turnScore = 0;
        while (true) {            
            System.out.println("Press 'R' to roll the dice or 'H' to hold.");
            String input = scanner.next().trim().toLowerCase();
            if (input.equals("r")) {               
                int roll = (int) (Math.random() * 6) + 1;
                System.out.println("You rolled a " + roll);
                if (roll == 1) {                    
                    turnScore = 0;
                    break;                
                } 
                else {
                    turnScore += roll;                
                }
            } 
            else if (input.equals("h")) {                
                break;
            } 
            else {                
                System.out.println("Invalid input. Please try again.");
            }
        }        
        return turnScore;
    }
}