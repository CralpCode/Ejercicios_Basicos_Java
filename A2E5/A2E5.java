import java.util.Scanner;

public class A2E5 {
    public static void main(String[] args) {
            int numM = 0;
            int numF = 0;
            int conteoMayor = 0;
            int conteoMenor = 0;
            boolean error = false;
        try (Scanner entrada = new Scanner(System.in)) {

                do {

                    System.out.println(" ");
                    System.out.println("Ingrese la cantidad de mujeres que desea registrar");
                    numF = entrada.nextInt();
                    int[] cantidadF = new int[numF];

                    if (numF > 0) {
                        for (int i = 0; i < numF; i++) {

                            System.out.println(" ");
                            System.out.println("Dime la edad" + (i+1));
                            cantidadF[i] = entrada.nextInt();

                                if (cantidadF[i] > 17 && cantidadF[i]< 149) {
                                        conteoMayor = conteoMayor + 1;
                                }
                                if (cantidadF[i] <= 0 || cantidadF[i] > 149) {
                                        System.out.println(" ");
                                        System.out.println("Por favor ingrese edades reales");
                                        i = i-1;
                                }
                        }
                        error = false;
                    }
                    else{
                        System.out.println(" ");
                        System.out.println("Ingrese valores reales");
                        error = true;
                    }
                } while (error);

                do {
                    System.out.println(" ");
                    System.out.println("Ingrese la cantidad de Hombres que desea registrar");
                    numM = entrada.nextInt();
                    int[] cantidadM = new int[numM];

                    if (numM > 0) {
                        for (int i = 0; i < numM; i++) {
                            System.out.println(" ");
                            System.out.println("Dime la edad" + (i+1));
                            cantidadM[i] = entrada.nextInt();

                            if (cantidadM[i] < 18 && cantidadM[i] > 0 ) {
                            conteoMenor = conteoMenor + 1;
                            }
                            if (cantidadM[i] == 0 || cantidadM[i] > 149) {
                                    System.out.println(" ");
                                    System.out.println("Por favor ingrese edades reales");
                                    i = i-1;
                            }
                        }
                        error = false;
                    }
                    else{
                        System.out.println(" ");
                        System.out.println("Ingrese valores reales");
                        error = true;
                    }
                } while (error);

                        System.out.println("La cantidad de mujeres mayores de edad es " + conteoMayor);
                        System.out.println("La cantidad de hombres menores de edad es " + conteoMenor);
                        error = true;

        }
        catch(Exception e){
			System.out.println("Ingrese valores numericos correctos");
		 }
    }
}
