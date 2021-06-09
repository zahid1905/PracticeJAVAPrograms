public class Arreglo{
    private int arr[];
    private int elementos;


    public Arreglo (int tam){
        arr = new int[tam];
        elementos = 0;
    }

    // Buscar
    public boolean buscar(int dato){
        int j;
        for (j = 0; j < elementos; j++){
            if (arr[j] == dato){
                break;
            }
        }
        if (j == elementos){
            return false;
        }
        else{
            return true;
        }
    }

    // Insertar
    public void insertar(int dato){
        arr[elementos] = dato;
        elementos++;
    }

    // Eliminar
    public boolean eliminar(int dato){
        int j;
        for (j = 0; j < elementos; j++){
            if (arr[j] == dato){
                break;
            }                
        }
        if (j == elementos){
            return false;
        }
        else{
            for (int k = j; k < elementos; k++){
                arr[k] = arr[k + 1];
            }
            elementos--;
            return true;
        }
    }

    // Mostrar
    public void mostrarElementos(){
        for (int j = 0; j < elementos; j++){
            System.out.println(arr[j] + "\t");
        }
        System.out.println("\t");
    }

    // Regresar
    public int valorElemento(int i){
        return arr[i];
    }
}