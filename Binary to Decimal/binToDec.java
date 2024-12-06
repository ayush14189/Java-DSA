import java.util.Scanner;

public class binToDec {
    public static int binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (int)(lastDigit*Math.pow(2, pow));
            binNum = binNum / 10;
            pow++;
        }
        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        int binNum = sc.nextInt();
        System.out.println("Decimal of " + binNum + " : " + binToDec(binNum)); 
    }
}
