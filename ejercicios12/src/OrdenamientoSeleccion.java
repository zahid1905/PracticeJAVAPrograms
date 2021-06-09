public class OrdenamientoSeleccion {
    public int[] ordenar(int[] arreglo) {
        int indexMenorTemp = 0;
        int indexMenorActual = 0;
        while (true) {
            indexMenorTemp = indexMenorActual;
            for (int i = indexMenorActual + 1; i < arreglo.length; i++) {
                if (arreglo[i] < arreglo[indexMenorActual] && arreglo[i] < arreglo[indexMenorTemp]) {
                    indexMenorTemp = i;
                }
            }
            if (indexMenorActual < arreglo.length) {
                int menorTemp = arreglo[indexMenorActual];
                arreglo[indexMenorActual] = arreglo[indexMenorTemp];
                arreglo[indexMenorTemp] = menorTemp;
                indexMenorActual++;
                imprimir(arreglo);
            }
            if (indexMenorActual == arreglo.length - 1) {
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
