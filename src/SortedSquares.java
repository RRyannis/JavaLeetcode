import java.util.Arrays;
//TBA: there's a way to solve this in O(N) with a left, right and current pointer
public class SortedSquares {
    public static int[] sortedSquares(int[] nums) {
//        for (int i = 0; i < nums.length; i++){
//            nums[i] = nums[i]*nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
        int[] result = new int[nums.length];
        int right, left, current;
        left = 0;
        right = result.length-1;
        current = result.length-1;
        while ( left <= right ){
            if ( nums[left]*nums[left] > nums[right]*nums[right]){
                result[current] = nums[left]*nums[left];
                left++;
            } else {
                result[current] =nums[right]*nums[right];
                right--;
            }
            current--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-5, -3, 0, 1, 10};
        System.out.println(sortedSquares(nums));
    }
}


