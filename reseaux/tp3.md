# TP 3 réseaux : Adressage IP et routage

---

## $Exercice 1$

### $1.$

A : 15.35.57.98
    255.0.0.0
    
    00001111.00100011.00111001.01100010
    11111111.00000000.00000000.00000000
    
& : 00001111.00000000.00000000.00000000/8

B : 210.100.45.0/24

C : 172.15.0.0/16

D : 10.246.232.0/22

E : 192.169.1.254
    255.248.0.0
    
    11000000.001010110100001110010101100000010000011000101
    11111111.11111000.0000000...
    
& : 11000000.000...

    192.40.0.0/13
    
### $2.$

A : 15.255.255.255

B : 210.100.45.255

C : 172.15.255.255

D : 10.246.232.255

E : 192.175.255.255

## $Exercice 2$

### $1.$ 

Privé

### $2.$

Publique

### $3.$

Privé

### $4.$

Publique

### $5.$

Publique

### $Exercice 3$

### $1.$

IP : 10.192.135.190

### $2.$

Masque : 255.255.255.0

Adresse + petite : 10.192.135.1

### $3.$

10.192.135.254

### $4.$

IP passerelle : 10.192.135.250

IP : 10.192.135.190

> Toute la partie réseaux est la même, donc la passerelle est le PC se trouve dans le même réseau

## $Exercice 4.$

Déterminez les différents champs de la trame suivante :

```                                       45 00
00 40 32 5f 00 00 80 11 00 00 8b 7c bb 1d 8b 7c
01 02 ec e8 00 35 00 2c d3 55 c6 b8 01 00 00 01
00 00 00 00 00 00 03 77 77 77 0a 72 66 63 2d 65
64 69 74 6f 72 03 6f 72 67 00 00 01 00 01
```

Version : 4
Longueur d'en-tête internet : 5
DS : 00
Longueur totale : 40 32
Identification : 5f 00
Identificateur : 0
Décalage du fragment : 0 00
Durée de vie : 80
Protocole : 11
Somme de contrôle d'en tête : 11 11
Adresse IP source : 00 00
Adresse IP de destination : 8b 7c bb 1d
Le reste... : 8b 7c 01 02

## $Exercice 5.$

### $1.$

120 sous réseaux nécessite $2^7$ soit $7$ bit

172.30.0.0/23

### $2.$

$2^9-2 = 510$

Il y a donc 510 hôte disponible

### $3.1$

172.30.1.1

### $3.2$

172.30.1.254

### $4.1$

172.30.255.1

### $4.2$

172.30.255.254
