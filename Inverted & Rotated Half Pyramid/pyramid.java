import java.util.Scanner;

public class pyramid {
    public static void halfPyramid(int n) {
        for (int i=1; i<=n; i++) {
            //  Spaces
            for (int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //  Stars
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        halfPyramid(n);
    }
    
}