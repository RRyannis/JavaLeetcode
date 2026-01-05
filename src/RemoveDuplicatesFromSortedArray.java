public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        int readIndex = 1;
        for (readIndex = 1; readIndex < nums.length; readIndex++){
            if ( nums[readIndex] != nums[readIndex - 1]){
                nums[insertIndex] = nums[readIndex];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}
