public class OrdenamientoBurbuja {
    public int[] ordenar(int[] arreglo) {
        //Definir o recibir array de enteros arreglo
        //Definir entero temp
        int temp;
        //Definir booleano cambio = falso
        boolean cambio = false;
        //Mientras vedadero entonces
        while (true) {
            //Hacer cambio = falso
            cambio = false;
            //Para entero i = 1, mientras i menor a largo del arreglo entonces
            for (int i = 1; i < arreglo.length; i++) {
                //Si arreglo posición i menor a arreglo posición i-1 entonces
                if(arreglo[i] < arreglo[i-1]) {
                    //Hacer temp = arreglo posición i
                    temp = arreglo[i];
                    //Hacer arreglo posición i = arreglo posición i-1
                    arreglo[i] = arreglo[i-1];
                    //Hacer arreglo posición i-1 = arreglo temp
                    arreglo[i-1] = temp;
                    //Hacer cambio = verdadero
                    cambio = true;
                    //Imprimir arreglo (opcional)
                    imprimir(arreglo);
                }
            }
            //Si cambio igual a falso entonces
            if(cambio == false) {
                //Devolver arreglo
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
