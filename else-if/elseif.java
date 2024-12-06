import java.util.*;

public class elseif{
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    if (Age >= 18) {
        System.err.println("Adult");
    } else if (Age >= 13 && Age < 18) {
        System.out.println("Teenager");
    } else {
        System.err.println("Child");
    }
}