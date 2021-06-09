public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int num1 = 5;
        int num2 = 5;
        int res = 0;
        res = num1 + num2;
        if (res < 8){
            System.out.println("El resultado es " +res);            
        }
        else{
            System.out.println("Ese no es el resultado");
        }
        for (int i = 0; i < 3; i++){
            System.out.println("Hola " +i);
        }
        int x = 10;
        while (x > 5){
            System.out.println("Soy mayore que 5 por " +(x-5));
            x--;
        }
        boolean bandera = true;
        int z = 8;
        do{
            if (z > 3){
                System.out.println("Sigue siendo true");
            }
            else{
                bandera = false;
            }
            z--;
        }while(bandera == true);
    }
}
