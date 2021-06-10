import sorting.SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[] nums = {20, 27, 10, 20, 66, 100, 1, 15};
        SelectionSort.sort(nums);
        SelectionSort.print(nums);
    }
}
