import java.util.Scanner;

public class A2E3 {
    public static void main(String[] args) {
        int n,facto = 0;
        boolean error = false;
		try (Scanner entrada = new Scanner(System.in)) {

            do {
                System.out.println("Ingrese un numero");
                n = entrada.nextInt();
                facto = 1;

                if (n > 0) {
                    for (int i = 1; i <= n; i++) {
                        facto = facto*i;
                    }
                    System.out.println("El factorial del número es " + facto);
                    error = false;
                }
                else{
                    System.out.println("Ingrese valores mayores a 0");
                    error = true;
                }
            } while (error);

        }catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 }
    }
}
