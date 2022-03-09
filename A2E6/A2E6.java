import java.util.Scanner;
/**
 * A2E6
 */
public class A2E6 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int sumaMayor = 0;
            int sumaMenor = 0;
            int contMa = 0;
            int contMe = 0;
            float promMayor = 0;
            float promMenor = 0;
            int[] Edades = new int[100];

             for (int i = 0; i < 100; i++) {
                System.out.println("Dime la edad " + (i+1));
                Edades[i] = entrada.nextInt();

                if (Edades[i] > 24) {
                    sumaMayor = sumaMayor + Edades[i];
                    contMa = contMa+1;
                }
                if (Edades[i] < 25) {
                    sumaMenor = sumaMenor + Edades[i];
                    contMe = contMe+1;
                }
                if (Edades[i] <= 0 || Edades[i] > 149) {
                    System.out.println("Ingrese valores reales");
                    i = i-1;
                }
             }

             promMayor = sumaMayor/contMa;
             promMenor = sumaMenor/contMe;

             System.out.println("Promedio de las parsonas mayores o iguales 25 es " + promMayor);
             System.out.println("Promedio de las parsonas menores a 25 es " + promMenor);
        }
        catch(Exception e){
			System.out.println("Ingrese valores numericos correctos");
		}
    }
}