""" Problem: Write a function || Task: 
You are given the year, and you have to write a function to check if the year is leap or not.

Note that you have to complete the function and remaining code is given as template.

Created on Sun Oct  7 21:25:59 2018
@author: nagiAI
"""

def is_leap(year):
    leap = False 
    # Write your logic here
    if year % 4 == 0 and year % 100 != 0:
        leap = True
    if year % 4 == 0 and (year % 100 == 0 and year % 400 == 0):
        leap = True 
    return leap


