""" Problem: Print Function || Task: 
Read an integer N. Without using any string methods, try to print the following:
    
123...N

Note that "..." represents the values in between.

"""
#Use end parameter
n = int(input())
for i in range(1, n+1):
    print(i, end="")

#Use String concatenate
n = int(input())
temp = ""
for i in range(n):
    temp += str(i+1)
    print(temp)
