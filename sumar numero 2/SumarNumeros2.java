import java.util.Scanner;

/**
 * SumarNumeros
 */
public class SumarNumeros {
    public static void main(String[] args) {
        //definir variables
        int numero1, numero2, numero3;
        //pedir números
        numero1 = pedirNumero("numero 1");        
        String numSolicitado = "numero 2";
        numero2 = pedirNumero(numSolicitado);
        numero3 = pedirNumero("numero 3");
        //hacer suma
        int total = numero1+numero2+numero3;
        //mostrar
        System.out.println("el total es "+ total);
    }

    public static int pedirNumero(String identificador){

        Scanner scanner = new Scanner(System.in);

        boolean hayError = false;
        int numero;

        do {
            System.out.println("Ingrese el numero "+identificador+" por favor:");
            numero = scanner.nextInt();
            scanner.nextLine();
            if (numero < 0){
                System.out.println("\n\n Error, número "+numero+" invalido, ingrese un numero positivo");
                hayError = true;
            }
            else{
                hayError = false;
            }

        } while (hayError);
        
        System.out.println("el numero ingresado fue "+ numero);
        System.out.println("\n");

        return numero;
        
        //     si hay error     variable error = true
        //     si no hay error  variable error = false
        //     comparando        error == true (si hay error )   error
        //     comparando        error == false (no hay error )   !error           ! (negación)
    }
}