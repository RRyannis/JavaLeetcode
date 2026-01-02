import java.util.Arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
