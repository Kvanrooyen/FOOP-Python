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


def play():
    point = random.randint(2, 12)
    # Check for a win
    if point == 7 or point == 11:
        print(f'Point: {point}    Result: WIN')
        print("===================")
        # Ask user if they want to play again
        print("Would you like to play again? [Y/N]")
        playAgain = input("> ")
        if playAgain == 'Y' or playAgain == 'y':
            play()
        else:
            exit

    # Check for a loss
    elif point == 2 or point == 3 or point == 12:
        print(f'Point: {point}    Result: LOST')
        print("===================")
        # Ask user if they want to play again
        print("Would you like to play again? [Y/N]")
        playAgain = input("> ")
        if playAgain == 'Y' or playAgain == 'y':
            play()
        else:
            exit
    # Neither win or loss
    else:
        print(f'Point: {point}    Result: Roll again!')
        # Roll another point for the user to check against their original score
        newDiceRoll = random.randint(2, 12)
        while (point != newDiceRoll or point == newDiceRoll):
            # Check for a win
            if point == newDiceRoll:
                # Win
                print(f'Point: {newDiceRoll}    Result: WIN')
                print("===================")
                # Ask user if they want to play again
                print("Would you like to play again? [Y/N]")
                playAgain = input("> ")
                if playAgain == 'Y' or playAgain == 'y':
                    play()
                else:
                    exit
                break
            elif newDiceRoll == 7:
                # Lost
                print(f'Point: {newDiceRoll}    Result: LOST')
                print("===================")
                # Ask user if they want to play again
                print("Would you like to play again? [Y/N]")
                playAgain = input("> ")
                if playAgain == 'Y' or playAgain == 'y':
                    play()
                else:
                    exit
                break
            else:
                # No win or loss
                print(f'Point: {newDiceRoll}    Result: Roll again!')
            newDiceRoll = random.randint(2, 12)


play()
