import java.util.Scanner;

public class A1E12 {
    public static void main(String[] args) {
		int a,fahrenheit = 0;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Ingrese la temperatura en grados celsius");
			a = entrada.nextInt();

			fahrenheit = (int) (a*(1.8) + 32);

			System.out.println("El valor en fahrenheit de " + a + " grados celsius es de "  + fahrenheit + " grados fahrenheit ");

		}catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 	 }

	}
}
