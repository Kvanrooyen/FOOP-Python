/*
Create player and set all of its properties
Create enemy and set all of its properties
Print out each property for player and enemy
Get both to jump and then print out X and Y locations of both
Get enemy to attack and print out X and Y location
Get player to retreat and print out X and Y location
    
*/
package skillsdemo3;

public class SkillsDemo3 {

    public static void main(String[] args) {
        Player player1 = new Player();

        //Setting values for variables
        player1.setName("Ben");
        player1.setXLocation(25);
        player1.setYLocation(25);

        //TESTING
        //Printing player name and their position
        player1.speak(); //Print I am Sprite
        System.out.println("\nTeam name: " + player1.getTeamName() + "\nName: " 
                            + player1.getName() + "\n" + player1.position() 
                            + " \nAlive: " + player1.isAlive() + " \nVisible: "
                            + player1.isVisible() + "\nEnemies Destroyed: "
                            + player1.getPlayersDestroyed());

        //Player jumps
        player1.jump();
        player1.retreat();

        //Print that player jumped, and their new position (Y)
        //Print that the player retreated, and their new position (X)
        System.out.println("\nI jumped to Y: " + player1.getYLocation() +
                           "\nI retreated to X: " + player1.getXLocation() + 
                           "\nCurrent coordinates are " + player1.position());
    }
    
}
