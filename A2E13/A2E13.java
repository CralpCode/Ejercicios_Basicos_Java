import java.util.Scanner;

public class A2E13 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int seleccion = 0;
            int a = 0;
            int b = 0;
            int suma = 0;
            int resta = 0;
            int multi = 0;
            float Dividir = 0;
            float n1 = 0;
            float n2 = 0;
            String menu;
            while (seleccion != 5) {

                System.out.println("              Menú       ");
                System.out.println("1. Suma");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                System.out.println("Elija una opción del 1-5");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 5){
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    System.out.println(" ");
                    switch (seleccion) {
                        case 1: menu = "Sumar";
                        System.out.println("Suma");
                        System.out.println("Ingrese el primer numero");
                        a = entrada.nextInt();
                        System.out.println("Ingrese el segundo numero");
                        b = entrada.nextInt();

                        suma = a + b;
                        System.out.println("La suma de los dos numeros da " + suma);
                        System.out.println("En 5 segundos volvera al menu");
                        try {
                            Thread.sleep(5*1000);
                         } catch (Exception e) {
                            System.out.println(e);
                         }
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        break;
   
                        case 2: menu = "Restar";
                        System.out.println("Resta");
                        System.out.println("Ingrese el primer numero");
                        a = entrada.nextInt();
                        System.out.println("Ingrese el segundo numero");
                        b = entrada.nextInt();

                        resta = a - b;
                        System.out.println("La resta de los dos numeros da " + resta);
                        System.out.println("En 5 segundos volvera al menu");
                        try {
                            Thread.sleep(5*1000);
                         } catch (Exception e) {
                            System.out.println(e);
                         }
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");

                        break;
   
                        case 3: menu = "Multiplicar";
                        System.out.println("Multiplicación");
                        System.out.println("Ingrese el primer numero");
                        a = entrada.nextInt();
                        System.out.println("Ingrese el segundo numero");
                        b = entrada.nextInt();

                        multi = a * b;
                        System.out.println("La multiplicación de los dos numeros da " + multi);
                        System.out.println("En 5 segundos volvera al menu");
                        try {
                            Thread.sleep(5*1000);
                         } catch (Exception e) {
                            System.out.println(e);
                         }
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");

                        break;
   
                        case 4: menu = "Dividir";
                        System.out.println("Division");
                        System.out.println("Ingrese el primer numero");
                        n1 = entrada.nextInt();
                        System.out.println("Ingrese el segundo numero");
                        n2 = entrada.nextInt();

                        if(n2 == 0){
                            System.out.println("no se puede dividir por cero");
                            System.out.println("En 5 segundos volvera al menu");
                        try {
                            Thread.sleep(5*1000);
                         } catch (Exception e) {
                            System.out.println(e);
                         }
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                            break;
                        }

                        Dividir = n1 / n2;
                        System.out.println("La division de los dos numeros da " + Dividir);
                        System.out.println("En 5 segundos volvera al menu");
                        try {
                            Thread.sleep(5*1000);
                         } catch (Exception e) {
                            System.out.println(e);
                         }
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        break;
   
                        case 5: menu = "Salir";
                    
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
                        System.out.println(" ");
   
                        break;
   
                    default:
                        break;
                    }
                }
                
            }
        }catch(Exception e){
			System.out.println("Ingrese valores numericos correctos");
		}
    }
}
