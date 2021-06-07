package searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// Time Complexity = O(Math.sqrt(n)).
// Restriction : Input Array must be sorted.
// Note: Jump Search is Faster than Linear Search and Slower than Binary Search.
// Logic:
// 1. In Jump Search, we divide a array into block and instead of checking entire list we jump to the block where our target item exist.
// 2. Then, we do a linear search only in that block.
// Mathematically an ideal block size = Mah.sqrt(n).

public class JumpSearch {
    public static int jumpSearch(int[] nums, int target) {
        int blockSize = (int) Math.sqrt(nums.length);
        int start = 0;
        int next = blockSize;

        while(start < nums.length && nums[next - 1] < target){
            ++start;
            next += blockSize;
            if(next > nums.length)  next = nums.length;
        }

        for(int i = start; i < next; i++){
            if(nums[i] == target)   return i;
        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        var br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = {10, 15, 20, 25, 30, 35, 37, 40};
        int target = Integer.parseInt(br.readLine());

        System.out.println(jumpSearch(nums, target));
    }
}
