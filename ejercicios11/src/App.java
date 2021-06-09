public class App {
    public static void main(String[] args) throws Exception {
        int[] arreglo = {12,4,6,15,92,3,11,45,67,89,1,3,21,76,5,0,55};
        OrdenamientoBurbuja burbuja = new OrdenamientoBurbuja();
        burbuja.imprimir(arreglo);

        long startTime = System.nanoTime();

        burbuja.ordenar(arreglo);
        
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Total execution time in millis: "+ elapsedTime/1000000);
    }
}
