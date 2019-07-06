def add(firstNum, secondNum):
    print(f'Answer: {int(firstNum) + int(secondNum)}')


def subtract(firstNum, secondNum):
    print(f'Answer: {int(firstNum) - int(secondNum)}')


def multiply(firstNum, secondNum):
    print(f'Answer: {int(firstNum) * int(secondNum)}')


def divide(firstNum, secondNum):
    print(f'Answer: {int(firstNum) / int(secondNum)}')


print("Enter yout first number: ")
firstNum = int(input('> '))

print("Enter your operation: [+ - * /]")
numOperation = input('> ')

print("Enter your second num: ")
secondNum = int(input('> '))


if numOperation == '+':
    add(firstNum, secondNum)
elif numOperation == '-':
    subtract(firstNum, secondNum)
elif numOperation == '*':
    multiply(firstNum, secondNum)
elif numOperation == '/':
    divide(firstNum, secondNum)
else:
    print("Error! Please choose a valid operation")
