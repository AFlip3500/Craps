
/**
 * Write a description of class Craps here.
 *
 * @author (Andrew Filippone)
 * @version (2021-1-11)
 */
import java.util.Scanner;
public class Craps
{
    public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.println("Do you want to play craps? (y/n)");
       String answer = in.nextLine();
       if (answer.equals("y"))
       {
            System.out.println("Do you need the instructions? (y/n)");
            String instructions = in.nextLine();
            if (instructions.equals("y"))
            {
                System.out.println("A player rolls two six-sided dice and adds the numbers rolled together.");
                System.out.println("On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over");
                System.out.println("If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the point.");
                System.out.println("The player continues to roll the two dice again until one of two things happens:");
                System.out.println("either they roll the point from that first roll again, in which case they win; or they roll a 7, in which case they lose.");
            }
            Die d1 = new Die();
            Die d2 = new Die();
            int firstroll = d1.rollDie() + d2.rollDie();
            System.out.println("Press enter to roll");
            String rolling = in.nextLine();
            System.out.println("You rolled " + d1.getRoll() + " and " + d2.getRoll() + " for a total of " + firstroll);
            if (firstroll == 7 || firstroll == 11)
            {
                System.out.println("Congrats you win!");
            }
            else if (firstroll == 2 || firstroll == 3 || firstroll == 12) 
            {
                System.out.println("Sorry you lose...");
            }
            else
            {
                int point = firstroll;
                int secondRoll = d1.rollDie() + d2.rollDie();          
                System.out.println("Press enter to roll");
                String rolling2 = in.nextLine();
                System.out.println("You rolled: " + d1.getRoll() + " and " + d2.getRoll() + " for a total of " + secondRoll);
                if (secondRoll == point)
                {
                    System.out.println("Congrats you win!");
                }
                else
                {
                    System.out.println("Sorry you lose...");
                }
            }
            
       } 
       else
       {
           System.out.println("Thank you for playing!");
       }
        
     }
 }
