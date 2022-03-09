/**
 * A2E7
 */
public class A2E7 {
    public static void main(String[] args) {
        int aleat = 0;
        float conteoP = 0;
        float conteoimP = 0;
        float conteoC = 0;
        float porcI = 0;
        float porcP = 0;
        float porcC = 0;

        for (int i = 0; i < 15; i++) {
        aleat =(int) (Math.random()*(36));
       
        if (aleat % 2 == 0 && aleat != 0) {
            conteoP = conteoP + 1;
        } else if (aleat % 2 != 0 && aleat != 0 ) {
            conteoimP = conteoimP + 1;
        } else {
            conteoC = conteoC + 1;
        }
        }

        porcP = conteoP / 15;
        porcI = conteoimP/15;
        porcC = conteoC/15;

        System.out.println("El porcentaje de números pares es " + porcP);
        System.out.println("El porcentaje de números impares es " + porcI );
        System.out.println("El porcentaje de números ceros es " + porcC);
    }
}