"""
Player needs the following properties:
    Inherit everything from sprite
    Team name - String
    Number of enemies destroyed - int

Must override the following method:
    Speak - print "I am the Player"

Must have an additional method:
    Retreat - subtract ten to X location

Must have one constructor - default, no arguments
"""
from Sprite import Sprite


class Player(Sprite):

    def __init__(self, teamName="Team name not set", enemiesKilled=0):
        self.name = "Name not set"
        self.xLocation = 0
        self.yLocation = 0
        self.isVisible = True
        self.isAlive = True
        self.teamName = teamName
        self.enemiesKilled = enemiesKilled

    def setTeamName(self, teamName):
        self.teamName = teamName

    def setEnemiesKilled(self, enemiesKilled):
        self.enemiesKilled = enemiesKilled

    def playerSpeak(self):
        print("I am a player")

    def getPlayerDetails(self):
        return 'Team name: {0}\nEnemies killed: {1}'.format(self.teamName, self.enemiesKilled)

    def retreat(self):
        self.xLocation -= 10
        print("I retreated, my location has been updated. \nX: {0} and Y: {1}".format(
            self.xLocation, self.yLocation))
