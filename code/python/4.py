# fonction affiche de 1 a 10
def test():
    # boucle affichant de 1 a 10
    for i in range(1, 11):
        print(i)

# fonction somme d'heures
def somme_heures():
    # demande à l'utilisateur les heures / minutes / secondes
    heure1 = input(print("Saissisez une première heure : "))
    minute1 = input(print("Saissisez les minutes : "))
    seconde1 = input(print("Saissisez les secondes : "))

    # demande à l'utilisateur les heures / minutes / secondes à addtionner
    heure2 = input(print("Saissisez une première heure : "))
    minute2 = input(print("Saissisez les minutes : "))
    seconde2 = input(print("Saissisez les secondes : "))

    # caclul la somme des 2
    result_heure = int(heure1) + int(heure2)
    result_minute = int(minute1) + int(minute2)
    result_seconde = int(seconde1) + int(seconde2)

    # détecte si les secondes / minutes dépasse
    n = result_seconde / 60
    result_minute + n
    result_seconde = result_seconde % 60
    m = result_minute / 60
    result_heure + m
    result_minute = result_minute % 60

    # affiche le résultat
    print(result_heure, "h", result_minute, "min", result_seconde, "s")

# fonction pendu
def pendu():
    # demande à l'utilisateur le mot qu'il veux faire devinez
    devine = input(print("Saissisez le mot que vous voulez faire devinez : "))

    # initialisation du mot caché de la taille du mot à deviner & l'affiche
    cacher = ""
    for i in (devine):
        cacher = cacher + '_'
    print(cacher)

    # boucle du pendu
    #while (devine != cacher):
        #l = input(print("Saissisez une lettre : "))
        #cpt = 0
        #for i in (devine):
            #if devine[cpt] == str(l):
                #cacher[cpt] == str(l)
            #cpt = cpt + 1
        #print(cacher)
    #print("Bravo vous avez fini par trouver ! Le mot étais bien : ", devine, "bravo !")

pendu()