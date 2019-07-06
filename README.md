# FOOP-Python

Converting my college Java programs to Python

## Skills Demo 1

### Calculator

> Write a Java program that implements a simple calculator. It will contain 1 java class called Calculator.java. The class will take 2 integers and an operator (+ - / \*) as input from the command line.
>
> Identify all the data types required and declare the required variables.
>
> Use an if/else (or switch) statement to determine which operator the user entered, and for each case perform the operation (add, subtract, divide or multiply) and write the result out to the command line.
>
> Use casting to ensure that data loss does not occur in your program, for example:
>
> 1. When you divide 10 by 4. The answer is 2.5 (a float) not 2 (an integer).
> 2. When you add, subtract or multiply two integers that produce a result larger than 2147483647 (or smaller than ‐2147483647) you need to cast to a long.

## Skills Demo 2

### Craps game

> **Problem Statement**
>
> Write a Java program that implements a game of CRAPS. It will contain 1 java class called Craps.java.
>
> **Rules for the game:**
>
> In the game of Craps, players roll a pair of dice. Only the sum of the spots matters: a number between 2 and 12. The shooter does the rolling. Below, win or loss refers to the shooter.
>
> - Shooter rolls two dice to get the first sum.
>   - If the first sum is 2, 3, or 12, shooter loses.
>   - Otherwise, if the first sum is 7 or 11, shooter wins.
>   - Otherwise, the first sum becomes the point.
> - Now keep rolling again and again
> - Shooter rolls two dice to get the new sum.
>   - If the new sum equals the point, shooter wins.
>   - Otherwise if the new sum equals 7, shooter looses.
>   - Otherwise shooter rolls again.

## Skills Demo 3

### **2D Game Engine**

> Create a program that has three classes
>
> - A sprite
> - An enemy
> - A player
>
> Note: for every property in each class it is a requirement to have appropriate get and set methods.
>
> **Sprite**
>
> - Must have the following properties:
>
>   1. Name
>   2. X location
>   3. Y location
>   4. Visible
>   5. Alive
>
> - Must have the following methods
>
>   1. Speak (this will print to the console, “I am a sprite”)
>   2. Jump this will increase the Y location by 10.
>   3. Print the X and Y location
>
> - Must have two constructors, default and overloaded.
>
> **Enemy**
>
> - Must inherit all the properties from a Sprite and have the following additional properties:
>
>   1. Team Name
>   2. Number of players destroyed
>
> - Must override the following method
>
>   1. Speak (this will print to the console, “I am an Enemy”)
>
> - Must have an additional method
>
>   1. Attack (this will add ten to the X location)
>
> - Must have only one constructor (default - no arguments)
>
> **Player**
>
> - Must inherit all the properties from a Sprite and have the following additional properties:
>
>   1. Team Name
>   2. Number of enemies destroyed
>
> - Must override the following method
>
>   1. Speak (this will print to the console, “I am the Player”)
>
> - Must have an additional method
>
>   1. Retreat (this will subtract ten to the X location)
>
> - Must have only one constructor (default - no arguments)
>
> **Main program**
>
> - Create a console application that has the following:
> - Creates an enemy and sets all of its properties.
> - Creates a player and sets all of its properties.
> - Prints out each property from both enemy and player.
> - Gets both to jump and then print out X and Y locations of both enemy and player.
> - Gets the enemy to attack and then prints out enemy X and Y location.
> - Gets player to retreat and then prints out player X and Y location.
