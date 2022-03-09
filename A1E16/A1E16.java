import java.util.Scanner;

public class A1E16 {
    public static void main(String[] args) {
        int a,b,c,mayor = 0;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingrese el primer número");
            a = entrada.nextInt();
            System.out.println("Ingrese el segundo número");
            b = entrada.nextInt();
            System.out.println("Ingrese el Tercer número");
            c = entrada.nextInt();

            if (mayor < a ) {
                mayor = a;
            }
            if (mayor < b ) {
                mayor = b;
            }
            if (mayor < c ) {
                mayor = c;
            }
            System.out.println("El número mayor es " + mayor);
        }catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 }
    }
}
