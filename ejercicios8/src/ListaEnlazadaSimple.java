public class ListaEnlazadaSimple {
    //Instancia para referencia al primer nodo
    private Nodo primero;
    public ListaEnlazadaSimple() {
        //Lista vacia
        primero = null;
    }

    //Verificar si la lista es vacia
    public boolean vacia() {
        return(primero == null);
    }

    //Insertar a la cabeza de la lista
    public void insertarCabezaLista(Object d) {
        //Crear el nuevo nodo
        Nodo nuevoNodo = new Nodo(d);
        //Enlazar el nuevo nodo con el nodo en la cabeza de la lista
        nuevoNodo.siguiente = primero;
        //El nuevo nodo es la nueva cabeza de la lista
        primero = nuevoNodo;
    }

    //Eliminar nodo de la cabeza
    public Nodo eliminarCabezaLista() {
        //Guardar referencia al primer nodo
        Nodo temp = primero;
        //Cambiar referencia de la variable
        primero = primero.siguiente;
        //Returnar el nodo eliminado
        return temp;
    }

    //Mostrar todos los nodos de la lista
    public void mostrarLista() {
        System.out.println("Lista primero -> ultimo");
        Nodo nodoActual = primero;
        //Repetir hasta que lleguemos a null
        while(nodoActual != null) {
            //Imprimir el dato
            nodoActual.mostrarNodo();
            System.out.print("\t");
            //Avanzar en la lista
            nodoActual = nodoActual.siguiente;
        }
        System.out.println("");
    }

    public Nodo buscarLista(Object dato) {
        Nodo nodoActual = primero;
        while(nodoActual.dato.equals(dato)) {
            if(nodoActual.siguiente == null) {
                return null;
            }
            else {
                nodoActual = nodoActual.siguiente;
            }
        }
        return nodoActual;
    }

    //Insertar nodo con el parametro valorNuevo despues del nodo con el valor/parametro valorExistente
    public Nodo insertar(Object valorExistente, Object valorNuevo) {
        //Creamos nuevo nodo con valor nuevo
        Nodo nuevoNodo = new Nodo(valorNuevo);
        //Iniciamos nuestro "contador" para la busqueda en el primer nodo
        Nodo nodoActual = primero;

        //Buscamos el nodo con valorExistente
        while(nodoActual.dato.equals(valorExistente)) {
            //Si llegamos al final de la lista sin encontrar el nodo returnamos null
            if(nodoActual.siguiente == null) {
                return null;
            }
            //Nos movemos al siguiente nodo
            else {
                nodoActual = nodoActual.siguiente;
            }
        }

        // Enlazamos el nuevo nodo con el nodo siguiente
        nuevoNodo.siguiente = nodoActual.siguiente;
        //Enlazamos el nodo encontrado con el nuevo nodo
        nodoActual.siguiente = nuevoNodo;
        //Retornamos nuevo nodo insertado
        return nuevoNodo;
    }

    //Eliminar nodo de cualquier parte
    public Nodo eliminar(Object dato) {
        //Iniciamos nodoActual para que apunte al primer nodo
        Nodo nodoActual = primero;
        //Iniciamos nodoAnterior para que apunte al primer nodo
        Nodo nodoAnterior = primero;

        while(!nodoActual.dato.equals(dato)) {
            //Si llegamos al final de la lista returnamos null
            if (nodoActual.siguiente == null) {
                return null;
            }
            //Si no se a llegado al final
            else {
                //Desplazamos la variable nodoAnterior al siguiente nodo
                nodoAnterior = nodoActual;
                //Desplazamos la variable nodoActual al siguiente nodo
                nodoActual = nodoActual.siguiente;
            }
        }
        //Eliminamos en caso de que sea el primero
        if(nodoActual == primero) {
            primero = primero.siguiente;
        }
        //Eliminamos en caso de que sea otro nodo
        else {
            nodoAnterior.siguiente = nodoActual.siguiente;
        }
        //Retornamos el nodo eliminado
        return nodoActual;
    }
}
