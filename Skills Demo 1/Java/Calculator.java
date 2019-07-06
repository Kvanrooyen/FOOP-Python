package skillsdemoone;
import java.util.Scanner;

public class Calculator {
  
    public static void main(String[] args) {     
        //Declaring variables to be used for calculations
        String numOperation;
        Boolean isAdd, isSub, isDiv, isMulti;
        int firstNumber, secondNumber;
                
        //Create a new scanner class with the name userInput
        Scanner userInput = new Scanner(System.in);
        
        //Creating a heading using print statements
        System.out.println("  _   _   _   _   _   _   _   _   _   _  ");
        System.out.println(" / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ / \\ ");
        System.out.println("( C | a | l | c | u | l | a | t | o | r )");
        System.out.println(" \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ \\_/ ");
        
        //Ask the user to type in their first number, and then we store it in the variable firsNumber
        System.out.println("\nPlease enter your first number: ");
        firstNumber = userInput.nextInt();
        
        //Ask the user to choose a operation and take the value and store it in numOperation
        System.out.println("Please enter your operation (+ - * /): ");
        numOperation = userInput.next();
        
        //Ask the user to type in their second number, and then we store it in the variable secondNumber
        System.out.println("Please enter your second number: ");
        secondNumber = userInput.nextInt();
        
        
        //Decalre variables to be used in comparison with what the users operation was
        isAdd = numOperation.equals("+");
        isSub = numOperation.equals("-");
        isDiv = numOperation.equals("/");
        isMulti = numOperation.equals("*");
            
        
        /*
        
        All calculations are to be done in the below if statements. The variables created above will be used to determine what calculation to use.
        There were some bugs that caused the program not be able to add numbers that are bigger than an int can store; Not receving a decimal when doing a calculation wich had one in the answer
        
        */
        if(isAdd){
                if((long)firstNumber + (long)secondNumber > 2147483647 || (long)firstNumber + (long)secondNumber > -2147483647){
                    //BUG: would receive negative value after trying to add a number greater than an int
                    //Solution: Logic erro. Removed the variable that did the calculation
                    System.out.println("Your answer is: " + ((long)firstNumber + (long)secondNumber));
                }
                else{
                    System.out.println("Your answer is: " + (firstNumber + secondNumber));
                }
            }
            else if(isSub){
                
                if((long)firstNumber - (long)secondNumber > 2147483647 || (long)firstNumber - (long)secondNumber > -2147483647 ){
                     System.out.println("Your answer is: " + ((long)firstNumber - (long)secondNumber));
                }
                else{
                    System.out.println("Your answer is: " + (firstNumber - secondNumber));
                }   
            }
            else if(isDiv){
                // BUG: Cant get deciaml from int
                //Solution: Taken int and check if there is a decimal. If there is a decimal cast to float.
                if(firstNumber % secondNumber == 0)
                    System.out.println("Your answer is: " + (firstNumber / secondNumber));
                else
                    System.out.println("Your answer is: " + (firstNumber / (float)secondNumber));         
            }
            else if(isMulti){
                
                if((long)firstNumber * (long)secondNumber > 2147483647 || (long)firstNumber * (long)secondNumber > -2147483647){
                    System.out.println("Your answer is: " + ((long)firstNumber * (long)secondNumber));
                }
                else{
                    System.out.println("Your answer is: " + (firstNumber * secondNumber));
                }                 
            }
            else{
                System.out.println("Please select a valid option.");
            }
            
        } 
    } 
