public class EvenNumberOfDigits {
    class Solution {
        public int findNumbers(int[] nums) {
            int evenDigitCount = 0;
            int res = 0;
            for (int i = 0; i < nums.length; i++){
                while (nums[i ]!= 0){
                    nums[i] /= 10 ;
                    res++;

                }
                if(res%2==0){
                    evenDigitCount++;
                }
                res = 0;
            }
            return evenDigitCount;
        }
    }
}
