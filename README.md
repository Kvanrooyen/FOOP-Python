# FOOP-Python

Converting my college Java programs to Python

## Skills Demo 3

> **2D Game Engine**
>
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
