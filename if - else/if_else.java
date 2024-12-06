import java.util.*;

public class if_else{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Age = sc.nextInt();
        if (Age >= 18){
            System.out.println("Adult : Can Drive & Vote");
        }
        if (Age >= 13 && Age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult : Cannot Drive & Vote");
        }
    }
}