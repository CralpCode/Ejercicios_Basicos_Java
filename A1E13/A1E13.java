
import java.util.Scanner;

public class A1E13 {
    public static void main(String[] args) {
        int radio,altura,volumen = 0;
        boolean error = false;

        try (Scanner entrada = new Scanner(System.in)) {

            do {

                System.out.println("Ingrese el radio del cilindro");
                radio = entrada.nextInt();
                System.out.println("Ingrese la altura del cilindro");
                altura = entrada.nextInt();

                if (radio > 0 && altura >0) {

                    volumen = (int) (3.141516*radio*radio*altura);
                    System.out.println("El volumen del cilindro es " + volumen );
                    error = false;

            }
            else{
                System.out.println("Por favor ingrese un número positivo o valor correcto ");
                error = true;
            }

            } while (error);

        }catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 	 }
    }
}
