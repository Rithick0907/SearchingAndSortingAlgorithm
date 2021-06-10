package searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Time Complexity = O(logi).
// Restriction : Input Array must be sorted.
// Logic:
// 1. In Exponential Search, we start with small range and see if the target item is there or not.
// 2. If not, then we double the range at each step.
// 3. Once we find the range where target item exist, we do binarySearch in that range.
// Note:  If you have N elements and if target is in the first sqrt(N) elements,
//        then exponential search will be faster, else binary search will be faster.

public class ExponentialSearch {
    public static int exponentialSearch(int[] nums, int target) {
        int bound = 1;
        while (bound < nums.length && nums[bound] < target)
            bound *= 2;

        int start = bound / 2;
        int end = Math.min(bound, nums.length);

        return BinarySearchIterative.binarySearch(nums, target, start, end);
    }
}
