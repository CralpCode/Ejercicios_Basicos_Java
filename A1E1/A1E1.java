import java.util.Scanner;

public class A1E1{

	public static void main(String[] args) {
		int a,b,suma = 0;
		boolean error = false;
		try (Scanner entrada = new Scanner(System.in)) {
			do {
				System.out.println("Ingrese un numero");
				a = entrada.nextInt();
				System.out.println("Ingrese un numero");
				b = entrada.nextInt();
				suma = a+b;

				if(a < 0 || b < 0){
					error = true;
					System.out.println("Por favor ingrese números positivos");
				}
				else{
					if (a >= 0 && b >= 0) {
						error = false;
						System.out.println("La suma de los dos números es " + suma);
					}
				}
			} while (error);
		}
		catch(Exception e){
            System.out.println("Ingrese valores numericos");
        }
	}

}