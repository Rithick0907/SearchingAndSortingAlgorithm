package searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearchIterative {
    public static int binarySearch(int[] nums,int target,int start,int end){
        while(start <= end){
            int middle = (start + end) / 2;

            if(nums[middle] == target)  return middle;
            else if(nums[middle] > target)  end = middle - 1;
            else start = middle + 1;
        }

        return -1;
    }

    public static int binarySearch(int[] nums,int target){
        return binarySearch(nums,target,0,nums.length-1);
    }

    public static void main(String[] args) throws Exception {
        var br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = {10,15,20,25,30,35,37,40};
        int target = Integer.parseInt(br.readLine());

        System.out.println(binarySearch(nums,target));
    }
}
