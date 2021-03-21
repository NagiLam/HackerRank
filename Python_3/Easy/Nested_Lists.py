""" Problem: Nested Lists || Task: 
Given the names and grades for each student in a Physics class of  students, store them in a nested list and print the name(s) of any student(s) having the second lowest grade.

Note: If there are multiple students with the same grade, order their names alphabetically and print each name on a new line.
    
Created on Sun Oct  7 21:15:58 2018
@author: nagiAI
"""   
resultList = []
initList = []

count = 0
epsilon = 0.000001
secondLowestValue = 0

for i in range(int(input())):
        name = input()
        score = abs(float(input()))
        initList.append([name, score])

minValue = min(initList, key = lambda x: x[1])

for i in range(len(initList)):
    if abs(initList[i][1] - minValue[1]) < epsilon:
        count += 1

for j in range(count):
    initList.remove(min(initList, key = lambda x: x[1]))

secondLowestValue = min(initList, key = lambda x: x[1])

for k in initList:
    if abs(k[1] - secondLowestValue[1]) < epsilon:
        resultList.append(k)
resultList.sort()

for s in resultList:
    print(s[0])

    
