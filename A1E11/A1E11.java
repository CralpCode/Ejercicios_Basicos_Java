
import java.util.Scanner;

public class A1E11 {
    public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
            float a,yardas,metros,pies,pulgadas = 0;
            Boolean error = false;

            do {

                System.out.println("Ingrese el valor en cm");
                a = entrada.nextInt();

                if (a > 0) {
                    yardas = (float) (a*(0.0109361));
                    metros = (float) (a*0.01);
                    pies = (float) (a*0.0328084);
                    pulgadas = (float) (a*0.393701);
            
                    System.out.println("El valor en yardas de " + a + " cm es " + yardas);
                    System.out.println("El valor en metros de " + a + " cm es " + metros);
                    System.out.println("El valor en pies de " + a + " cm es " + pies);
                    System.out.println("El valor en pulgadas de " + a + " cm es " + pulgadas);

                    error = false;
                }

                else{
                    if (a <= 0) {
                        System.out.println("Ingrese valores positivos " );
                        error = true;
                    }
                }

            } while (error);

        }catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 	 }
	}
}
