import java.util.*;

public class maxSubarray {
    public static void printSubarrays(int numbers[]) {
        int max_sum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        //  Calculate prefix array
        for (int i=0; i<numbers.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for (int i=0; i<numbers.length; i++) {
            int start = i;
            for (int j=i; j<numbers.length; j++) {
                int end = j;
                int curr_sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
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
