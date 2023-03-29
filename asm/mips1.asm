#	EXO EXEMPLE

#     .data
#str: .asciiz "Ceci est une chaine de caracteres en ascii\n"
#     .text
#     
#main: ori $v0, $zero, 4 # $v0 <- 4
#      la $a0, str # $a0 <- str
#      syscall # affiche str
#
#      ori $v0, $zero, 10 # $v0 <- 10
#      syscall # appel systeme de terminaison de programme

#	EXO 1
     
#    .text
# ori $t0, $zero, 2

#e1: ori $v0, $zero, 5
#    syscall
#    
#    or $a0, $zero, $v0
#    mul $a0, $a0, $t0
#    ori $v0, $zero, 1
#    syscall
#    
#    bne $a0, 100, e1
#    ori $v0, $zero, 10
#    syscall

#	EXO 2
            
#     .data
#str: .asciiz "\nEntrez une valeur : "
#     .text
#     
#     ori $v0, $zero, 4
#     la $a0, str # $a0 <- str
#     syscall # affiche str
#
#     ori $t0, $zero, 2
#
#e1:  ori $v0, $zero, 5
#     syscall
#     
#     or $a0, $zero, $v0
#     mul $a0, $a0, $t0
#     ori $v0, $zero, 1
#     syscall
#     
#     bne $a0, 100, e1
#     ori $v0, $zero, 10
#     syscall

#	EXO 3
	
#	.data
#str :     .asciiz "\nentrez un chiffre : "
#sum :    .asciiz "Somme = "
#
#    .text
#loop :    ori $v0, $zero, 4    # afficher string
#    la $a0 str        # load la string 'str'
#    syscall            # affichage
#    
#    ori $v0, $zero, 5    # demande d'entrer un entier
#    syscall
#    
#    or $a0, $zero, $v0    # stockage de l'input dans $a0
#    beq $a0, 0, exit    # si $a0 == 0 goto exit
#    add $t0, $t0, $a0    # sinon $t0 = $t0 + $a0
#    j loop            # retoure en haut de la boucle
#
#exit :    la $a0 sum        # load text sum
#    ori $v0, $zero, 4    # print string
#    syscall            # affichage
#    or $a0, $zero, $t0    # recupération de la somme
#    ori $v0, $zero, 1    # print int
#    syscall            # affichage
#    
#    ori $v0, $zero, 10    # exit
#    syscall

#	EXO 4

#    .data
#    
#tab:    .word 1,2,3,4,5     # 32($@) tab[8] 
#str:    .asciiz "T: \n"
#rligne:    .asciiz "\n"
#    
#    .text
#   
#
#main:    la $a0, str 
#    la $t0, tab
#    
#    ori $t1, $zero, 5    # N = 5
#    ori $t2, $zero, 0    # i = 0
#    
#    ori $v0, $zero, 4    # afficher string
#        la $a0, str        # load la string 'str' # a0 est le paramettre de la fonction v0
#        syscall            # affichage
#        
#    bne $t1, $t2, for
#
#for:    ori $v0, $zero, 1    # print int
#    lw $a0, ($t0)
#    syscall
#    ori $v0, $zero, 4
#    la $a0, rligne
#    syscall
#    
#    addi $t2, $t2, 1    # i += 1
#    addi $t0, $t0, 4    # t0 += 4
#    
#    bne $t1, $t2, for
#    
#    ori $v0, $zero, 10    # exit
#        syscall


#	EXO 4 CORRECTION

#	.data
#N:	.word 5			# undisnged N
#T:	.word 1,2,3,4,5		# unsigned T[]
#tr:	.asciiz "T: \n"
#
#	.text
#ain:	ori $v0, $zero, 4	# choisir le service
#	la $a0, str		# le passage du paramètre $a0 <- chaine
#	syscall			# affichage : "T: \n"
#	
#	la $t0, N		# $t0 <- @N
#	lw $s0, 0($t0)		# $s0 <- N
#	
#	la $s1, T		# T:$s21 <- @T
#	
#	or $t0, $zero, $zero	# i:$t0 <- 0
#	
#or:	beq $t0, $s0, exitfor	# if (i==N) goto exitfor
#	sll $t1, $t0, 2		# $t1 <- i:$t0*4
#	add $t1, $s1, $t1	# $t1 <- @T + deplacement physique
#	lw $a0, 0($t1)		# $a0 <- T[i]
#	
#	ori $v0, $zero, 1	# choisir le service : affichage d'un entier
#	syscall			# appel du service : affichage
#	
#	addi $t0, $t0, 1	# ++i
#	j for			# retour au début de boucle
#	
#exitfor:
#	ori $v0, $zero, 10	# return 0
#	syscall
	
#	EXO 5

	.data
save:	.word 0, 0, 0, 0, 0, 0, 0, 1, 2, 3	# int save[]

	.text
main:	la $a0, save			# $a0 <- @save
	ori $a1, $zero, 1		# $a1 = 1
	ori $a2, $zero, 9		# $a2 = 9
	jal Recherche			# (jal : jump an link) appel de la fonction Recherche
	
	or $a0, $zero, $v0		# $a0 <- entier i à afficher
	ori $v0, $zero, 1		# $v0 w- 1
	syscall				# affichage
	
	ori $v0, $zero, 10		# $v0 w- 10
	syscall				# return 0

Recherche:	or $s0, $zero, $zero	# $s1:i w- 0 initialisation de i à 0

		for:	slt $t0, $a2, $s0	# $t0 = (i>n) ? 1:0
			
			bne $t0, $zero, exitfor	# if (i>n) goto exitfor
			
			sll $t0, $s0, 2		# $t0 <- 4*i
			add $t0, $t0, $a0	# $t0 <- @save[i]
			lw $t0, 0($t0)		# $t0 <- save[i]
			
			beq $t0, $a1, exitfor	# if (save[i]=k) goto exitfor
			
			addi $s0, $s0, 1	# ++i
			j for
			
		exitfor:	or $v0, $zero, $s0	# return i
				jr $ra			# jr jump register
							# jr instruction returns control to the caller
	
