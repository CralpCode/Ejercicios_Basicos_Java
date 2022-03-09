import java.util.Scanner;

public class A1E20 {
    public static void main(String[] args) {
        String a = "";
        Integer cantidad = 0;
        int d1 = 0;
        int d2 = 0;
        int d3 = 0;
        int d4 = 0;
        int d5 = 0;
        int b = 0;
        boolean error = false;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("ingrese 5 digitos");
        a = entrada.nextLine();
        cantidad = a.length();
        if (cantidad == 5) {

            b =Integer.parseInt(a.substring(0,5));
            d1 = Integer.parseInt(a.substring(0,1));
            d2 = Integer.parseInt(a.substring(1,2));
            d3 = Integer.parseInt(a.substring(2,3));
            d4 = Integer.parseInt(a.substring(3,4));
            d5 = Integer.parseInt(a.substring(4,5));

            if (d1 == d5 && d2 == d4 && d1 != d2 ) {
                System.out.println("El número es capicúa");
            }
            else{
                if (d1 == d5 && d1 == d4 && d1 == d2 && d1 != d3) {
                    System.out.println("El número es capicúa");
                }
                else{
                    if (d1 == d5 && d1 == d4 && d1 == d2 && d1 == d3) {
                        System.out.println("El número es capicúa");
                    }
                    else{
                        System.out.println("El número no es capicúa");
                    }
                }
            }
            error = false;
        }
        else{
            System.out.println("Ingrese un valor de 5 digitos o valores correctos");
            error = true;
        }
        } while (error);
    }
}
