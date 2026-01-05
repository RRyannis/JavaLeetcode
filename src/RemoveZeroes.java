public class RemoveZeroes {
    public void moveZeroes(int[] nums) {
        int writeIndex = 0;
        if (nums.length == 0 || nums == null) return;
        for (int readIndex = 0 ; readIndex < nums.length; readIndex++){
            if (nums[readIndex] != 0){
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }
        for (int i = writeIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
