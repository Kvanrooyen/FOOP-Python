"""
Create player and set all of its properties
Create enemy and set all of its properties
Print out each property for player and enemy
Get both to jump and then print out X and Y locations of both
Get enemy to attack and print out X and Y location
Get player to retreat and print out X and Y location
"""
from Sprite import Sprite
from Player import Player

# Player Test
player1 = Player()
player1.setName("Bob")
player1.setLocation(54, 4444)
player1.setEnemiesKilled(4)
player1.setTeamName("Red Dragons")
print(player1.getPlayerDetails())
print(player1.__str__())
player1.retreat()
