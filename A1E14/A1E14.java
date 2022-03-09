import java.util.Scanner;

public class A1E14 {
    public static void main(String[] args) {
        int a,b = 0;
        boolean error = false;
        try (Scanner entrada = new Scanner(System.in)) {

            do {

                System.out.println("Ingrese un número");
                a = entrada.nextInt();
                System.out.println("Ingrese otro número");
                b = entrada.nextInt();

                if (b % a == 0 ) {
                    System.out.println("El número es divisible" );
                }
                else{
                    System.out.println("El número no es divisible o ponga valores correctos" );
                }

            } while (error);

        }catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 }
    }
}
