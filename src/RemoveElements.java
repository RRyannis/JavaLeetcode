public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int insertIndex = 0;
        int currentIndex = 0;
        for ( currentIndex = 0; currentIndex < nums.length; currentIndex++){
            if (nums[currentIndex] != val){
                nums[insertIndex] = nums[currentIndex];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}
