import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        //Tipo de datos nombre [] = new tipo de datos [cuantos espacios]
        int arreglo[] = new int [3];
        String nombres[] = new String[5];
        Scanner nom = new Scanner(System.in);
        arreglo[1] = 1;
        nombres[2] = "Mau";
        System.out.println(arreglo[1] + nombres[2]);

        for (int i = 0; i < 5; i++){
            System.out.println("Escribe tu nombre: ");
            nombres[i] = nom.nextLine();
            System.out.println(nombres[i]);
        }
    }
}