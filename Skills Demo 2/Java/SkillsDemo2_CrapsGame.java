package skillsdemo2_crapsgame;

import java.util.Random;

public class SkillsDemo2_CrapsGame {

    public static void main(String[] args) {        
        System.out.println("WELCOME TO A GAME OF CRAPS!");
        play();
        
    }
    
    //A method that will handle the rng. Everytime the player needs to roll the dice this method will be called.
    public static int rollDice(int randNum) {
       
        //Create a new instance of Random as rand
        Random rand = new Random();
        //randNum will be given the value of a random number between 0 and 11, then add 1 to that number, so that it will produce a number range of 1-12
        randNum = rand.nextInt(12) + 1;
        
        return randNum;
    }
    
    public static void play(){
        
        int diceRollNum = 0, diceRoll = rollDice(diceRollNum), point, newPoint;
        point = diceRoll;
        newPoint = rollDice(diceRollNum);
        
        //Check wether user rolled a 7 or an 11
        if(diceRoll == 7 || diceRoll == 11){           
            System.out.println("Point: " + point);
            System.out.println("------------------------------");
            
            //If true print message congratulating them, with their number
            System.out.println("Congrats you won with a " + diceRoll);            
        }
        else if(diceRoll == 2 || diceRoll == 3 || diceRoll == 12){
            System.out.println("Point: " + point);
            System.out.println("------------------------------");           
            
            
            System.out.println("Sorry you lost. You rolled a " + diceRoll);
        }
        else{

            
            System.out.println("Point: " + point);
            System.out.println("-----------------------------------------");
            
            while(point != newPoint || point == newPoint){
               //Checks if the user can win
                if(point == newPoint){
                    System.out.println("Your new roll: " + newPoint + "\t\t Win");
                    break;
                }
                //Checks if the user has lost
                else if(newPoint == 7){
                    System.out.println("Your new roll: " + newPoint + "\t\t Lose");
                    break;
                }
                //Check if user needs to roll again
                else{
                    System.out.println("Your new roll: " + newPoint + "\t\t No help");            
                }
                
                //Re-Roll Dice to get newPoint
                newPoint = rollDice(diceRollNum);
            }
        }
    }
}