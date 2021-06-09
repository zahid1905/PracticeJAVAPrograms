public class App {
    public static void main(String[] args) throws Exception {
        int torre0[] = {4,3,2,1};
        int torre1[] = {0,0,0,0};
        int torre2[] = {0,0,0,0};
        
        hanoi(torre0.length, torre0, torre1, torre2);
    }

    private static void hanoi(int n, int torre0[], int torre1[], int torre2[]) {        
        if (n > 0){
            // Mover la torre de tamaño n-1 a la torre1
            hanoi(n - 1, torre0, torre2, torre1);
            // Mover el disco de torre0 a torre2
            if (torre0[0] != 0){
                // Sacar el ultimo número del arreglo y sustituirlo por un 0 (extraer() y asignarExtraccion() equivalen a pop() de Python)
                int extraccion[][] = extraer(torre0);
                int disco = extraccion[0][0];
                System.out.println("Moviendo " + disco);
                torre0 = asignarExtraccion(extraccion);

                // Colocar un valor al "final" del arreglo (insertar() es equivalente a append() de Python)
                torre2 = insertar(torre2, disco);

                imprimir(torre0, torre1, torre2);
            }
            // Mover la torre de tamaño n-1 de torre1 a torre2
            hanoi(n - 1, torre1, torre0, torre2);
        }
    }

    // Función que devuelve el ultimo valor diferente a 0 y una copia del arreglo con dicho valor convertido en 0
    private static int[][] extraer(int origen[]){
        for (int i = 3; i >= 0; i--){
            if (origen[i] > 0){
                int extraido = origen[i];
                origen[i] = 0;
                int extraccion[][] = {{extraido}, origen};
                return extraccion;
            }
        }
        return null;
    }

    // Función que convierte el arreglo generado por la funcion extraer() de 2 a 1 dimención 
    private static int[] asignarExtraccion(int extraccion[][]){
        int nuevoArreglo[] = {0,0,0,0};
        for (int i = 0; i <= 3; i++){
            nuevoArreglo[i] = extraccion[1][i];
        }
        return nuevoArreglo;
    }

    // Funcion que sustituye un 0 al final de un arreglo con un valor
    private static int[] insertar(int origen[], int valor){
        for (int i = 0; i <= 3; i++){
            if (origen[i] == 0){
                origen[i] = valor;
                return origen;
            }
        }
        return null;
    }

    // Función que sirve para imprimir los arreglos en forma vertical
    private static void imprimir(int torre0[], int torre1[], int torre2[]){
        for (int i = 3; i >= 0; i--){
            System.out.print(torre0[i] + "\t" + torre1[i] + "\t" + torre2[i] + "\n");
        }
    }
}
