import java.util.Scanner;

public class A2E10 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int n,conteo = 0;
            int nsuma = 0;
            int suma = 0;
            while (suma <= 1000) {
                System.out.println("Ingrese n numeros y se avisara cuando estos sumen 1000 o mas");
                n = entrada.nextInt();
                suma = suma + n;
                if (n % 6 == 0) {
                    conteo = conteo + 1;
                }
                if (n >= 1 && n <= 10) {
                    nsuma = nsuma + n;
                }
                if (suma >= 1000) {
                    System.out.println("Felicidades los números ingresados dan 1000 o mas");
                    System.out.println("La cantidad de números multiplos de 6 son " + conteo);
                    System.out.println("La suma de los números que hay entrre 1 y 10 es " + nsuma);
                    return;
                }
            }
        }catch(Exception e){
			System.out.println("Ingrese valores numericos correctos");
		}
    }
}
