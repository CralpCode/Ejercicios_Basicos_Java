import java.util.Scanner;

public class A1E17 {
    public static void main(String[] args) {
        int a,b,c,isoceles = 0;
        boolean error = false;
        try (Scanner entrada = new Scanner(System.in)) {
            do {
                System.out.println("Ingrese el primer lado del triangulo");
                a = entrada.nextInt();
                System.out.println("Ingrese el segundo lado del triangulo");
                b = entrada.nextInt();
                System.out.println("Ingrese el tercer lado del triangulo");
                c = entrada.nextInt();

                if (a <= 0 || b <= 0 || c <= 0) {
                    System.out.println("Por favor ingrese valores positivos");
                    error = true;
                }
                else{
                    if (a == b && a == c) {
                        System.out.println("El triangulo es equilatero ");
                        isoceles = isoceles + 1;
                        error = false;
                    }
                    if (a != b && a != c ) {
                        System.out.println("El triangulo es escaleno ");
                        isoceles = isoceles + 1;
                        error = false;
                    }
                    if (isoceles == 0)  {
                        System.out.println("El triangulo es isóceles ");
                        error = false;
                    }
                }
            } while (error);
        }catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 }
    }
}
