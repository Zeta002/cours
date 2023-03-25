# Exercice 3

def check_lucas (L):
    for i in range (2, len(L)):
        if not L[i] == L[i-1] + L[i-2]: return False
        else: continue
    return True    
            
L = [0, 1, 1, 2, 3, 5, 8]

checkLucasList = check_lucas(L)
print(checkLucasList)