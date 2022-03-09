import java.util.Scanner;

public class A2E9 {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            float T1 = 0;
            float T2 = 0;
            float temp1 = 0;
            float temp2 = 0;
            float conteoT1 = 0;
            float conteoT2 = 0;
            float promT = 0;

                System.out.println("Temperatura 1");
                temp1 = entrada.nextFloat();
                System.out.println("Temperatura 2");
                temp2 = entrada.nextFloat();

                if (temp1 > 0 && temp2 > 0 ) {
                    for (int w = 1; w <= temp2; w++) {
                        if (w > 4 && w < 16){
                                T2 = T2 + w;
                                conteoT2 = conteoT2 + 1;
                        }
                        System.out.println("Valores T2 = " + w);
                    }

                    for (int j = 1; j <= temp1; j++) {
                        if (j > 4 && j < 16 ){
                                T1 = T1 + j;
                                conteoT1 = conteoT1 + 1;
                        }
                        System.out.println("Valores T1 = " + j);
                    }

                    promT = (T1 + T2)/(conteoT1 + conteoT2);
                    System.out.println("El promedio de las temperaturas entre 5 y 15 grados es " + promT);

                }

                    if(temp1 < 0 && temp2 < 0 ) {
                        int j;
                        int w;

                        for ( w = 1; w <= (temp2*-1); w++) {

                            System.out.println("Valores T2 = " + (w*-1));
                        }

                        for (j = 1; j <= (temp1*-1); j++) {

                            System.out.println("Valores T1 = " + (j*-1));
                        }
                    }

                    if(temp1 > 0 && temp2 < 0 ) {

                        for (int w = 1; w <= (temp2*-1); w++) {

                            System.out.println("Valores T2 = " + (w*-1));
                        }

                        for (int j = 1; j <= temp1; j++) {
                            if (j > 4 && j < 16 ){
                                    T1 = T1 + j;
                                    conteoT1 = conteoT1 + 1;
                            }
                            System.out.println("Valores T1 = " + j);
                        }
                        T2 = 0;
                        conteoT2 = 0;

                        promT = (T1 + T2)/(conteoT1 + conteoT2);
                        System.out.println("El promedio de las temperaturas entre 5 y 15 grados es " + promT);
                    }

                    if(temp1 < 0 && temp2 > 0 ) {

                        for (int w = 1; w <= temp2; w++) {
                            if (w > 4 && w < 16){
                                    T2 = T2 + w;
                                    conteoT2 = conteoT2 + 1;
                            }
                            System.out.println("Valores T2 = " + w);
                        }

                        for (int j = 1; j <= (temp1*-1); j++) {

                            System.out.println("Valores T1 = " + (j*-1));
                        }

                        T1 = 0;
                        conteoT1 = 0;

                        promT = (T1 + T2)/(conteoT1 + conteoT2);
                        System.out.println("El promedio de las temperaturas entre 5 y 15 grados es " + promT);
                    }
                    if (temp1 == 0 && temp2 == 0) {
                        System.out.println("Ambas temperaturas son 0 porfar agregue valores positivos o negat");
                    }
        }catch(Exception e){
			System.out.println("Ingrese valores numericos correctos");
		 }
    }
}
