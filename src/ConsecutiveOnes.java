public class ConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i]==1){
                sum++;

            } else {
                maxSum = Math.max(maxSum, sum);
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}

