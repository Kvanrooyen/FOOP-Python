# NOTE Game logic/rules
# When player starts game, they need to be given a point
#   - Points are based on rolling 2 dice (2-12)
# LOSE:
#   - First roll is 2, 3 or 12
# WIN:
#   - First roll is 7 or 11
# If you get neither, that becomes your point
#   - Roll again to get new point.
# If the new sum is equal your original point, you win
# If the new sum is equal to 7, you lose
# If you get neither roll again
import random


# Roll dice and give user a number between 2 and 12
diceRoll = random.randint(2, 12)


def play():
    # Check for a win
    if diceRoll == 7 or diceRoll == 11:
        print(f'Point: {diceRoll}    Result: WIN')
        print("===================")
        # TODO Add a replay option (if else with while loop to play())
    # Check for a loss
    elif diceRoll == 2 or diceRoll == 3 or diceRoll == 12:
        print(f'Point: {diceRoll}    Result: LOST')
        print("===================")
        # TODO Add a replay option (if else with while loop to play())
    # Neither win or loss
    else:
        print(f'Point: {diceRoll}    Result: Roll again!')
        # Roll another point for the user to check against their original score
        newDiceRoll = random.randint(2, 12)
        while (diceRoll != newDiceRoll or diceRoll == newDiceRoll):
            # Check for a win
            if diceRoll == newDiceRoll:
                # Win
                print(f'Point: {newDiceRoll}    Result: WIN')
                print("===================")
                break
            elif newDiceRoll == 7:
                # Lost
                print(f'Point: {newDiceRoll}    Result: LOST')
                print("===================")
                break
            else:
                # No win or loss
                print(f'Point: {newDiceRoll}    Result: Roll again!')
            newDiceRoll = random.randint(2, 12)


play()
