import java.util.Scanner;

public class A2E12 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            String fom;
            float altura = 0;
            float sumaAM = 0;
            float conteM = 0;
            float conteF = 0;
            float sumaAF = 0;
            float promM = 0;
            float promF = 0;
            float edad  = 0;
            float promE = 0;
            float sumaE = 0;
            float n = 0;
            boolean error = false;

            do {
                System.out.println("Indique cuantos participantes hay en el curso");
                n = entrada.nextInt();
                if (n > 0) {
    
                    for (int i = 0; i < n; i++) {
                        System.out.println( "Persona "+(i+1));
                        System.out.println((i+1) + ") Ingrese la altura en metros ");
                        altura = entrada.nextFloat();
                        if (altura <= 0) {
                            return;
                        }

                            System.out.println((i+1) + ") Ingrese la edad");
                            edad = entrada.nextInt();

                            if (edad <= 0 || edad >= 150) {
                                System.out.println("Por favor vuelva a ingresas los datos e ingrese la de edad correcta");
                                i = (i-1);
                            }
                            else{
                                sumaE = sumaE + edad;
                                System.out.println((i+1)+") Ingrese el sexo (F/M)");
                                fom = entrada.next();
                                System.out.println(" ");
    
                                if (fom.equals("m") || fom.equals("M")) {
                                sumaAM = sumaAM + altura;
                                conteM = conteM + 1;
                                }else if
                                (fom.equals("f") || fom.equals("F")) {
                                sumaAF = sumaAF + altura;
                                conteF = conteF + 1;
                                }else{
                                    System.out.println("Por favor vuelva a ingresar los datos e ingrese el sexo correcto");
                                    i = (i-1);
                                }
                            }
                    }

                    promF = sumaAF/conteF;
                    promM = sumaAM/conteM;
                    promE = sumaE/n;

                    System.out.println("La altura promedio de las mujeres es " + promF + " mts");
                    System.out.println("La altura promedio de los hombres es " + promM + " mts");
                    System.out.println("La edad promedio de la clase es " + promE + "años");
                    error = false;
                }
                else{
                    System.out.println("Por favor ingrese los datos correctos");
                    error = true;
                }
            } while (error);

        }catch(Exception e){
			System.out.println("Ingrese valores numericos correctos");
		}
    }
}
