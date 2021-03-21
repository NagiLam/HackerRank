""" Problem: Find a string || Task: 

In this challenge, the user enters a string and a substring. 
You have to print the number of times that the substring occurs in the given string. 
String traversal will take place from left to right, not from right to left.
NOTE: String letters are case-sensitive.

Created on Tue Oct 16 12:43:49 2018
@author: nagiAI
"""

def count_substring(string, sub_string):
    count = 0
    sub_len = len(sub_string)
    
    for i in range(len(string)):
        if string[i:i+sub_len] == sub_string:
            count +=1        
    return count

#Uncomment for testing
#print(count_substring("ABCDCDC", "CDC"))
