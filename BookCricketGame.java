package assignment;

import java.util.Scanner;
import java.util.Random;

public class BookCricketGame {

	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            Random random = new Random();
            int randomnumber;

            int point1 = 1;
            int score1 = 0;
            int round1 = 0;

        
            System.out.print("Enter 1st player name: ");
            String player1 = sc.next();
            System.out.print("Enter 2nd player name: ");
            String player2 = sc.next();

            System.out.print("\nPlayer: " +  player1 + "\n");
            while (point1 != 0){
                round1 ++;
                System.out.print("Enter 1 to open a Book: ");
                int bookdec = sc.nextInt();
                if (bookdec==1){
                    randomnumber = random.nextInt(300);
                    System.out.print("Page no. " + randomnumber + "\t\t");
                    point1 = randomnumber % 7;
                    System.out.print("Points: " + point1 + "\t\t");
                    score1 = score1 + point1;
                    System.out.print("Score: " + score1 + "\t\t");
                    System.out.print("\n");
                }
            }

            System.out.println( player1 + " Total score: " + score1);
            System.out.println( player1 + " Rounds " + round1 + "\n");

            System.out.println("------------------------------------------------------------\n");

            
            int point2 = 1;
            int score2 = 0;
            int round2 = 0;

            System.out.print("Player: " +  player2 + "\n");
            for (round2=1; round2<=round1; round2++){
                System.out.print("Enter 1 to open a Book: ");
                int bookdec = sc.nextInt();
                if (bookdec==1){
                    randomnumber = random.nextInt(300);
                    System.out.print("Page no. " + randomnumber + "\t\t");
                    point2 = randomnumber % 7;
                    System.out.print("Points: " + point2 + "\t\t");
                    score2 = score2 + point2;
                    System.out.print("Score: " + score2 + "\t\t");
                    System.out.print("\n");
                    if (point2==0 || score2>=score1){
                        break;
                    }
                }
            }

            System.out.println( player2 + " Total score: " + score2);
            System.out.println( player2 + " Rounds " + (round2+1) + "\n");

            System.out.println("------------------------------------------------------------\n");

            if (score1 > score2){
                System.out.println(player1 + " WINS");
            } else if (score2 > score1){
                System.out.println(player2 + " WINS");
            } else if (score1 == score2){
                if (round2 < round1){
                    System.out.println(player2 + " WINS");
                } else if (round1 < round2){
                    System.out.println(player1 + " WINS");
                }
                else {
                    System.out.println(player1 + " and " + player2 + " TIE ");
                }
            }

        }
    

}
