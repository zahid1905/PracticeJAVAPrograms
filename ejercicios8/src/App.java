public class App {
    public static void main(String[] args) throws Exception {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        //Insertar cabeza lista
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(6);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(9);

        lista.mostrarLista();

        //Insertar
        Nodo nodo = lista.insertar(5, 56432);
        if(nodo == null) {
            System.out.println("No se puede insertar nuevo nodo");
        }
        else {
            System.out.println("El nodo se inserto correctamente");
        }

        lista.mostrarLista();

        //Buscar
        nodo = lista.buscarLista(2);
        if(nodo != null) {
            System.out.println("Se encontro el nodo con dato buscado: " + nodo);
        }
        else {
            System.out.println("No se encontro el nodo con dato buscado: " + nodo);
        }

        //Eliminar
        while(!lista.vacia()) {
            nodo = lista.eliminarCabezaLista();
            System.out.println("Nodo eliminado");
            nodo.mostrarNodo();
            System.out.println("");
        }

        System.out.println("Lista enlazada simple esta vacia? " + lista.vacia());
        
        lista.mostrarLista();

        lista.insertarCabezaLista("perro");

        lista.mostrarLista();
    }
}
