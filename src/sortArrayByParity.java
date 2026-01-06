public class sortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        if (nums == null) return null;
        int writeIndex = 0;
        int readIndex = nums.length - 1;
        while (writeIndex < readIndex){
            if (nums[writeIndex] % 2 == 0){
                writeIndex++;
            } else if (nums[readIndex] % 2 != 0){
                readIndex--;
            } else if (nums[writeIndex] % 2 !=0 && nums[readIndex] % 2 == 0){
                int temp = nums[writeIndex];
                nums[writeIndex] = nums[readIndex];
                nums[readIndex] = temp;
            }
        }
        return nums;
    }
}

