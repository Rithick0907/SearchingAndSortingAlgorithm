package sorting;

import java.util.Arrays;
/*
Logic: At the end of each iteration, the next largest item bubble up & moves to it correct position.
Time Complexity : O(n^2)

*/
public class BubbleSort {
    private static void swap(int[] nums, int index1, int index2) {
        nums[index1] = nums[index1] ^ nums[index2];
        nums[index2] = nums[index1] ^ nums[index2];
        nums[index1] = nums[index1] ^ nums[index2];
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1])
                    swap(nums, j, j - 1);
            }
        }
    }

    public static void print(int[] nums) {
        System.out.println(Arrays.toString(nums));
    }
}
