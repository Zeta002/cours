# Exercice 1
# 1.

from math import *

def average (tab):
    avg = 0
    for i in tab:
        avg += i
    avg /= len(tab)
    return avg

list1 = [10,20]

avgList = average(list1)
print(avgList)

# 2.

def ecartType (tab):
    variance = 0
    for i in tab:
        variance += i**2
    variance = (variance / len(tab)) - average(tab)
    return sqrt(variance)

list2 = [-2,2]

ecartTypeList = ecartType(list2)
print(ecartTypeList)


list2 = [-2,2]

# Ecercice 2
# 1.

def mediane (tab):
    if len(tab) % 2 == 0:
        return (tab[len(tab)//2] + tab[len(tab)//2 - 1]) / 2
    else:
        return tab[len(tab)//2]

list3 = [6,6,7.5,7.5,8,8,9,9,9,11,11,12,12,14,14.5,14.5,15,15,17,17]

medianeList = mediane(list3)
print(medianeList)

# 2.

def mediane2 (tab):
    if len(tab) % 2 == 0:
        sousSerie1 = tab[:len(tab)//2]
        sousSerie2 = tab[len(tab)//2:]
        return (tab[len(tab)//2] + tab[len(tab)//2 - 1]) / 2, sousSerie1, sousSerie2
    else:
        sousSerie1 = tab[:len(tab)//2]
        sousSerie2 = tab[len(tab)//2 + 1:]
        return tab[len(tab)//2], sousSerie1, sousSerie2

list3 = [6,6,7.5,7.5,8,8,9,9,9,11,11,12,12,14,14.5,14.5,15,15,17,17]

medianeList = mediane2(list3)
print(medianeList)

# 3.

def quartiles (tab):
    if len(tab) % 2 == 0:
        sousSerie1 = tab[:len(tab)//2]
        sousSerie2 = tab[len(tab)//2:]
    else:
        sousSerie1 = tab[:len(tab)//2]
        sousSerie2 = tab[len(tab)//2 + 1:]

    q1 = mediane(sousSerie1)
    
    q2 = mediane(list3)

    q3 = mediane(sousSerie2)

    return q1, q2, q3

list3 = [6,6,7.5,7.5,8,8,9,9,9,11,11,12,12,14,14.5,14.5,15,15,17,17,18]

quartilesList = quartiles(list3)
print(quartilesList)

# Exercice 3
# 1.

def max (tab):
    max = 0
    for i in tab:
        if max < i:
            max = i
    return max

list4 = [2, 4, 10, 4, 4, 5]

maxList = max(list4)
print(maxList)

# 2.

def modEff (tab):
    mod = []
    eff = []

    tab.sort()

    # tab M
    for i in tab:
        if not mod.count(i):
            mod.append(i)
    # tab E            
    for i in mod:
        for j in tab:
            if mod[i] == tab[j]:
                eff.append(j)
                eff[j] = j + 1
    return mod, eff

list3 = [6,6,7.5,7.5,8,8,9,9,9,11,11,12,12,14,14.5,14.5,15,15,17,17,18]

modEffList = modEff(list3)
print(modEffList)

    # cpt = 0

    # for i in tab:
    #     if not tab.count(i):
    #         mod.append(i)
    #     elif mod.count(i): 
    #         eff[cpt] = cpt + 1