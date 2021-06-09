public class App {
    public static void main(String[] args) throws Exception {
        //Crear la cola
        Cola cola = new Cola(5);

        //Insertar valores
        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(4);
        cola.insertar(8);
        cola.insertar(16);

        //Mostrar la cola y el tamaño
        System.out.println("Elementos de la cola:");
        cola.mostrarElementos();
        System.out.println("Tamaño de la cola: " + cola.tamano());

        //Quitar elemento
        cola.quitar();
        cola.quitar();
        
        //Mostrar la cola y el tamaño
        System.out.println("Elementos de la cola:");
        cola.mostrarElementos();
        System.out.println("Tamaño de la cola: " + cola.tamano());

        //Mostrar el primer y ultimo elemento
        System.out.println("Primer elemento de la cola: " + cola.primeroCola());
        System.out.println("Ultimo elemento de la cola: " + cola.ultimoCola());
    }
}
