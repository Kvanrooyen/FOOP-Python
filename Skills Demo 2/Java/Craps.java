package skillsdemotwocrapsgameclass;
import java.util.Random;
import java.util.Scanner;

public class Craps {

 public static void main(String[] args) {
  Scanner userInput = new Scanner(System.in);
  String ans = ""; //Decalre variable for use in play again loop
  boolean game = true;
  while (game == true) {
   RandomNumber diceRoll = new RandomNumber(); //Create instance diceRoll of class RandomNumber
   play playGame = new play(); //Create instance playGame of class play

   //Initialise variables from play class
   playGame.diceRoll = diceRoll.randNum;
   playGame.point = playGame.diceRoll;
   playGame.newPoint = diceRoll.randNum;


   System.out.println("\nWELCOME TO A GAME OF CRAPS!");

   if (playGame.diceRoll == 7 || playGame.diceRoll == 11) {
    //Show the users point
    System.out.println("Point: " + playGame.point);
    System.out.println("-----------------------------------------");

    //Tell user they won
    System.out.println("Congratulations you won, with a " + playGame.diceRoll);
    System.out.println("\nWould you like to play again? [Y/N]\n");
    ans = userInput.next();
    if (ans.equals("n") || ans.equals("N")) {
     game = false;
    } else if (ans.equals("y") || ans.equals("Y")) {
     game = true;
    } else {
     System.out.println("Error! PLease enter either Y or N.");
     System.out.println("\nWould you like to play again? [Y/N]\n");
     ans = userInput.nextLine();
    }

   } else if (playGame.diceRoll == 2 || playGame.diceRoll == 3 || playGame.diceRoll == 12) {
    //Show the users point
    System.out.println("Point: " + playGame.point);
    System.out.println("-----------------------------------------");

    //Tell the user they lost
    System.out.println("Sorry you lost, with a " + playGame.diceRoll);
    System.out.println("\nWould you like to play again? [Y/N]\n");
    ans = userInput.next();
    if (ans.equals("n") || ans.equals("N")) {
     game = false;
    } else if (ans.equals("y") || ans.equals("Y")) {
     game = true;
    } else {
     System.out.println("Error! PLease enter either Y or N.");
     System.out.println("\nWould you like to play again? [Y/N]\n");
     ans = userInput.nextLine();
    }

   } else {
    System.out.println("Point: " + playGame.point);
    System.out.println("-----------------------------------------");

    while(playGame.point != playGame.newPoint || playGame.point == playGame.newPoint) {
     /*
     BUG: (2/2/19)
         User will receive their original roll again, causing them to always win

     FIX: (27/2/19)
         Added method to RandomNumber class, to generate a new number. Then call it before the next move
     */

     //Roll dice again for the new point
     diceRoll.Roll(); //Gets new random number
     playGame.newPoint = diceRoll.randNum; //Sets the newPoint variable, to be given value of the new random number

     //Checks if the user can win
     if (playGame.point == playGame.newPoint) {
      System.out.println("Your new roll: " + playGame.newPoint + "\t\t Win");

      System.out.println("\nWould you like to play again? [Y/N]\n");
      ans = userInput.next();
      if (ans.equals("n") || ans.equals("N")) {
       game = false;
      } else if (ans.equals("y") || ans.equals("Y")) {
       game = true;
      } else {
       System.out.println("Error! PLease enter either Y or N.");
       System.out.println("\nWould you like to play again? [Y/N]\n");
       ans = userInput.nextLine();
      }
      break;
     }
     //Checks if the user has lost
     else if (playGame.newPoint == 7) {
      System.out.println("Your new roll: " + playGame.newPoint + "\t\t Lose");

      /*
      BUG: (27/2/19)
          The while loop would not terminate even if user, did not want to play again.
          This occured everytime the user won or lost, and asked if they wanted to play again.
      FIX: (27/2/19)
          Changed condition in if statement to be .equals instead of ==
      */
      System.out.println("\nWould you like to play again? [Y/N]\n");
      ans = userInput.next();
      if (ans.equals("n") || ans.equals("N")) {
       game = false;
      } else if (ans.equals("y") || ans.equals("Y")) {
       game = true;
      } else {
       System.out.println("Error! PLease enter either Y or N.");
       System.out.println("\nWould you like to play again? [Y/N]\n");
       ans = userInput.nextLine();
      }
      break;
     }
     //Check if user needs to roll again
     else {
      System.out.println("Your new roll: " + playGame.newPoint + "\t\t No help");
     }

    }
   }
  }
 }
}

class RandomNumber {
 Random rand = new Random();
 int randNum = rand.nextInt(12) + 1;
 void Roll() {
  randNum = rand.nextInt(12) + 1;
 }

}

class play {
 int diceRoll, point, newPoint;
}