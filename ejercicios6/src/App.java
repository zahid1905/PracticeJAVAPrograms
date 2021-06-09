public class App {
    public static void main(String[] args) throws Exception {
        int tamArreglo = 30;

        Arreglo arr;
        arr = new Arreglo(tamArreglo);

        // Insertar
        arr.insertar(20);
        arr.insertar(19);
        arr.insertar(18);
        arr.insertar(17);
        arr.insertar(16);
        arr.insertar(15);
        arr.insertar(14);
        arr.insertar(13);
        arr.insertar(12);
        arr.insertar(11);

        // Mostrar
        arr.mostrarElementos();

        // Buscar
        int vb = 30;
        if (arr.buscar(vb)){
            System.out.println("Se encontro el valor");
        }
        else{
            System.out.println("No se encontro el valor");
        }

        // Eliminar
        arr.eliminar(14);

        arr.mostrarElementos();
    }
}
