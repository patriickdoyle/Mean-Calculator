"""
AADMean.py
CIS 211 001
This program calculates the arithmetic mean of 3 integer
numbers.
Last edited by Pat Doyle 9/16/20
"""

# Prompt user to enter 3 integers and assign variables to each
a = int (input("Enter an integer. "))
b = int (input("Enter an integer. "))
c = int (input("Enter an integer. "))

# Assign the mean of these values to a variable
floatMean = (a + b + c) / 3

# Convert mean to a string so it can be outputted
stringMean = str(floatMean)
print("The mean was " + stringMean + ".")

# Ask the user for another integer
d = int(input("Enter an integer. "))

# Create string and float versions of input 
stringD = str(d)
floatD = float(d)

# Add new value to the mean. Must be the float variable 
floatFinal = floatMean + floatD

# Convert final value to a string and output
stringFinal = str(floatFinal)
print("The mean plus " + stringD + " is " + stringFinal + ".")