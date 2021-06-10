package sorting;

import java.util.Arrays;

/*
Time Complexity : O(n^2)
Logic:
 1. It's like an inverse of Bubble Sort.
 2. Here instead of bubble up largest value to its correct position, we select smallest value and moves it to its correct position.
*/
public class SelectionSort {
    private static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex])
                    minIndex = j;
            }
            swap(nums,i,minIndex);
        }
    }

    public static void print(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }
}
