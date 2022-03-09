
import java.util.Scanner;

public class A1E9 {
    public static void main(String[] args) {
		String a,b,c = "";
		Scanner entrada = new Scanner(System.in);
			System.out.println("Ingrese una palabra");
			a = entrada.nextLine();
			System.out.println("Ingrese otra palabra");
			b = entrada.nextLine();
            c = a;
            a = b;
            b = c;
		System.out.println("El cambio del valor que da como " );
        System.out.println(a);
        System.out.println(b);

	}
}
