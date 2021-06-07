package searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//Time Complexity = O(n^2);
//Space Complexity = O(1);
//Restriction = No Restriction

public class LinearSearch {
    public static int linearSearch(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target)   return i;
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = {10,15,20,25,30,35,37,40};
        int target = Integer.parseInt(br.readLine());

        System.out.println(linearSearch(nums,target));
    }
}
