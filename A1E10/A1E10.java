
import java.util.Scanner;

public class A1E10 {

    public static void main(String[] args) {
    int base,altura,area,perimetro = 0;
    boolean error = false;
        try (Scanner entrada = new Scanner(System.in)) {

            do {
                System.out.println("Ingrese la base del rectangulo");
                base = entrada.nextInt();

                System.out.println("Ingrese la altura del rectangulo");
                altura = entrada.nextInt();

                if (base <= 0 || altura <= 0) {
                System.out.println("Por favor ingrese valores mayores a cero");
                error = true;
                }else{
                error = false;
                area = base*altura;
                perimetro = 2*base + 2*altura;

                System.out.println("El area del rectangulo es " + area );
                System.out.println("El perimetro de rectangulo es " + perimetro);
             }
            } while (error);

        }catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 	 }
    }
}
