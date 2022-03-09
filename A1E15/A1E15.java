import java.util.Scanner;

public class A1E15 {
    public static void main(String[] args) {
        int a,c = 0;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingrese un número");
            a = entrada.nextInt();

            if ( a > 0 ) {
                System.out.println("El número es positivo" );
                c = c + 1;
            }
            else{
                if ( a < 0 ){
                    System.out.println("El número es negativo" );
                    c = c + 1;
                }
                 else {
                    if ( a == 0 ){
                        System.out.println("El número es igual a cero" );
                      }
                 }
            }
        }catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 }
    }
}
