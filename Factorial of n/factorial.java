import java.util.*;

public class factorial {
    public static int factorial(int n) {
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact *= i; 
        }
        return fact;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println("Factorial is : " + factorial);
    }
    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int binCoeff = n_fact / (r_fact*nmr_fact);
        return binCoeff;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n & r : ");
        int n = scn.nextInt();
        int r = scn.nextInt();
        int binCoeff = binCoeff(n, r);
        System.out.println("Binomial Coefficient is : " + bin);
    }
}
