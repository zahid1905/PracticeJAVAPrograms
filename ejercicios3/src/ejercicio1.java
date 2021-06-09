import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        //Don Pedro tiene una tienda de abarrotes, el quiere un sistema en el cual pueda
        //ingresar los productos que tiene y el precio de cada uno. Deberás crear un
        //arreglo para los productos y otro para los precios, ingresar los valores en
        //orden y luego imprimir cada artículo con su respectivo precio.
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Numero de productos a ingresar: ");
        int num = leer.nextInt();
        
        String nombres[] = new String[num];
        double precios[] = new double[num];

        for (int i = 0; i < num; i++){
            System.out.print("Nombre del producto " + (i+1) + ":");
            leer.nextLine();
            nombres[i] = leer.nextLine();

            System.out.print("Precio de " + nombres[i] + ":");
            precios[i] = leer.nextDouble();
        }
        
        leer.close();

        for (int i = 0; i < num; i++){
            if (i == 0) System.out.println("Producto\tPrecio");

            System.out.println(nombres[1] + "\t\t" + precios[i]);
        }
    }
}