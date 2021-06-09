import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String dias[] = {"","Lunes", "Martes", "Mierco", "Jueves"};

        String modulo_1[] = new String[5];
        modulo_1[0] = "7-9";
        String modulo_2[] = new String[5];
        modulo_2[0] = "9-11";
        String modulo_3[] = new String[5];
        modulo_3[0] = "11-13";
        String modulo_4[] = new String[5];
        modulo_4[0] = "13-15";      

        for (int fil = 1; fil <= 4; fil++){
            for (int col = 1; col <= 4; col++){
                System.out.print("Ingresa la materia de modulo " + col + " del " + dias[fil] + ": ");
                String temp = leer.nextLine();
                switch (col){
                    case 1:
                        modulo_1[fil] = temp;
                        break;
                    case 2:
                        modulo_2[fil] = temp;
                        break;
                    case 3:
                        modulo_3[fil] = temp;
                        break;
                    case 4:
                        modulo_4[fil] = temp;
                        break;
                    default:
                        break;
                }
            }            
        }
        leer.close();
        for (int fil = 0; fil <= 4; fil++){
            for (int col = 0; col <= 4; col++){                
                switch (fil){
                    case 0:
                        System.out.print(dias[col] + "\t");
                        break;
                    case 1:
                        System.out.print(modulo_1[col] + "\t");
                        break;
                    case 2:
                        System.out.print(modulo_2[col] + "\t");
                        break;
                    case 3:
                        System.out.print(modulo_3[col] + "\t");
                        break;
                    case 4:
                        System.out.print(modulo_4[col] + "\t");
                        break;
                    default:
                        break;
                }
            }
            System.out.print("\n");
        }
    }
}