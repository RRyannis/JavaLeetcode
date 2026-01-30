import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

//TBA: there's a way to solve this in O(N) with a left, right and current pointer
public class FindAllDisappearingNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        int expected = 1;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == expected){
                expected++;
            } else if (nums[i] > expected){
                result.add(expected);
                expected++;
                i--;
            }
        }
        while (expected <= nums.length) {
            result.add(expected);
            expected++;
        }
        return result;
    }
}
