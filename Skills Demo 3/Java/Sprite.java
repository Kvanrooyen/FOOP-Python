package skillsdemo3;

/*
//@todo
Sprite needs the following properties:
    Name - String
    X Location - int
    Y Location - int
    Visible - boolean
    Alive - boolean

Sprite must have the following methods:
    Speak - say "I am a Sprite"
    Jump - increase Y by 10
    Position - Print the X and Y Location

Must have two constructors, default and overloaded
*/

public class Sprite {
    //Sprite class has 5 properties
    private String name;
    private int xLocation, yLocation;
    private boolean visible, alive;

    Sprite(){
        name = "Name not set";
        xLocation = 0;
        yLocation = 0;
        visible = true;
        alive = true;
    }

    public Sprite(String startName,
                  int startXLocation,
                  int startYLocation,
                  boolean isVisible,
                  boolean isAlive){
        
        name = startName;
        xLocation = startXLocation;
        yLocation = startYLocation;
        visible = isVisible;
        alive = isAlive;
    }

    public void setName(String newValue) {
        this.name = newValue;
    }

    public String getName() {
        return name;
    }

    public void setXLocation(int newValue) {
        this.xLocation = newValue;
    }

    public int getXLocation() {
        return xLocation;
    }

    public void setYLocation(int newValue) {
        this.yLocation = newValue;
    }

    public int getYLocation() {
        return yLocation;
    }

    public void setVisible(boolean newValue) {
        this.visible = newValue;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setAlive(boolean newValue) {
        this.alive = newValue;
    }

    public boolean isAlive() {
        return alive;
    }

    //TODO
    //Override this when calling from player or enemy
    public void speak(){
        System.out.println("I am a Sprite.");
    }

    public void jump(){
         this.setYLocation(getYLocation() + 10);
    }

    public String position(){
        return "X: " + xLocation + ", Y: " + yLocation;
    }
}

