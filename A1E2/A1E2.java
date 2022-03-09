import java.util.Scanner;

public class A1E2 {
    public static void main(String[] args) {
		String a,b = "";
		Scanner entrada = new Scanner(System.in);
			System.out.println("Ingrese el nombre del pais");
			a = entrada.nextLine();
            System.out.println("Ingrese el nombre de la capital");
			b = entrada.nextLine();

            System.out.println(b + " es la capital de " + a);
	}
}
