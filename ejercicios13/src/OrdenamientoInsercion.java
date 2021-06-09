public class OrdenamientoInsercion {
    public int[] ordenar(int[] arreglo) {
        int indexMenorActual = 1;
        while (true) {
            int indexMenorTemp = indexMenorActual;
            for (int i = indexMenorTemp - 1; i >= 0; i--) {
                if (arreglo[indexMenorTemp] < arreglo[i]) {
                    int menorTemp = arreglo[indexMenorTemp];
                    arreglo[indexMenorTemp] = arreglo[i];
                    arreglo[i] = menorTemp;
                    indexMenorTemp--;
                }
                else {
                    break;
                }
            }
            indexMenorActual++;
            imprimir(arreglo);

            if (indexMenorActual == arreglo.length) {
                return arreglo;
            }
        }
    }

    public void imprimir(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "\t");
        }
        System.out.println();
    }
}
