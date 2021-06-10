package searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Time Complexity = O(n^2);
//Space Complexity = O(1);
//Restriction = No Restriction

public class LinearSearch {
    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }

        return -1;
    }
}
