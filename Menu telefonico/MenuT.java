import java.util.Scanner;


public class MenuT {
    static boolean error;
    static int conteo1 = 0;
    static int conteo2 = 0;
    static int conteo3 = 0;
    static int conteo4 = 0;
    static String [][] CantidadNom;
    static int [][] CantidadNum;
    static int contactos = 0;
    static int contactosTotal = 0;

    public static void main(String[] args) {
        int num = 0;
        error = false;
        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("              Menú       ");
            System.out.println("1. Agregar contactos");
            System.out.println("2. Listado de contactos");
            System.out.println("3. Agregar correos");
            System.out.println("4. Listado de correos");
            System.out.println("5. Salir");
            System.out.println("Elija una opción del 1-5");
            num = entrada.nextInt();

            if (num > 0 && num <= 5) {
                if (num == 1){
                    opcion1(num);
                    conteo1 = conteo1 + 1;
                }
                else{
                    if (num == 2) {
                        opcion2(num);
                        conteo2 = conteo2 +1;
                    }
                    else{
                        if (num == 3) {
                            opcion3(num);
                            conteo3 = conteo3 +1;
                        }
                        else {
                            if (num == 4) {
                                opcion4(num);
                                conteo4 = conteo4 +1;
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

        Scanner entrada = new Scanner(System.in);
        String nombre;
        int numeroT = 0;
        int i;
        boolean repetir = false;

        do {
            System.out.println("\n");
            System.out.println("Iniaciando agregar contactos");
            System.out.println("\n");
            System.out.println("Cuantos contactos desea agregar");
            contactos = entrada.nextInt();

        if (contactos > 0) {

            CantidadNom = new String[(conteo1+1)][contactos];
            CantidadNum = new int [(conteo1+1)][contactos];

            contactosTotal = contactosTotal + contactos; 

            for (i = 0; i < contactos; i++) {

                System.out.println("\n");
                System.out.println("Ingrese el nombre " + (i+1));
                nombre = entrada.next();
                System.out.println("Ingrese el número telefonico" + (i+1));
                numeroT = entrada.nextInt();

                if (numeroT < 100000000 && numeroT > 9999999) {

                    CantidadNom[(conteo1)][(i)] = nombre;
                    CantidadNum[(conteo1)][(i)] = numeroT;

                } else {
                    System.out.println("Por favor ingrese un número de 8 digitos");
                    i = (i-1);
                }
            }

            ciclo(seleccion1);
            repetir = false;

        } else {
            System.out.println("Por favor ingrese una cantidad positiva");
            repetir = true;
        }

        } while (repetir);

    }

    public static void opcion2(int seleccion2){
        System.out.println("\n\n\n\n");
        System.out.println("Listado de Contactos");
        for (int i = 0; i < contactosTotal; i++) {
            System.out.println("Contacto " + (i+1));
            System.out.println("Nombre : " + CantidadNom[(conteo1-1)][i]);
            System.out.println("Número : " + CantidadNum[(conteo1-1)][i]);
        }
        ciclo(seleccion2);
    }

    public static void opcion3(int seleccion3){
        ciclo(seleccion3);
    }

    public static void opcion4(int seleccion4){
        ciclo(seleccion4);
    }

    public static void opcion5(int seleccion5){
        error = false;
    }

    public static void ciclo(int ciclo){
        Scanner entrada = new Scanner(System.in);
        int val = 0;
        boolean repetir = false;

        do {
            System.out.println("\n");
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

