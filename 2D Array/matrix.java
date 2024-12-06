import java.util.Scanner;

public class matrix {
    public static boolean search(int matrix[][], int key) {
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.print("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
            System.out.println();
        }
        return false;
    }
    public static void main(String[] args) {
        //  input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //  output
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter key to find index of : ");
        int key = 5;
        search(matrix, key);
    }
}
