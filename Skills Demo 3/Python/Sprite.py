"""
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
"""


class Sprite:

    def __init__(self, name="Name not set", xLocation=0, yLocation=0, isVisible=True, isAlive=True):
        self.name = name
        self.xLocation = xLocation
        self.yLocation = yLocation
        self.isVisible = isVisible
        self.isAlive = isAlive

    def setLocation(self, xLocation, yLocation):
        self.xLocation = xLocation
        self.yLocation = yLocation

    def jump(self):
        self.yLocation += 10

    @staticmethod
    def speak():
        print('I am a sprite')

    def setAlive(self, isAlive):
        self.isAlive = isAlive

    def setVisible(self, isVisible):
        self.isVisible = isVisible

    def setName(self, name):
        self.name = name

    def __str__(self):
        return "\nName: {0}\nX: {1} and Y: {2}\nVisible: {3}\nAlive: {4}".format(self.name, self.xLocation, self.yLocation, self.isVisible, self.isAlive)
