import java.util.*;

public class maxSubarray {
    public static void printSubarrays(int numbers[]) {
        int max_sum = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++) {
            int start = i;
            for (int j=i; j<numbers.length; j++) {
                int end = j;
                int curr_sum = 0;
                for (int k=start; k<=end; k++) {
                    curr_sum += numbers[k];
                }
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                }
            }
        }
        System.out.println("Maximum Sum = " + max_sum);
    }
    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        printSubarrays(nums);
    }
}