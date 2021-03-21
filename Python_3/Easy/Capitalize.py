""" Problem: Capitalize! || Task: 
You are asked to ensure that the first and last names of people begin with a capital letter in their passports. 
For example, alison heck should be capitalised correctly as Alison Heck.
alison heck => Alison Heck
Given a full name, your task is to capitalize the name appropriately.

Created on Wed Oct 10 15:20:03 2018
@author: nagiAI
"""
def solve(s):
    result = ""
    s = s.capitalize()
    for i in range(len(s)):
        if s[i - 1] == " ":
            result  += s[i].upper()
        else: 
            result += s[i]
    return result

# Uncomment for testing
#print(solve("hello   world  lol"))
#print(solve("1 w 2 r 3g"))
#print(solve("lam phuoc"))
