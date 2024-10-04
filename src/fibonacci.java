import java.util.Scanner;

import static java.lang.Math.sqrt;

public class fibonacci {
    public int fibo(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static float fibonaciPerformant(double n){
        double phi = (1+sqrt(5))/2;
        double v = (Math.pow(phi,n) - Math.pow(-phi,-n)) / sqrt(5);
        return (float) v;
    }

    public static void main(String[] args) {
        Scanner kdb = new Scanner(System.in);
        System.out.println("enter a Value");
        int n = kdb.nextInt();

        System.out.println(fibonaciPerformant(n));
    }
}
