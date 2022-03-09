import java.util.Scanner;


public class Menu {
    private static boolean error;
    public static void main(String[] args) {
        int num = 0;
        error = false;
        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("              Menú       ");
            System.out.println("1. opción1");
            System.out.println("2. opción2");
            System.out.println("3. opción3");
            System.out.println("4. opción4");
            System.out.println("5. Salir");
            System.out.println("Elija una opción del 1-5");
            num = entrada.nextInt();

            if (num > 0 && num <= 5) {
                if (num == 1){
                    opcion1(num);
                }
                else{
                    if (num == 2) {
                        opcion2(num);
                    }
                    else{
                        if (num == 3) {
                            opcion3(num);
                        }
                        else {
                            if (num == 4) {
                                opcion4(num);
                            }
                            else{
                                if (num ==5) {
                                    opcion5(num);
                                }
                            }
                        }
                    }
                }
            }

        } while (error);

    }

    public static void opcion1(int seleccion1){
        ciclo(seleccion1);
    }

    public static void opcion2(int seleccion2){
        ciclo(seleccion2);
    }

    public static void opcion3(int seleccion3){
        ciclo(seleccion3);
    }

    public static void opcion4(int seleccion4){
        ciclo(seleccion4);
    }

    public static void opcion5(int seleccion5){
        return;
    }

    public static void ciclo(int ciclo){
        Scanner entrada = new Scanner(System.in);
        int val = 0;
        boolean repetir = false;

        do {
            System.out.println("\n");
            System.out.println("Esta ingresando en la opcion " + ciclo + "\n");
            System.out.println("Para volver al menu coloque 6");
            System.out.println("Para salir coloque 5");
            val = entrada.nextInt();

            if (val == 6) {
                error = true;
                repetir = false;
            }
            else {
                if (val == 5) {
                    error = false;
                    repetir = false;
                }
                else{
                    System.out.println("\n\n\n");
                    System.out.println("Por favor ingrese solo el valor 6 o 5");
                    repetir = true;
                }
            }
        } while (repetir);
    }
}
