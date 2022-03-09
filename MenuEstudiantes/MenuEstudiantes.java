import java.util.Scanner;

import org.omg.IOP.CodeSets;


public class MenuEstudiantes {
    static boolean error;
    static String[] NombEst = new String[22];
    static int[] CodEst = new int[22];
    static int[] Edad = new int[22];

    public static void main(String[] args) {
        int num = 0;
        error = false;
        Scanner entrada = new Scanner(System.in);

        do {

            System.out.println("              Menú       ");
            System.out.println("1. Ingresar estudiantes");
            System.out.println("2. Buscar estudiante por nombre");
            System.out.println("3. Buscar estudiante por edad");
            System.out.println("4. Listado de estudiantes");
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
        Scanner entrada = new Scanner(System.in);
        boolean repetir = false;

        System.out.println("\n\n\n");
        System.out.println("Iniciado opcion 1" );

        for (int i = 1; i <= 20; i++) {

            System.out.println("\nIngrese el codigo del estudiante " + (i));
            CodEst[(i)] = entrada.nextInt();

            if(CodEst[(i)] <= 20 && CodEst[(i)] > 0 ){

                System.out.println("\nIngrese nombre de estudiante " + (i));
                NombEst[CodEst[(i)]] = entrada.next();

                do {
                    System.out.println("\nIngrese la edad del estudiante " + (i));
                    Edad[(i)] = entrada.nextInt();

                    if (Edad[(i)] < 1 || Edad[i] > 149) {
                    repetir = true;
                    }
                    else{
                    repetir = false;
                    }
                } while (repetir);

            }
            else{
                System.out.println("Por favor ingrse solo valores entre 1 y 20");
                i = i-1;
            }

        }
        ciclo(seleccion1);
    }

    public static void opcion2(int seleccion2){
        Scanner entrada = new Scanner(System.in);
        String  BuscarEstNom;
        int conteoB = 0;

        System.out.println("\n\n\n");
        System.out.println("Ingrese el nombre del estudiate que desea buscar");
        BuscarEstNom = entrada.nextLine();

        for (int j = 1; j <= 20; j++) {

            if (BuscarEstNom.equals(NombEst[j])) {

                conteoB = conteoB + 1;
                System.out.println("\n Nombre : " + NombEst[j]);
                System.out.println(" Codigo : " + CodEst[j]);
                System.out.println(" Edad : " + Edad[j] + "\n");

            } else {
                if( j == 20 && conteoB == 0){
                    System.out.println("El ususario no existe");
                }
            }
        }

        ciclo(seleccion2);
    }

    public static void opcion3(int seleccion3){
        Scanner entrada = new Scanner(System.in);
        int  BuscarEstCod;
        int conteoB = 0;

        System.out.println("Ingrese la edad el estudiate que desea buscar");
        BuscarEstCod = entrada.nextInt();

        for (int j = 1; j <= 20; j++) {
            if (BuscarEstCod == Edad[j]) {

                conteoB = conteoB + 1;
                System.out.println("\n Nombre : " + NombEst[j]);
                System.out.println(" Codigo : " + CodEst[j]);
                System.out.println(" Edad : " + Edad[j] + "\n");

            } else {
                if( j == 20 && conteoB == 0){
                    System.out.println("No hay estudiantes con esa edad");
                }
            }
        }
        ciclo(seleccion3);
    }

    public static void opcion4(int seleccion4){
        System.out.println("\n\n\n\n");
        System.out.println("Listado de Estudiantes");
        System.out.println("  Nombre ---------- Codigo ------ Edad");
        for (int i = 1; i <= 20; i++) {
            System.out.println((i+1)+" "+NombEst[i]+" ---------- "+CodEst[i]+" ---------- "+Edad[i]);
        }
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

