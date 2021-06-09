public class OrdenamientoQuickSort {
    public void ordenar(int[] arreglo, int izquierda, int derecha) {
        int pivote = arreglo[izquierda]; // tomamos primer elemento como pivote
        int i = izquierda;         // i realiza la búsqueda de izquierda a derecha
        int j = derecha;         // j realiza la búsqueda de derecha a izquierda
        int temp;
 
        while(i < j) {                          // mientras no se crucen las búsquedas                                   
            while(arreglo[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while(arreglo[j] > pivote) {
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {                        // si no se han cruzado                      
                temp= arreglo[i];                      // los intercambia
                arreglo[i]=arreglo[j];
                arreglo[j]=temp;
            }
        }

        arreglo[izquierda] = arreglo[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        arreglo[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        imprimir(arreglo);
        
        if(izquierda < j - 1) {
            ordenar(arreglo, izquierda, j - 1);          // ordenamos subarray izquierdo
        }

        if(j + 1 < derecha) {
            ordenar(arreglo, j + 1, derecha);          // ordenamos subarray derecho
        }
    }

    public void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "\t");
        }
        System.out.println();
    }
}
