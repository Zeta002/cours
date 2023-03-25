# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

from math import *

def average (tab):
    sum = 0
    for i in tab:
        sum += i
    return sum / len(tab)

tab = [1, 2, 3, 4, 5, 6, 7 , 8]

#a = average(tab)
#print (a)

"""
def average2 (tab):
    return sum(tab)
"""

def ecartType (tab):
    variance = 0
    for i in tab:
        variance += i**2
    variance = (variance / len(tab)) - average(tab)**2
    return sqrt(variance)

def mediane (tab):
    if (len(tab) % 2 == 0):
        middle = len(tab) // 2
        return (tab[middle] + tab[middle-1]) / 2
    else:
        return tab[len(tab) // 2]
            
print("hello")
list = [6,6,7.5,7.5,8,8,9,9,9,11,11,12,12,14,14.5,14.5,15,15,17,17]
print (ecartType(list))
print (mediane(list))
