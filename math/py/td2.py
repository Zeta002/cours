#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Feb  1 16:03:30 2023

@author: p22008750
"""

from math import *
import numpy as np
import matplotlib.pyplot as plt

def tabStat (tab1, tab2):
    mod, eff = np.unique(tab1, return_counts=True)
    fre = eff / len(eff)
    effC = np.cumsum(eff)
    freC = np.cumsum(fre)
    mode = np.array(mod[np.where(eff == np.max(eff))])
    avg = np.mean(tab1)
    ecaT = np.std(tab1)
    med = np.median(tab1)
    qua = [np.quantile(tab1, .25), med, np.quantile(tab1, .75),]
    plt.boxplot([tab1, tab2], whis=[0,100], vert=False)
    
    print("Modalité : ", mod)
    print("Effectif : ", eff)
    print("Fréquence : ", fre)
    print("Effectif cumulé : ", effC)
    print("Fréquence cumulé : ", freC)
    print("Mode : ", mode)
    print("Moyenne : ", avg)
    print("Ecart type : ", ecaT)
    print("Mediane : ", med)
    print("Quantile : ", qua)
    plt.show()
    
    return None
  
def tabStat2 (tab):
    mod, eff = np.unique(tab, return_counts=True)
    plt.pie(eff, shadow=True, autopct='%1.1f%%', labels=mod, explode=None, colors = ['#FF0000', '#800080', '#00FFFF'])
    plt.bar(tab, 1, .8)

list1 = np.array([14.5, 17, 8, 6, 9, 12, 11, 15, 8, 11, 7.5, 14.5, 6, 17, 7.5, 9, 15, 14, 12, 9])
list2 = np.array([14.5, 16, 11, 3, 12, 13, 12, 15, 6, 11, 7.5, 14.5, 3, 16, 7.5, 10, 15, 14, 12, 10])
list3 = np.array(['A', 'B', 'B', 'C', 'B', 'A', 'A', 'B', 'B', 'A', 'B', 'B', 'A', 'A', 'C', 'C', 'B', 'B', 'C', 'B'])
tabStat(list2, list2)
tabStat2(list3)
plt.boxplot([list1, list2], whis=[0,100], vert=False)


    