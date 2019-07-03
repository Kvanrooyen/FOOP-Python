/*
Enemy needs the following properties:
    Inhereit everything from sprite
    Team name
    Number of players destroyed

Must overide the following method:
    Speak - print "I am an enemy"

Must have an additional method:
    Attack - add ten to X location

Must have only one constructor - default, no arguments
*/
package skillsdemo3;

public class Enemy extends Sprite{
   //The subclass Enemy adds two fields
    private String teamName;
    private int playersDestroyed;

    //A default constructor, in case the user does not set any values
    public  Enemy(){
        teamName = "Team name not set";
        playersDestroyed = 0;
    }

    //Sets the team name with a new value
    public void setTeamName(String newValue){
        teamName = newValue;
    }

    //Get the team name
    public String getTeamName(){
        return teamName;
    }

    //Set the number of players destroyed
    public void setPlayersDestroyed(int newValue){
        playersDestroyed = newValue;
    }

    //Get the number of players destroyed
    public int getPlayersDestroyed(){
        return playersDestroyed;
    }

    //Add 10 to X location
    public void attack(){
        this.setXLocation(getXLocation()+ 10);
    }
    
    //Override speak from sprite class, to say "I am an Enemy"
    @Override
    public void speak(){
        System.out.println("I am an Enemy");
    }
}
