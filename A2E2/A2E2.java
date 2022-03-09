
import java.util.Scanner;

public class A2E2 {

	public static void main(String[] args) {
		int n, disminuir = 0;
		boolean error = false;

		try (Scanner entrada = new Scanner(System.in)) {
			do {
				System.out.println("Ingrese un numero");
				n = entrada.nextInt();

				disminuir = n;

				if (n > 0) {
					System.out.println("Valores entre su numero y 1");

					for(int i = 1; i < n; i++){
						disminuir = disminuir-1;
						System.out.println(disminuir);
					}
					error = false;

				} else {
					System.out.println("Por favor ingrese números positivos");
					error = true;
			 	  }

			} while (error);

		}catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 }
	}
}


