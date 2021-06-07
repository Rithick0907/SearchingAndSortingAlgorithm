package searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Time Complexity = O(log3n).
// Restriction : Input Array must be sorted.
// Note: Binary Search is Faster than Ternary Search.
// Reason 1: Ternary Search has more comparison than Binary Search.
// Reason 2: As we divide our array into more parts our algorithm gets slower.

public class TernarySearch {
    public static int ternarySearch(int[] nums, int target) {
        return ternarySearch(nums,target,0,nums.length - 1);
    }

    private static int ternarySearch(int[] nums, int target, int start, int end) {
        if(start > end)     return -1;

        int partitionSize = (end - start) / 3;
        int mid1 = start + partitionSize;
        int mid2 = end - partitionSize;

        if(target == nums[mid1])  return mid1;
        if(target == nums[mid2]) return mid2;

        else if(target < nums[mid1])    return ternarySearch(nums,target,start,mid1 - 1);
        else if(target > nums[mid2])  return ternarySearch(nums, target, mid2 + 1, end);

        else return ternarySearch(nums, target, mid1 + 1, mid2 - 1);
    }

    public static void main(String[] args) throws Exception {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = {10, 15, 20, 25, 30, 35, 37, 40};
        int target = Integer.parseInt(br.readLine());

        System.out.println(ternarySearch(nums, target));
    }
}
