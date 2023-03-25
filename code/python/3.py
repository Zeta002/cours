# demande à l'utilisateur de rentrer un nombre
number = input("Saissisez un nombre : ")

# calcul si ce nombre est pair ou impair et renvoie le résultat
if int(number) % 2 == 0:
    print("Ce nombre est pair")
else:
    print("Ce nombre est impair")