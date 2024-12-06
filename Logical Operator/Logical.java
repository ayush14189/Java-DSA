import java.util.*;

public class Logical{
    public static void main(String args[]){
        //Logical AND
        System.out.println((3>2) && (5>4)); //True AND True
        System.out.println((3<2) && (5>4)); //False AND True
        System.out.println((3>2) && (5<4)); //True AND False
        System.out.println((3<2) && (5<4)); //False AND False
        //Logical OR
        System.out.println((3>2) || (5>4)); //True OR True
        System.out.println((3<2) || (5>4)); //False OR True
        System.out.println((3>2) || (5<4)); //True OR False
        System.out.println((3<2) || (5<4)); //False OR False
        //Logical NOT
        System.out.println(!(3>2)); //NOT True
        System.out.println(!(3<2)); //NOT False
    }
}