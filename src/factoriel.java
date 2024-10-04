import java.util.Scanner;

public class factoriel {

    public int facto(int n) {
        if (n == 0) {
            return 1;
        }
        return n * (facto(n - 1));
    }

    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        System.out.println("enter a Value");
        int n = kdb.nextInt();
        //int result = facto(n);
        //System.out.println(result);

        factoriel calcule = new factoriel();

        System.out.println(calcule.facto(n));
    }
}
