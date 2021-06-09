import java.util.Scanner;

public class ejercicio3 {
    //3.-Imprime los números de primos desde 0 a N.
    public static void main(String[] args) {        
        System.out.println("Introduce un numero: ");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        leer.close();
        int nuevalinea = 0;
        for (int x = 2; x <= num; x++){
            boolean esprimo = true;
            for (int contador = 2; contador < x; contador++)
            {
                if ((x % contador) == 0)
                {                    
                    esprimo = false; 
                    break;
                }
            }
            if (esprimo)
            {
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