"""
Enemy needs the following properties:
    Inhereit everything from sprite
    Team name
    Number of players destroyed

Must overide the following method:
    Speak - print "I am an enemy"

Must have an additional method:
    Attack - add ten to X location

Must have only one constructor - default, no arguments
"""
from Sprite import Sprite


class Enemy(Sprite):

    def __init__(self, teamName="Team name not set", playersKilled=0):
        self.name = "Name not set"
        self.xLocation = 0
        self.yLocation = 0
        self.isVisible = True
        self.isAlive = True
        self.teamName = teamName
        self.playersKilled = playersKilled

    def setTeamName(self, teamName):
        self.teamName = teamName

    def setPlayersKilled(self, playersKilled):
        self.plaplayersKilled = playersKilled

    def enemySpeak(self):
        print("I am an enemy")

    def getPlayerDetails(self):
        return 'Team name: {0}\nPlayers killed: {1}'.format(self.teamName, self.playersKilled)

    def attack(self):
        self.xLocation += 10
        print("I attacked, my location has been updated. \nX: {0} and Y: {1}".format(
            self.xLocation, self.yLocation))
