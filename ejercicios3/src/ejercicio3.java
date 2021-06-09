public class ejercicio3 {
    public static void main(String[] args) {        
        //Llena un arreglo de 10 lugares con números en orden aleatorio y luego imprime
        //la posición y el número del menor de todos
        int num[] = new int[10];
        System.out.println("Numeos aleatorios desordenados: ");
        for (int i = 0; i < 10; i++){
            num[i] = (int)(Math.random()*10+1);
            System.out.print(num[i] + "\t");
        }        
        
        int posi = 0;
        boolean fin = false;

        for (int i = 0; i < 10; i++){
            if (num[i] < num[posi]) posi = i;
        }
        System.out.println("\nEl numero menor esta en la posiscion " + (posi+1) + " y es " + num[posi]);
    }
}