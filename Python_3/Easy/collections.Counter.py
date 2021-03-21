""" Problem: collections.Counter() || Task: 

Raghu is a shoe shop owner. His shop has X number of shoes. 
He has a list containing the size of each shoe he has in his shop. 
There are N number of customers who are willing to pay x amount of money only if they get the shoe of their desired size.
Your task is to compute how much money Raghu earned.

Created on Tue Oct 16 14:58:08 2018
@author: nagiAI
"""
# Solution using List - Status: Accepted
totalMoney = 0
numShoe = int(input())
listShoeSize = input().split(" ")
numCustomer = int(input())

for i in range(numCustomer):
    size, money = input().split(" ")
    money = int(money)
    
    if size in listShoeSize:
        totalMoney += money
        listShoeSize.remove(size)
        
print(totalMoney)

# Solution using collections.Counter - Status: Accepted
import collections

totalMoney = 0
numShoe = int(input())
listShoeSize = collections.Counter(input().split(" "))
numCustomer = int(input())
    
for i in range(numCustomer):
    size, money = input().split(" ")
    money = int(money)
    
    if listShoeSize[size] > 0:
        listShoeSize[size] -= 1
        totalMoney += money
        
print(totalMoney)


    


