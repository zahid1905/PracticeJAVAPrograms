import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int arreglo [] = new int [15];
        int elementos = 10;
        arreglo [0] = 34;
        arreglo [1] = 11;
        arreglo [2] = 23;
        arreglo [3] = 39;
        arreglo [4] = 67;
        arreglo [5] = 89;
        arreglo [6] = 95;
        arreglo [7] = 53;
        arreglo [8] = 12;
        arreglo [9] = 48;

        for (int i = 0; i < elementos; i++){
            System.out.print(arreglo[i] + "\t");
        }

        //Buscar
        System.out.println("\n¿Que elemento buscas?");
        Scanner leer = new Scanner(System.in);
        int busqueda = leer.nextInt();
        boolean validar = false;
        for (int i = 0; i < elementos; i++){
            if (arreglo[i] == busqueda){
                System.out.println("Elemento encontrado en la posición " + i);
                validar = true;
                break;
            }            
        }
        if (validar){
            System.out.println("Elemento no encontrado");
        }

        //Eliminar
        System.out.println("¿Que elemento hay que eliminar?");
        busqueda = leer.nextInt();
        int i = 0;
        for (i = 0; i < elementos; i++){
            if (arreglo[i] == busqueda){
                break;
            }
        }
        for (int y = i; y < elementos; y++){
            arreglo[y] = arreglo[y+1];
        }
        for (i = 0; i < elementos; i++){
            System.out.print(arreglo[i] + "\t");
        }

        leer.close();
    }
}
