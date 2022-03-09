import java.util.Scanner;

public class A1E3 {

	public static void main(String[] args) {
			int doble,triple = 0;
			int n = 0 ;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Ingrese un numero");
			n = entrada.nextInt();

			doble = n*2;
            triple = n*3;

            System.out.println("El doble del número es " + doble);
            System.out.println("El triple del número es " + triple);
		}catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 }
	}
}