import java.util.Scanner;

import java.util.Random;


public class GuessingGame
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to the land of wonder");
        System.out.println("Please Enter your name!");

        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println("Hello,"+name);

        System.out.println("Shall we start?");
        System.out.println("\t1.Yes");
        System.out.println("\t2.No");

        int beginAnswer = scanner.nextInt();

        while (beginAnswer!=1)
        {
            System.out.println("Shall we start?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");

            beginAnswer = scanner.nextInt();
        }

        Random rand = new Random();
        int x  = rand.nextInt(20) + 1;

        System.out.println("Guess a number! ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while(!shouldFinish)
        {
            timesTried++;

            if(timesTried < 5)
            {
                if(userInput == x)
                {
                    hasWon =true;
                    shouldFinish = true;
                }
                else if(userInput > x)
                {
                    System.out.println("Guess Lower");
                    userInput = scanner.nextInt();
                }
                else
                {
                    System.out.println("Guess Higher!");
                    userInput = scanner.nextInt();
                }
            }
            else
            {
                shouldFinish = true;
            }
        }

       if(hasWon)
       {
           System.out.println("Congratulations! You have guessed it in your " + timesTried + " tries");
       }
       else
       {
           System.out.println("Game Over !");
           System.out.println("The number was " + x);
       }
    }
}





























