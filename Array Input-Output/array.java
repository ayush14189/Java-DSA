import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        //  Input / Output
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Physics : " + marks[0]);
        System.out.println("Chemistry : " + marks[1]);
        System.out.println("Maths : " + marks[2]);

        //  Update Array
        marks[2] = 100;
        System.out.println("Maths: " + marks[2]);
        marks[1] += 1;
        System.out.println("Chemistry : " + marks[1]); 

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");

        System.out.println("Length of array = " + marks.length);
    }
}
