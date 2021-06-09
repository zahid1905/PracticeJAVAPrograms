import java.util.Scanner;

public class ejercicio4 {
    //4.-Imprime los números impares desde 0 a N.
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        leer.close();
        int nuevalinea = 0;
        for (int x = 0; x <= num; x++){
            if ((x % 2) != 0){
                System.out.print(x + "\t");
                nuevalinea++;
            }
            if (nuevalinea == 5){
                System.out.println();
                nuevalinea = 0;
            }
        }
        System.out.println();
    }
}