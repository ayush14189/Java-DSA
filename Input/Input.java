import java.util.*;

public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Print input string until space
        String input = sc.next();
        System.out.println(input);

        //Print full input string
        String name = sc.nextLine();
        System.out.println(name);

        //Print input integer
        int number = sc.nextInt();
        System.out.print(number);

        //Print input floating value
        float price = sc.nextFloat();
        System.out.println(price);

        // Print input double value
        double value = sc.nextDouble();
        System.out.println(value);

        //Print input boolean value
        boolean choice = sc.nextBoolean();
        System.out.println(choice);

        //Print input short value
        short val = sc.nextShort();
        System.out.println(val);

        //Print input long value
        long no = sc.nextLong();
        System.out.println(no);
    }
}