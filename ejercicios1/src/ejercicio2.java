public class ejercicio2{
    //2.-Imprime los números del 1 al 500 que sean múltiplos de 3,4 y 7.
    //Cada tres números que imprimas da un salto de línea.
    public static void main(String[] args) {
        int contador = 0;
        for (int i = 1; i <= 500; i++){
            if ((i % 3) == 0 && (i % 4) == 0 && (i % 7) == 0){
                System.out.print(i + "\t");
                contador++;
            }            
            if (contador == 3){
                System.out.println();
                contador = 0;
            }
        }
        System.out.println();     
    }
}