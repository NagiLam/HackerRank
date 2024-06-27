import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrayLength = Integer.parseInt(in.nextLine());
        String[] line = in.nextLine().split(" ");
        int[] array = Arrays.stream(line)
                            .mapToInt(Integer::parseInt)
                            .toArray();
        in.close();
        System.out.println(countNegativeSumArray(array));
    }

    public static int countNegativeSumArray(int[] array) {
        int count = 0;
        // Iterate through all possible starting points of subarrays
        for (int start = 0; start < array.length; start++) {
            int sum = 0;
            // Iterate through all possible ending points of subarrays starting from 'start'
            for (int end = start; end < array.length; end++) {
                sum += array[end];
                // Check if the current subarray sum is negative
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
