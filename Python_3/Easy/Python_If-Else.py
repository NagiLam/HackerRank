""" Problem: Python If-Else || Task:
Given an integer, n, perform the following conditional actions:

1. If n is odd, print Weird
2. If n is even and in the inclusive range of  to , print Not Weird
3. If n is even and in the inclusive range of  to , print Weird
4. If n is even and greater than , print Not Weird
"""

N = int(input())
if N % 2 != 0:
    print("Weird")
elif N % 2 == 0:
    if N in range (2, 6):
        print("Not Weird")
    if N in range (6, 21):
        print("Weird")
    elif N > 20:
        print("Not Weird")
