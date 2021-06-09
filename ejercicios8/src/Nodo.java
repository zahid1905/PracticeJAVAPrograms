public class Nodo {
    //Referencia al campo dato
    public Object dato;
    //Referencia al siguiente nodo
    public Nodo siguiente;

    //Constructor
    public Nodo (Object d) {
        dato = d;
        siguiente = null;
    }
    
    //Imprimir el valor de dato
    public void mostrarNodo() {
        System.out.print(dato);
    }
}
