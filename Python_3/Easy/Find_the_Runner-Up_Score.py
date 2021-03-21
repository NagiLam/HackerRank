""" Problem: Find the Runner-Up Score! || Task: 
Given the participants' score sheet for your University Sports Day, you are required to find the runner-up score. 
You are given n scores. Store them in a list and find the score of the runner-up.

Created on Sun Oct  7 21:12:47 2018
@author: nagiAI
"""
n = int(input())
arr = map(int, input().split())
count = 0
listArr = list(arr)

for i in listArr:
    if i == max(listArr):
        count += 1
for i in range(count):
    listArr.remove(max(listArr))
    
print(max(listArr))
