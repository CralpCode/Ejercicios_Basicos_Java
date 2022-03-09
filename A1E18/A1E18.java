import java.util.Scanner;

public class A1E18 {
    public static void main(String[] args) {
        String a = "";
        Integer suma,cantidad = 0;
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int b = 0;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("ingrese 1 o 4 digitos");
            a = entrada.nextLine();
            cantidad = a.length();

            if (cantidad == 4) {
                b =Integer.parseInt(a.substring(0,4));
            }
            if (cantidad == 3) {
                b =Integer.parseInt(a.substring(0,3));
            }
            if (cantidad == 2) {
                b =Integer.parseInt(a.substring(0,2));
            }
            if (cantidad == 1) {
                b =Integer.parseInt(a.substring(0,1));
            }
            if (b > 999 && b < 10000 ) {
                d1 = Integer.parseInt(a.substring(0,1));
                d2 = Integer.parseInt(a.substring(1,2));
                d3 = Integer.parseInt(a.substring(2,3));
                d4 = Integer.parseInt(a.substring(3,4));
                suma = d1 + d2 + d3 + d4 ;
                System.out.println(" d1 = "+ d1 + " d2 = "+ d2 + " d3 = "+ d3 +" d4 = "+ d4 + " suma " + suma);
            }

            if (b > 99 && b < 1000) {
                d2 = Integer.parseInt(a.substring(0,1));
                d3 = Integer.parseInt(a.substring(1,2));
                d4 = Integer.parseInt(a.substring(2,3));
                d1 = 0;
                suma = d1 + d2 + d3 + d4 ;
                System.out.println(" d1 = "+ d1 + " d2 = "+ d2 + " d3 = "+ d3 +" d4 = "+ d4 + " suma " + suma);
            }
            if (b > 9 && b < 100) {
                d3 = Integer.parseInt(a.substring(0,1));
                d4 = Integer.parseInt(a.substring(1,2));
                d2 = 0;
                d1 = 0;
                suma = d1 + d2 + d3 + d4 ;
                System.out.println(" d1 = "+ d1 + " d2 = "+ d2 + " d3 = "+ d3 +" d4 = "+ d4 + " suma " + suma);
            }
            if (b > 0 && b < 9) {
                d4 = Integer.parseInt(a.substring(0,1));
                d3 = 0;
                d2 = 0;
                d1 = 0;
                suma = d1 + d2 + d3 + d4 ;
                System.out.println(" d1 = "+ d1 + " d2 = "+ d2 + " d3 = "+ d3 +" d4 = "+ d4 + " suma " + suma);
            }
            if (b <= 0) {
                System.out.println("Por favor ingrese números positivos");
            }
        }catch(Exception e){
			System.out.println("Ingrese valores numericos");
		 }
    }
}
