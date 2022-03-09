import java.util.Scanner;

public class A2E4 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int menor = 0;
            int mayor = 0;
            int[] Edades = new int[21];

            for (int i = 0; i <= 19; i++) {
                System.out.println("Dime la edad "+ (i+1) );
                Edades[i] = entrada.nextInt();
                System.out.println(Edades[i]);
                menor = Edades[0];

                if (Edades[i] > 0 && Edades[i] < 150) {
                    if (mayor < Edades[i]){
                        mayor = Edades[i];
                    }
                    if (menor > Edades[i]){
                        menor = Edades[i];
                    }
                    if (i == 19){
                        System.out.println("La persona de menor edad es de : " + menor + " años");
                        System.out.println("La persona de mayor edad es de : " + mayor + " años");
                    }
                }
                if (Edades[i] < 1 || Edades[i] > 149) {
                    System.out.println("Ingrese valores positivos o reales");
                    i = i-1;
                }
            }
        }catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 }
    }
}
