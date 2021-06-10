package searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Time Complexity = O(logn);
//Space Complexity = O(logn);
//Restriction: Our Array must be sorted.

public class BinarySearch {

    private static int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int middle = (start + end) / 2;
        if (nums[middle] == target) return middle;
        else if (nums[middle] > target) return binarySearch(nums, target, start, middle - 1);
        else return binarySearch(nums, target, middle + 1, end);
    }

    public static int binarySearch(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
}
