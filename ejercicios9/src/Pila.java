public class Pila {
    private Object[] arregloPila;
    private int size;
    //Almacenamos el indice del elemento que esta en la cima de la pila
    private int cima;

    public Pila(int s) {
        //Tamaño que se le asignara al arreglo pila
        this.size = s;
        //Indicamos que la pila esta vacia
        cima = -1;
        //Creamos la estructura
        arregloPila = new Object[size];
    }

    public void insertar(Object elemento) {
        //Incrementamos cima
        cima += 1;
        //Insertamos
        arregloPila[cima] = elemento;
    }

    public Object quitar() {
        //Guardamos en temp el elemento de la cima
        Object temp = arregloPila[cima];
        //Disminuimos la cima
        cima -= 1;
        //Retorna elemento eliminado
        return temp;
    }

    public Object cimaPila() {
        //Regresar la cima de la pila
        return arregloPila[cima];
    }

    public boolean pilaVacia() {
        return cima == -1;
    }

    public boolean pilaLlena() {
        return cima == size - 1;
    }

    public int tamano() {
        return cima + 1;
    }

    public void mostrarElementos() {
        for(int i = 0; i < tamano(); i++) {
            System.out.println(arregloPila[i]);
        }
    }
}