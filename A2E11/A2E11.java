import java.util.Scanner;

public class A2E11 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int n = 0;
            float conteoP = 0;
            Integer conteoDa = 0;
            float sumaP = 0;
            float promP = 0;
            Integer mayor = 0;

            for (int i = 0; i < 10; i++) {

                System.out.println((i+1)+") Ingrese el número ");
                n = entrada.nextInt();

                if (n >= 0 && n <= 36) {
                    if ( n % 2 == 0){
                        sumaP = sumaP + n;
                        conteoP = conteoP + 1;
                    }
                    if ( n > 12 && n < 25){
                        conteoDa = conteoDa + 1;
                    }
                    if ( n > mayor){
                        mayor = n;
                    }
                }
                else{
                    System.out.println("Ingrese solo valores positivos del 0 al 36");
                    i = i-1;
                }

            }
            promP = sumaP/conteoP;
                    System.out.println("La cantidad de números pares es " + conteoP);
                    System.out.println("El promedio de números pares es " + promP);
                    System.out.println("La cantidad de números que estan entre 13 y 24 es " + conteoDa);
                    System.out.println("El número más grande es " + mayor);
        }catch(Exception e){
			System.out.println("Ingrese valores numericos correctos");
		}
    }
}
