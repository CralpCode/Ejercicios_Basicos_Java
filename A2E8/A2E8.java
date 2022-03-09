import java.util.Scanner;

public class A2E8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String letra = "";
        int i = 0;

        while (true) {
            System.out.println("Ingrese la letra s para parar el bucle");
            System.out.println((i = (int) (Math.random()*1000)*5));
            System.out.println((i = (int) (Math.random()*1000)*5));
            System.out.println((i = (int) (Math.random()*1000)*5));
            System.out.println((i = (int) (Math.random()*1000)*5));
            System.out.println((i = (int) (Math.random()*1000)*5));
            System.out.println((i = (int) (Math.random()*1000)*5));
            System.out.println((i = (int) (Math.random()*1000)*5));
            letra = entrada.next();
            if (letra.equals("s") || letra.equals("S")) {
                break;
            }
        }
    }
}
