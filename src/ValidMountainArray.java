public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        int num1 = 0;
        int num2 = 1;
        if (arr.length >= 3){
            while (num2 < arr.length && arr[num1] < arr[num2]){
                num1++;
                num2++;
            }
            if (num1 == 0) return false;
            if (num2 == arr.length) return false;
            if (arr[num1] == arr[num2]) return false;
            while (num2 < arr.length && arr[num1] > arr[num2]){
                num1++;
                num2++;
            }
            return num2 == arr.length;
        } else {
            return false;
        }
    }
}
