public class Cola {
    private Object[] arregloCola;
    private int size;
    //Almacenamos el indice del elemento primero y ultimo de la Cola
    private int primero;
    private int ultimo;

    public Cola(int s) {
        //Tamaño que se le asignara al arreglo Cola
        this.size = s;
        //Indicamos que la Cola esta vacia
        primero = 0;
        ultimo = -1;
        //Creamos la estructura
        arregloCola = new Object[size];
    }

    public void insertar(Object elemento) {
        //Incrementamos ultimo
        ultimo += 1;
        //Insertamos
        arregloCola[ultimo] = elemento;
    }

    public Object quitar() {
        //Guardamos en temp el elemento primero
        Object temp = arregloCola[primero];
        //Movemos el primero a la siguiente posision
        primero += 1;
        //Retorna elemento eliminado
        return temp;
    }

    public Object primeroCola() {
        //Regresar el primero de la Cola
        return arregloCola[primero];
    }

    public Object ultimoCola() {
        //Regresar el ultimo de la Cola
        return arregloCola[ultimo];
    }

    public boolean ColaVacia() {
        return ultimo == -1;
    }

    public boolean ColaLlena() {
        return ultimo == size - 1;
    }

    public int tamano() {
        return (ultimo + 1) - primero;
    }

    public void mostrarElementos() {
        for(int i = primero; i < ultimo + 1; i++) {
            System.out.println(arregloCola[i]);            
        }
    }
}