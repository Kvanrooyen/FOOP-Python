package skillsdemo3;

/*
Player needs the following properties:
    Inherit everything from sprite
    Team name - String
    Number of enemies destroyed - int

Must override the following method:
    Speak - print "I am the Player"

Must have an additional method:
    Retreat - subtract ten to X location

Must have one constructor - default, no arguments
*/

public class Player extends Sprite{

    //The subclass Player adds two fields
    private String teamName;
    private int playersDestroyed;

    public  Player(){
        teamName = "Team name not set";
        playersDestroyed = 0;
    }

    public void setTeamName(String newValue){
        teamName = newValue;
    }

    public String getTeamName(){
        return teamName;
    }

    public void setPlayersDestroyed(int newValue){
        playersDestroyed = newValue;
    }

    public int getPlayersDestroyed(){
        return playersDestroyed;
    }

    public void retreat(){
        this.setXLocation(getXLocation()-10);
    }
}
