import java.util.Scanner;

public class A2E1 {
    public static void main(String[] args) {
        Integer n,aleat = 0;
        boolean error = false;
        try (Scanner entrada = new Scanner(System.in)) {

            do {
                System.out.println("Ingrese la cantidad de números aleatorios");
                n = entrada.nextInt();

                if (n > 0 ) {

                    System.out.println("Los números aleatorios son:");

                    for (int i = 0; i < n; i++) {
                        aleat = (int) (Math.random()*(1000-1)) + 1;
                        System.out.println((i+1)+ ") " + aleat);
                        error = false;
                    }

                } else {
                    System.out.println("Ingrese números positivos");
                    error = true;
                  }

            } while (error);

        }
        catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 }
    }
}
