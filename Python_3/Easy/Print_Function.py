""" Problem: Print Function || Task: 
Read an integer N. Without using any string methods, try to print the following:
    
123...N

Note that "..." represents the values in between.

Created on Sun Oct  7 21:10:42 2018
@author: nagiAI
"""
n = int(input())
for i in range(1, n+1):
    print(i, end="")

