""" Problem: Designer Door Mat || Task: 
Mr. Vincent works in a door mat manufacturing company. One day, he designed a new door mat with the following specifications:

Mat size must be N X M. (N is an odd natural number, and M is 3 times N.)
The design should have 'WELCOME' written in the center.
The design pattern should only use |, . and - characters.

Created on Tue Oct 16 13:28:17 2018
@author: nagiAI
"""

inputValue = input().split(" ")
N = int(inputValue[0])
M = int(inputValue[1])

for i in range(1, N, 2):
    print((".|."*i).center(M, "-"))
    
print(("WELCOME").center(M, "-"))

for i in range(N-2, -1, -2):
    print((".|."*i).center(M, "-"))
