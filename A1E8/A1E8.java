
import java.util.Scanner;

public class A1E8 {
    public static void main(String[] args) {
		int a,b,c,promedio = 0;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Ingrese el primer número");
			a = entrada.nextInt();
			System.out.println("Ingrese el segundo número");
			b = entrada.nextInt();
            System.out.println("Ingrese el Tercer número");
			c = entrada.nextInt();

			promedio = (a+b+c)/3;
		System.out.println("El promedio de los numeros es " + promedio);

		}catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 	 }
	}
}
