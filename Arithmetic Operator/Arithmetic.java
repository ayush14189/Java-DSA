import java.util.*;

public class Arithmetic{
    public static void main(String args[]){
        int A = 10;
        int B = 5;

        //Binary Operators
        System.out.println("Sum = " + (A+B));
        System.out.println("Difference = " + (A-B));
        System.out.println("Product = " + (A*B));
        System.out.println("Divide = " + (A/B));
        System.out.println("Remainder = " + (A%B));

        //Unary Operators

        //Pre-Increment Operator
        B = ++A;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        //Post-Increment Operator
        B = A++;
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        //Pre-Decrement Operator
        B = --A;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        //Post-Decrement Operator
        B = A--;
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}