def hanoi(n, torre0, torre2, torre1):    
    if n > 0:
        # Mover la torre de tamaño n-1 a la torre1
        hanoi(n - 1, torre0, torre1, torre2)
        # Mover el disco de torre0 a torre2
        if torre0[0]:
            # Sacar el ultimo número del arreglo y sustituirlo por un 0
            disco = torre0[0].pop()
            print ("Moviendo " + str(disco))

            # Colocar un valor al "final" del arreglo
            torre1[0].append(disco)

            print (torre0[0], torre2[0], torre1[0])
        # Mover la torre de tamaño n-1 de torre1 a torre2
        hanoi(n - 1, torre2, torre0, torre1)
        
torre0 = ([4,3,2,1], "torre0")
torre1 = ([], "torre1")
torre2 = ([], "torre2")
hanoi(len(torre0[0]),torre0,torre2,torre1)