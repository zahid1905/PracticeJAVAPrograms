import java.util.Scanner;

public class ejercicio5 {
    //5.-Imprimir el factorial desde 0 hasta N.
    public static void main(String[] args) {
        System.out.println("Introduce un numero: ");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        leer.close();
        int factorial = 1;
        for (int x = 1; x <= num; x++){
            System.out.println(factorial + " * " + x + " = " + (factorial*x));
            factorial *= x;
        }
    }
}