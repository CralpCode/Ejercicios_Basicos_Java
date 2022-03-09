public class A1E19 {
    public static void main(String[] args) {
        int n = 0;
        n = (int) (Math.random()*(1000-1)) + 1;
        System.out.println(n);
        if (n % 5 == 0 && n > 0 && n < 26) {
            System.out.println("correcto");
        }
    }
}
