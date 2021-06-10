package searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;


//Time Complexity = O(logn);
//Space Complexity = O(1);
//Restriction: Our Array must be sorted.

public class BinarySearchIterative {
    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int middle = (start + end) / 2;

            if (nums[middle] == target) return middle;
            else if (nums[middle] > target) end = middle - 1;
            else start = middle + 1;
        }

        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
}
