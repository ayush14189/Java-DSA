import java.util.*;

public class decToBin {
    public static int decToBin(int n){
        int pow = 0;
        int binNum = 0;
        while (n>0) {
            int rem = n%2;
            binNum = binNum + (int)(rem*Math.pow(10,pow));
            n /= 2;
            pow++; 
        }
        return binNum;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int decNum = sc.nextInt();
        System.out.print("Binary of " + decNum + " : " + decToBin(decNum));
    }
}
