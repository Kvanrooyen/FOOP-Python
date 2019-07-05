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


# Test Sprite
sprite1 = Sprite()
sprite1.setName("Keagan")
sprite1.setLocation(654, 52)
sprite1.speak()
print(sprite1.__str__())
sprite1.jump()
print('\n\n' + sprite1.__str__())


# Player Test
player1 = Player()
# FIXME If no value is given program crashes. Should revert back to default value
print(player1.playerName("Player One"))
print(player1.playerLocation(25, 45))
player1.playerJump()
player1.retreat()
# FIXME If no value is given program crashes. Should use
print(player1.playerLocation())
player1.speak()
print(player1.playerTeam("Good Team"))
player1.playerAlive(False)
player1.playerVisible(True)
