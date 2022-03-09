import java.util.Scanner;

public class A1E5 {
    public static void main(String[] args) {
		int n,siguiente = 0;
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Ingrese un numero");
			n = entrada.nextInt();

			siguiente = n+1;

            System.out.println("El número siguiente es " + siguiente);
			
		}catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 	 }
	}

}
