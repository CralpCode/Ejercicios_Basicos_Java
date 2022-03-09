import java.util.Scanner;

public class A1E4 {
    public static void main(String[] args) {
		int a,cuadrado, cubo = 0;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Ingrese un numero");
			a = entrada.nextInt();

			cuadrado = a*a;
            cubo = a*a*a;
			System.out.println("El cuadrado del número es " + cuadrado);
        	System.out.println("El cubo del número es " + cubo);

		}catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 	 }
	}
}
