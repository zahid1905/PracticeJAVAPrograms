public class ejercicio1 {
    //1.-Imprime los números del 1 al 100 y cada 5 números da un salto de línea.
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 100; i++){
            System.out.print(i + "\t");
            contador++;
            if (contador == 5){
                System.out.println();
                contador = 0;
            }
        }
        System.out.println();
    }
}