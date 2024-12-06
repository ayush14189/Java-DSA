import java.util.Arrays;
import java.util.Collections;

public class inbuilt {

    public static void printArr1(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArr2(Integer arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr1[] = {5,3,7,6,3};
        Integer arr2[] = {4,2,7,5,8};
        Arrays.sort(arr1, 1, 4);
        Arrays.sort(arr2, 1, 4, Collections.reverseOrder());
        printArr1(arr1);
        printArr2(arr2);
    }
}
