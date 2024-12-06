import java.util.*;

public class Assignment{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Answer 1
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();
        float avg = ((A + B + C)/3);
        System.out.println("Average is: " + avg);

        //Answer 2
        float side = sc.nextFloat();
        float area = (side * side);
        System.out.println("Area of square is: " + area);

        //Answer 3
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = (pencil + pen + eraser);
        System.out.println("Total Cost is: " + cost);

        float total = cost + 0.18f * cost;
        System.out.println("Bill with 18% GST is: " + total);

        //Answer 5
        int $ = 24; // No Error
    }
}